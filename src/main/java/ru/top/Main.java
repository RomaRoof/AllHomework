package ru.top;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> l1 = new ArrayList<>();
        while (true) {
            String current = in.nextLine();
            if (current.equals("printList")) break;
            l1.add(current);//list список всех команд
        }
        String[][] arrcom = new String[l1.size()][];//массив из строк как бы
        for (int i = 0; i < l1.size(); i++) {
            String[] k = l1.get(i).split(" "); //двумерый массив
            arrcom[i] = k; // разделяем строку по пробелам и засовываем в
        }
        //считали сreate  и создали массив данной длинны и пото этот массив будем изменять
        int n = Integer.parseInt(arrcom[0][1]);//длинна списка
        List<Integer> arr = new ArrayList<>(); // список для изменений
        for (int i = 0; i < n; i++) {
            arr.add(i, i + 1);
        }//заплнии список
        // бежим по всему массиву и смотрим что надо сделать
        for (int i = 1; i < arrcom.length; i++) {// бежим по командам

            if (arrcom[i][0].equals("remove"))
                arr.remove(Integer.parseInt(arrcom[i]
                        [1]));//удаляет
            if ((arrcom[i].length == 2) & (arrcom[i][0].equals("add")))
                arr.add(Integer.parseInt(arrcom[i][1]));//добавляем
            if ((arrcom[i].length == 3) & (arrcom[i][0].equals("add")))
                arr.add((Integer.parseInt(arrcom[i][1])), Integer.parseInt(arrcom[i]
                        [2]));
            if ((arrcom[i][0].equals("set")))
                arr.set((Integer.parseInt(arrcom[i][1])), Integer.parseInt(arrcom[i]
                        [2]));
        }

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}