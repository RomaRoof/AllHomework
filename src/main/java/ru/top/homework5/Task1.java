package ru.top.homework5;


//��������� ������ �� 15 ��������� ������� ���������.
//������� �� ������� ������ ������ �������� �������.
public class Task1 {
    public static void main(String[] args) {
        int[] arrayFibonacci = new int[15];
        for (int currentNumber = 0; currentNumber < arrayFibonacci.length; currentNumber++) {
            if (currentNumber < 2) {
                arrayFibonacci[currentNumber] = 1;
            } else {
                arrayFibonacci[currentNumber] = arrayFibonacci[currentNumber - 2] + arrayFibonacci[currentNumber - 1];
            }
            if (arrayFibonacci[currentNumber] % 2 == 0){
                System.out.println(arrayFibonacci[currentNumber]);
            }
        }
    }
}
