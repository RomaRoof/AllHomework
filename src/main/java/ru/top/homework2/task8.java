package ru.top.homework2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("������� ����� ������: ");
        double deposit = scanner.nextDouble();
        System.out.print("������� �������� �� ������: ");
        double present = scanner.nextDouble();
        int year = 2;
        double totalDeposit = (deposit*present)*2;
        System.out.println(totalDeposit);
    }
}
