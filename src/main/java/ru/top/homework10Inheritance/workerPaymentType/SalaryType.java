package ru.top.homework10Inheritance.workerPaymentType;

public enum SalaryType {

    PIECEWORK ("��������"),
    BET("������"),
    HOUR("���������");


    private final String desc;

    SalaryType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
