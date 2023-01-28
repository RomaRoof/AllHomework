package ru.top.homework4;

//Электронные часы показывают время в формате от 00:00
//до 23:59. Написать программу, которая выведет на консоль
//сколько раз за сутки случается так, что слева от двоеточия
//показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
//на экран все симметричные комбинации. Вывести общее
//число комбинаций.

public class Task8 {
    public static void main(String[] args) {
        int numberOfCombinations = 0;
        for (int hour = 0; hour <= 23; hour++) {
            for (int minut = 0; minut <= 59; minut++) {
                if (hour % 10 == minut / 10 && hour / 10 == minut % 10) {
                    System.out.printf("%02d:%02d\n", hour, minut);
                    numberOfCombinations++;
                }
            }
        }
        System.out.printf("Общее число комбинаций: %s\n", numberOfCombinations);
    }

}
