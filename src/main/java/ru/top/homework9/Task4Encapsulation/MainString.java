package ru.top.homework9.Task4Encapsulation;

//Задание 4
//опишите базовый класс MainString (Строка). Обязательные поля класса:
//массив символов;
//значение типа int хранит длину строки в символах.
//Реализовать обязательные методы следующего назначения:
//конструктор без параметров;
//конструктор, принимающий в качестве параметра строковый литерал;
//конструктор, принимающий в качестве параметра символ;
//метод получения длины строки;
//метод очистки строки (делает строку пустой);
//метод поиска символа в строке.
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

