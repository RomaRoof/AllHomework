package ru.top.homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� �������� � ������� �� �� ����, ��� �� ������ ���� ������� � �������� �� ���������� ���������:\n");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        if (day >= 21 && day <= 31 & month == 3 || day >= 1 && day <= 20 & month == 4) {
            System.out.println("����: ����");
        } else if (day >= 21 && day <= 30 & month == 4 || day >= 1 && day <= 21 & month == 5) {
            System.out.println("����: �����");
        } else if (day >= 22 && day <= 31 & month == 5 || day >= 1 && day <= 21 & month == 6) {
            System.out.println("����: ��������");
        } else if (day >= 22 && day <= 30 & month == 6 || day >= 1 && day <= 22 & month == 7) {
            System.out.println("����: ���");
        } else if (day >= 23 && day <= 31 & month == 7 || day >= 1 && day <= 21 & month == 8) {
            System.out.println("����: ���");
        } else if (day >= 22 && day <= 31 & month == 8 || day >= 1 && day <= 23 & month == 9) {
            System.out.println("����: ����");
        } else if (day >= 24 && day <= 30 & month == 9 || day >= 1 && day <= 23 & month == 10) {
            System.out.println("����: ����");
        } else if (day >= 24 && day <= 31 & month == 10 || day >= 1 && day <= 22 & month == 11) {
            System.out.println("����: ��������");
        } else if (day >= 23 && day <= 30 & month == 11 || day >= 1 && day <= 22 & month == 12) {
            System.out.println("����: �������");
        } else if (day >= 23 && day <= 31 & month == 12 || day >= 1 && day <= 20 & month == 1) {
            System.out.println("����: �������");
        } else if (day >= 21 && day <= 31 & month == 1 || day >= 1 && day <= 19 & month == 2) {
            System.out.println("����: �������");
        } else if (day >= 20 && day <= 28 & month == 2 || day >= 1 && day <= 20 & month == 3) {
            System.out.println("����: ����");
        } else {
            System.out.println("�� ���������� ���� ��� �����, ��������� ����");
        }
        switch (year % 12) {
            case 0 -> System.out.println("���: ��������");
            case 1 -> System.out.println("���: ������");
            case 2 -> System.out.println("���: ������");
            case 3 -> System.out.println("���: ������");
            case 4 -> System.out.println("���: �����");
            case 5 -> System.out.println("���: ����");
            case 6 -> System.out.println("���: �����");
            case 7 -> System.out.println("���: �������");
            case 8 -> System.out.println("���: �������");
            case 9 -> System.out.println("���: ����");
            case 10 -> System.out.println("���: ������");
            case 11 -> System.out.println("���: ����");
            default -> System.out.println("�� ��������� ������ ���, ��������� ����");
        }
    }
}
