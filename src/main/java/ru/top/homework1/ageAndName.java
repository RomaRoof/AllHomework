package ru.top.homework1;

import java.util.Scanner;

public class ageAndName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя человека: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст человека: ");
        int age = scanner.nextInt();
        System.out.printf("Человека зовут %s его возраст %s", name, age);
//      По-хорошему, для читабельности окончания возраста сюда бы добавить if - else if - else, но не в этом задании
    }
}
