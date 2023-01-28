package ru.top.homework5;

import java.util.Arrays;
import java.util.Scanner;

//Заполнить массив размерности n случайными цифрами от 0 до 33. Найти элемент массива, который делится
//без остатка на значение элемента слева и значение элемента справа. Вывести на консоль значения исходного массива.
//Вывести индекс найденного элемента, если такой не найден,
//вывести -1. n – задается с клавиатуры.

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            array[currentIndex] = (int) (Math.random() * 34);
            if (array[currentIndex+3]% array[currentIndex+2] == 0 & array[currentIndex+2]% array[currentIndex+3]==0){
                System.out.printf("%d", currentIndex);
            }
        }
        System.out.println(Arrays.toString(array));

    }
}



