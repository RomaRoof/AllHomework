package ru.top.homework2;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        int pie = 1;
        double glass = 0.2;
        double packMilk = 0.9;
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���������� ��������������� :");
        int nStudent = scanner.nextInt();
        int percent30 = (int)(nStudent*0.6);
        int percent1 = (int)(nStudent*0.01);
        System.out.print("������� ��� �������������� :");
        int massStudent = scanner.nextInt();
        if (massStudent<30){
            int totalPackMilk = (int)Math.round(nStudent/(packMilk/glass));
            int totalPies = nStudent*pie*2;
            System.out.printf("��� ���� ��������, ��������� ����������� %d ������� ������ � %d ��������\n", totalPackMilk, totalPies);
            int totalPackMilk30 = (int)Math.round(percent30/(packMilk/glass));
            int totalPies30 = percent30*pie*2;
            System.out.printf("��� 30%% ��������, ������� ��� ���� 30 ��, ��������� ����������� %d ������� ������ � %d ��������\n", totalPackMilk30, totalPies30);
            int totalPackMilk1 = (int) Math.round(percent1/(packMilk/glass));
            int totalPies1 = percent1*pie*2;
            System.out.printf("��� 1%% ��������, ������� ��� ���� 30 ��, ��������� ����������� %d ������� ������ � %d ��������\n", totalPackMilk1, totalPies1);
            scanner.close();
        }else {
            System.out.println("������� ����� ���������� ��� � �������� ���� �������");
        }
    }
}

