package ru.top.homework7;

//Задание 1
//        Написать и протестировать методы работы с квадратными матрицами (матрицы представить в виде двухмерных
//        массивов).
//        Должны присутствовать методы:
//        ? создания единичной (диагональной) матрицы;
//        ? создания нулевой матрицы;
//        ? сложение матриц;
//        ? умножения матриц;
//        ? умножение матрицы на скаляр;
//        ? определение детерминанта матрицы;
//        ? вывод матрицы на консоль
public class Task1 {

    public static void main(String[] args) {
        matrixMultiplication();
    }

    public static void identityMatrix() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void nullMatrix() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++) {
                if (i == j || i == x) arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void sumMatrix() {
        int[][] array = {{9,8},{7,6},{2,2}};
        int[][] array2 = {{1,2},{3,4},{5,6}};
        System.out.println("Сумма матриц: ");
        int [][] sumArray = new int[2][2];
        for (int i = 0; i < sumArray.length; i++) {

            for (int j = 0; j < sumArray.length; j++) {

                sumArray[i][j] = array[i][j] + array2[i][j];
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public  static  void matrixMultiplication(){
        int[][] array = {{9,8},{7,6},{2,2}};
        int[][] array2 = {{1,2},{3,4},{5,6}};
        int m = array.length;
        int n = array2[0].length;
        int o = array2.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += array[i][k] * array2[k][j];
                }
            }
        }

        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", re[j]);
            }
            System.out.println();
        }
    }

}
