package ru.top.homework9.Task4Encapsulation;

//������� 4
//������� ������� ����� MainString (������). ������������ ���� ������:
//������ ��������;
//�������� ���� int ������ ����� ������ � ��������.
//����������� ������������ ������ ���������� ����������:
//����������� ��� ����������;
//�����������, ����������� � �������� ��������� ��������� �������;
//�����������, ����������� � �������� ��������� ������;
//����� ��������� ����� ������;
//����� ������� ������ (������ ������ ������);
//����� ������ ������� � ������.
public class MainString {
    private char [] arrayChar;
    private int lengthSymbol;

    public MainString() {
    }

   private MainString(String lit){
       lengthSymbol = lit.length();
    }

    public MainString(char symbol) {
        arrayChar = new char[]{symbol};
    }
    public void Clear(){
        String line = String.valueOf(arrayChar);
        line = "";
        lengthSymbol = 0;
    }


    public static void main(String[] args) {

    }
}

