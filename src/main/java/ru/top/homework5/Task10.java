package ru.top.homework5;

import java.util.Arrays;
import java.util.Scanner;

//��������� ������ ����������� n ���������� ������� �� 0 �� 33. ����� ������� �������, ������� �������
//��� ������� �� �������� �������� ����� � �������� �������� ������. ������� �� ������� �������� ��������� �������.
//������� ������ ���������� ��������, ���� ����� �� ������,
//������� -1. n � �������� � ����������.

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �������");
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



