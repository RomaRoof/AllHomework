package ru.top.homework2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("¬ведите сумму вклада: ");
        double deposit = scanner.nextDouble();
        System.out.print("¬ведите проценты по вкладу: ");
        double present = scanner.nextDouble();
        int year = 2;
        double totalDeposit = (deposit*present)*2;
        System.out.println(totalDeposit);
    }
}
