package ru.top.homework4;

//����������� ���� ���������� ����� � ������� �� 00:00
//�� 23:59. �������� ���������, ������� ������� �� �������
//������� ��� �� ����� ��������� ���, ��� ����� �� ���������
//������������ ������������ ���������� ��� ���, ��� ������ �� ��������� (��������, 02:20, 11:11 ��� 15:51). �������
//�� ����� ��� ������������ ����������. ������� �����
//����� ����������.

public class Task8 {
    public static void main(String[] args) {
        int numberOfCombinations = 0;
        for (int hour = 0; hour <= 23; hour++) {
            for (int minut = 0; minut <= 59; minut++) {
                if (hour % 10 == minut / 10 && hour / 10 == minut % 10) {
                    System.out.printf("%02d:%02d\n", hour, minut);
                    numberOfCombinations++;
                }
            }
        }
        System.out.printf("����� ����� ����������: %s\n", numberOfCombinations);
    }

}
