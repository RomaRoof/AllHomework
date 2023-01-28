package ru.top.homework5;

import java.util.Arrays;
import java.util.Scanner;

//Заполнить массив размерности n случайными цифрами от 0 до 33. Найти элемент массива, который делится
//без остатка на значение элемента слева и значение элемента справа. Вывести на консоль значения исходного массива.
//Вывести индекс найденного элемента, если такой не найден,
//вывести -1. n – задается с клавиатуры.

public class Solution {

    public static void main(String[] args) {

        System.out.println("Введите длину массива");
        int length = new Scanner(System.in).nextInt();
        int[] array = new int[length];

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 34);

            if (i > 1) {
                int left = array[i - 2];
                int middle = array[i - 1];
                int right = array[i];

                if (left == 0 || right == 0) {
                    continue;
                }
                if (middle % right == 0 && middle % left == 0) {
                    isFound = true;
                    System.out.printf("Индекс: %d, значение: %d\n", (i - 1), middle);
                }
            }
        }

        if (!isFound) {
            System.out.println(-1);
        }

        System.out.println(Arrays.toString(array));
    }
}