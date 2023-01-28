package ru.top.homework10Inheritance.workerTax;

public enum TaxType {

    TAX_ON_PIECE_WORK(15),
    TAX_ON_OTHER_WORKS(20);



    private final Integer meaning;


    TaxType(Integer meaning) {
        this.meaning = meaning;
    }

    public Integer getMeaning() {
        return meaning;
    }
}
