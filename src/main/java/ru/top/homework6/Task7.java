package ru.top.homework6;

import java.util.Scanner;

public class Task7 {
    //    ������������ ������ � ���������� ����� ������.
//    �������� � �������� ������ ��� ������� ����� ��
//    ���������, � ��������� � �� �������. ���� � ������ ������������ �����, �������� �� ������ ������������� �
//    ������� ��������� �� �������.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �����: ");
        String userText = scanner.nextLine();
        char[] arrayUserText = userText.toCharArray();
        for (int symbol = 0; symbol < arrayUserText.length; symbol++) {
            char caracter = arrayUserText[symbol];
            if (Character.isUpperCase(caracter)){
                arrayUserText[symbol] = Character.toLowerCase(caracter);
            }else {
                arrayUserText[symbol] = Character.toUpperCase(caracter);
            }
            
        }
        System.out.println(new String(arrayUserText));
    }
}
