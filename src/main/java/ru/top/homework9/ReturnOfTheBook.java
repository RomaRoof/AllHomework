package ru.top.homework9;

public class ReturnOfTheBook extends LibrarySystem{
    protected String returnMonthAndYearDate;
    protected Integer returnDay;

    public ReturnOfTheBook(String bookAuthor, String nameOfTheBook) {
        super(bookAuthor, nameOfTheBook);
    }

    public ReturnOfTheBook(Integer idCard,  Integer returnDay, String returnMonthAndYearDate) {
        super(idCard);
        this.returnMonthAndYearDate = returnMonthAndYearDate;
        this.returnDay = returnDay;
    }

    public String getReturnMonthAndYearDate() {
        return returnMonthAndYearDate;
    }

    public void setReturnMonthAndYearDate(String returnMonthAndYearDate) {
        this.returnMonthAndYearDate = returnMonthAndYearDate;
    }
}
