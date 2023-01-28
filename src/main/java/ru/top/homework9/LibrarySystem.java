package ru.top.homework9;

//«адание 6
// ¬ библиотеке решили автоматизировать учет книг, выданных студентам.
// —тудент, дл€ того чтобы получить книгу, должен получить
// читательский билет, если не получал ранее. ¬ читательском
// билете содержитс€ информаци€:
// номер билета;
// фамили€ и им€ студента;
// номер группы.
// ѕри выдаче книги библиотекарь фиксирует в журнале:
// название и автора книги;
// номер билета, на который выдана книга;
// дата выдачи;
// на какое врем€ выдана книга (в сутках).
// ѕри приеме книги библиотекарь фиксирует в журнале:
// название и автора книги;
// номер билета студента, который вернул книгу;
// дата возврата.
// –азработать модель программы, котора€ бы позволила
// находить должников (студентов, не сдавших книгу воврем€).
public abstract class LibrarySystem {
    protected String bookAuthor;
    protected String nameOfTheBook;
    protected Integer idCard;
    protected Integer numberGroupStudent;
    protected String firstNameStudent;
    protected String lastNameStudent;

    public LibrarySystem(String bookAuthor, String nameOfTheBook) {
        this.bookAuthor = bookAuthor;
        this.nameOfTheBook = nameOfTheBook;
    }

    public LibrarySystem(Integer idCard) {
        this.idCard = idCard;

    }

    public LibrarySystem(Integer numberGroupStudent, String firstNameStudent, String lastNameStudent) {
        this.numberGroupStudent = numberGroupStudent;
        this.firstNameStudent = firstNameStudent;
        this.lastNameStudent = lastNameStudent;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public Integer getNumberGroupStudent() {
        return numberGroupStudent;
    }

    public void setNumberGroupStudent(Integer numberGroupStudent) {
        this.numberGroupStudent = numberGroupStudent;
    }

    public String getFirstNameStudent() {
        return firstNameStudent;
    }

    public void setFirstNameStudent(String firstNameStudent) {
        this.firstNameStudent = firstNameStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }
}
