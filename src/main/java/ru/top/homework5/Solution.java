package ru.top.homework5;

import java.util.Arrays;
import java.util.Scanner;

//��������� ������ ����������� n ���������� ������� �� 0 �� 33. ����� ������� �������, ������� �������
//��� ������� �� �������� �������� ����� � �������� �������� ������. ������� �� ������� �������� ��������� �������.
//������� ������ ���������� ��������, ���� ����� �� ������,
//������� -1. n � �������� � ����������.

public class Solution {

    public static void main(String[] args) {

        System.out.println("������� ����� �������");
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
                    System.out.printf("������: %d, ��������: %d\n", (i - 1), middle);
                }
            }
        }

        if (!isFound) {
            System.out.println(-1);
        }

        System.out.println(Arrays.toString(array));
    }
}