package ru.top.homework10Inheritance.taxOnChildlessWorkers;

public enum TaxType {

    TAX_ON_PIECE_WORK("15"),
    TAX_ON_OTHER_WORKS("20");

    private final String meaning;

    TaxType(String meaning) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }
}
