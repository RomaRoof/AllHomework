package ru.top.homework1;

import java.util.Scanner;

public class ageAndName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ��� ��������: ");
        String name = scanner.nextLine();
        System.out.print("������� ������� ��������: ");
        int age = scanner.nextInt();
        System.out.printf("�������� ����� %s ��� ������� %s", name, age);
//      ��-��������, ��� ������������� ��������� �������� ���� �� �������� if - else if - else, �� �� � ���� �������
    }
}
