package ru.top.homework2;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        int pie = 1;
        double glass = 0.2;
        double packMilk = 0.9;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество первоклассников :");
        int nStudent = scanner.nextInt();
        int percent30 = (int)(nStudent*0.6);
        int percent1 = (int)(nStudent*0.01);
        System.out.print("Введите вес первоклассника :");
        int massStudent = scanner.nextInt();
        if (massStudent<30){
            int totalPackMilk = (int)Math.round(nStudent/(packMilk/glass));
            int totalPies = nStudent*pie*2;
            System.out.printf("Для всех учащихся, ежедневно потребуется %d пакетов молока и %d пирожков\n", totalPackMilk, totalPies);
            int totalPackMilk30 = (int)Math.round(percent30/(packMilk/glass));
            int totalPies30 = percent30*pie*2;
            System.out.printf("Для 30%% учащихся, имеющих вес ниже 30 кг, ежедневно потребуется %d пакетов молока и %d пирожков\n", totalPackMilk30, totalPies30);
            int totalPackMilk1 = (int) Math.round(percent1/(packMilk/glass));
            int totalPies1 = percent1*pie*2;
            System.out.printf("Для 1%% учащихся, имеющих вес ниже 30 кг, ежедневно потребуется %d пакетов молока и %d пирожков\n", totalPackMilk1, totalPies1);
            scanner.close();
        }else {
            System.out.println("Ученики имеют нормальный вес и получают один пирожок");
        }
    }
}

