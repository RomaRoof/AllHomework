package ru.top.homework14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class FileStreams {
    private final Map<Integer, Book> bookMap;
    private final Map<Integer, String> authors;

    public FileStreams() {
        this.bookMap = new HashMap<>();
        this.authors = new HashMap<>();
    }

    static class Book {
        Integer id;
        String title;
        Double price;
        Integer amount;
        String imagePath;
        Integer authorId;

        public Book(Integer id, String title, Double price, Integer amount, String imagePath, Integer authorId) {
            this.id = id;
            this.title = title;
            this.price = price;
            this.amount = amount;
            this.imagePath = imagePath;
            this.authorId = authorId;
        }
    }

    public void readAndWriteFile() {
        try (BufferedReader readerAuthor = new BufferedReader(new FileReader("csv/author.csv"));
             BufferedReader readerBook = new BufferedReader(new FileReader("csv/book.csv"))) {
            readerAuthor.readLine();
            readerAuthor.lines().forEach(line -> {
                String[] words = line.split(",");
                Integer id = Integer.parseInt(words[0]);
                String authorName = words[1];
                authors.put(id, authorName);
            });

            readerBook.readLine();
            readerBook.lines().forEach(book -> {
                book = book.replaceAll("\\?|, |\"|:", "");
                String[] words = book.split(",");
                Integer id = Integer.parseInt(words[0]);
                String title = words[1];
                Double price = Double.parseDouble(words[2]);
                Integer amount = Integer.parseInt(words[3]);
                String imagePath = words[4];
                Integer authorId = Integer.valueOf(words[5]);
                bookMap.put(authorId, new Book(id, title, price, amount, imagePath, authorId));
                String authorName = authors.get(authorId);
                try {
                    byte[] byteArray = Files.readAllBytes(Path.of("images/" + imagePath));
                    Files.write(Path.of("csv/result/%s - %s.jpeg".formatted(authorName, title)), byteArray);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

    }
}

