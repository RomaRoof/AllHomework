package ru.top.homework9;

public class LoanOfBooks extends LibrarySystem {
    protected String monthAndYearOfIssue;

    protected  Integer dayOfIssue;

    protected Integer issuancePeriod;
    public LoanOfBooks(String bookAuthor, String nameOfTheBook) {
        super(bookAuthor, nameOfTheBook);
    }

    public LoanOfBooks(Integer idCard, String monthAndYearOfIssue, Integer issuancePeriod, Integer dayOfIssue) {
        super(idCard);
        this.monthAndYearOfIssue = monthAndYearOfIssue;
        this.issuancePeriod = issuancePeriod;
        this.dayOfIssue = dayOfIssue;
    }

    @Override
    public String getNameOfTheBook() {
        return super.getNameOfTheBook();
    }

    @Override
    public String getBookAuthor() {
        return super.getBookAuthor();
    }

    @Override
    public Integer getIdCard() {
        return super.getIdCard();
    }

    @Override
    public Integer getNumberGroupStudent() {
        return super.getNumberGroupStudent();
    }

    @Override
    public String getFirstNameStudent() {
        return super.getFirstNameStudent();
    }

    @Override
    public String getLastNameStudent() {
        return super.getLastNameStudent();
    }

    public String getMonthAndYearOfIssue() {
        return monthAndYearOfIssue;
    }

    public void setMonthAndYearOfIssue(String monthAndYearOfIssue) {
        this.monthAndYearOfIssue = monthAndYearOfIssue;
    }

    public Integer getIssuancePeriod() {
        return issuancePeriod;
    }

    public void setIssuancePeriod(Integer issuancePeriod) {
        this.issuancePeriod = issuancePeriod;
    }

    public Integer getDayOfIssue() {
        return dayOfIssue;
    }

    public void setDayOfIssue(Integer dayOfIssue) {
        this.dayOfIssue = dayOfIssue;
    }
}
