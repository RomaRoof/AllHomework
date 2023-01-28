package ru.top.homework10Inheritance.workerTax;

import java.util.Objects;

public class BetWorker extends AbstractWorker {

    private Integer sumSalary;

    public BetWorker(String fio, TaxType taxType, Integer sumSalary) {
        super(fio, taxType);
        this.sumSalary = sumSalary;
    }

    public Integer getSumSalary() {
        return sumSalary;
    }

    public void setSumSalary(Integer sumSalary) {
        this.sumSalary = sumSalary;
    }


    @Override
    protected int getPaidAfterTax() {
        return sumSalary * 80 / 100;
    }

    @Override
    protected int getPaidBeforeTax() {
        return sumSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetWorker betWorker = (BetWorker) o;
        return Objects.equals(sumSalary, betWorker.sumSalary);
    }
}
