package ru.top.homework9;

public class Journal {
    public static void main(String[] args) {
    LoanOfBooks bookInformation = new LoanOfBooks("����������� �. �.", "������������ � ���������");
    LoanOfBooks readerInformation = new LoanOfBooks(123,".02.2021",30, 30);
    ReturnOfTheBook returnedInformationBook = new ReturnOfTheBook("����������� �. �.", "������������ � ���������");
    ReturnOfTheBook informationAboutReader = new ReturnOfTheBook(123, 21, ".04.21");

    }
}
