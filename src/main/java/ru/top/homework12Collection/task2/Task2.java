package ru.top.homework12Collection.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static ru.top.homework12Collection.task2.Management.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> loginPassword = new HashMap<>();
        loginPassword.put("Roma", "roMa_rus86 - 11xx23");
        loginPassword.put("Andrey", "AndrE - 2x3vv4q@");
        System.out.println("Состояние текущей карты:");
        for(Map.Entry<String, String> item : loginPassword.entrySet()){
            System.out.printf("Пользователь: %s -> Логин - пароль: %s \n", item.getKey(), item.getValue());
        }
        while (loginPassword.isEmpty() || loginPassword.size() <= 16) {
            System.out.printf("Выберите действие:\n 1 - %s\n 2 - %s\n 3 - %s\n",
                    addNewUser, deleteExistingUser, exitFromTheProgram);
            String value = scanner.next();
            if (value.equals("1")) {
                System.out.println("Введите логин и пароль нового пользователя");
                loginPassword.put(scanner.next(), scanner.next());
                System.out.println("Состояние текущей карты: ");
                for(Map.Entry<String, String> item : loginPassword.entrySet()){
                    System.out.printf("Пользователь: %s -> Логин - пароль: %s \n", item.getKey(), item.getValue());
                }
            } else if (value.equals("2")) {
                System.out.println("Введите имя пользователя который необходимо удалить");
                loginPassword.remove(scanner.next());
                System.out.println("Состояние текущей карты: ");
                for(Map.Entry<String, String> item : loginPassword.entrySet()){
                    System.out.printf("Пользователь: %s -> Логин - пароль: %s \n", item.getKey(), item.getValue());
                }
            } else if (value.equals("3")) {
                scanner.close();
                break;
            }
        }
    }

}
