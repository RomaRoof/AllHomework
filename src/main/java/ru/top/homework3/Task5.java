package ru.top.homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату рождения в формате ДД ММ ГГГГ, что бы узнать знак зодиака и животное по Китайскому календарю:\n");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        if (day >= 21 && day <= 31 & month == 3 || day >= 1 && day <= 20 & month == 4) {
            System.out.println("Знак: Овен");
        } else if (day >= 21 && day <= 30 & month == 4 || day >= 1 && day <= 21 & month == 5) {
            System.out.println("Знак: Телец");
        } else if (day >= 22 && day <= 31 & month == 5 || day >= 1 && day <= 21 & month == 6) {
            System.out.println("Знак: Близнецы");
        } else if (day >= 22 && day <= 30 & month == 6 || day >= 1 && day <= 22 & month == 7) {
            System.out.println("Знак: Рак");
        } else if (day >= 23 && day <= 31 & month == 7 || day >= 1 && day <= 21 & month == 8) {
            System.out.println("Знак: Лев");
        } else if (day >= 22 && day <= 31 & month == 8 || day >= 1 && day <= 23 & month == 9) {
            System.out.println("Знак: Дева");
        } else if (day >= 24 && day <= 30 & month == 9 || day >= 1 && day <= 23 & month == 10) {
            System.out.println("Знак: Весы");
        } else if (day >= 24 && day <= 31 & month == 10 || day >= 1 && day <= 22 & month == 11) {
            System.out.println("Знак: Скорпион");
        } else if (day >= 23 && day <= 30 & month == 11 || day >= 1 && day <= 22 & month == 12) {
            System.out.println("Знак: Стрелец");
        } else if (day >= 23 && day <= 31 & month == 12 || day >= 1 && day <= 20 & month == 1) {
            System.out.println("Знак: Козерог");
        } else if (day >= 21 && day <= 31 & month == 1 || day >= 1 && day <= 19 & month == 2) {
            System.out.println("Знак: Водолей");
        } else if (day >= 20 && day <= 28 & month == 2 || day >= 1 && day <= 20 & month == 3) {
            System.out.println("Знак: Рыбы");
        } else {
            System.out.println("Не корректный дата или месяц, повторите ввод");
        }
        switch (year % 12) {
            case 0 -> System.out.println("Год: Обезьяны");
            case 1 -> System.out.println("Год: Петуха");
            case 2 -> System.out.println("Год: Собаки");
            case 3 -> System.out.println("Год: Свиньи");
            case 4 -> System.out.println("Год: Крысы");
            case 5 -> System.out.println("Год: Быка");
            case 6 -> System.out.println("Год: Тигра");
            case 7 -> System.out.println("Год: Кролика");
            case 8 -> System.out.println("Год: Дракона");
            case 9 -> System.out.println("Год: Змеи");
            case 10 -> System.out.println("Год: Лошади");
            case 11 -> System.out.println("Год: Козы");
            default -> System.out.println("Не корректно введен год, повторите ввод");
        }
    }
}
