package ru.top.homework12Collection.task1;

import java.util.*;

import static ru.top.homework12Collection.task1.ConsoleManagement.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.print("Введите набор чисел\n Для окончанию набора введите \"Stop\":\n");
        List<String> listOfUserElement = new ArrayList<>();
        for (int i = 1; i > 0; i++) {
            String userElement = scanner.next();
            if (!userElement.equals("Stop")) {
                listOfUserElement.add(userElement);
            } else {
                System.out.println("Ввод закончен");
                break;
            }
        }
        while (listOfUserElement.size() > 0) {
            System.out.println("Выберете дальнейшие действия:");
            System.out.printf("1 - %s\n2 - %s\n3 - %s\n4 - %s\n5 - %s\n", addElementForList, deleteElementOfList, showList, listCheck, replaceElementOfList);
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("Введите число которое хотите добавить в конец списка: ");
                    String addCurrentElement = scanner.next();
                    listOfUserElement.add(addCurrentElement);
                    System.out.println(listOfUserElement);
                }
                case 2 -> {
                    System.out.println("Введите число которое хотите удалит из списка");
                    String removeCurrentElement = scanner.next();
                    listOfUserElement.remove(removeCurrentElement);
                    System.out.println(listOfUserElement);
                }
                case 3 -> {
                    System.out.println("Текущее содержимое списка:");
                    System.out.println(listOfUserElement);
                }
                case 4 -> {
                    System.out.println("Введите число которое хотите найти:");
                    String elementSearch = scanner.next();
                    System.out.println("Поиск элемента в списке:");
                    if (listOfUserElement.contains(elementSearch)) {
                        System.out.printf("%s найден\n", elementSearch);
                    } else {
                        System.out.printf("%s не найден\n", elementSearch);
                    }
                }
                case 5 -> {
                    System.out.println("Введите значение которое хотите заменить ");
                    String elementBeforeReplacement = scanner.next();
                    if (listOfUserElement.contains(elementBeforeReplacement)) {
                        System.out.printf("%s - найден\n", elementBeforeReplacement);
                        System.out.println("Введите значение на которое надо заменить");
                        String replaceElement = scanner.next();
                        System.out.printf("Элемент %s успешно заменен на %s\n", listOfUserElement.set(listOfUserElement.indexOf(elementBeforeReplacement), replaceElement), replaceElement);
                    } else {
                        System.out.println("Ничего не найдено, попробуйте снова");
                    }

                }
            }
            System.out.println("Для продолжения работы нажмите \"Enter\"\nДля завершения работы программы введите \"Стоп\"\n");
            if (scanner.next().equals("Стоп")) {
                break;
            }
        }
    }

}
