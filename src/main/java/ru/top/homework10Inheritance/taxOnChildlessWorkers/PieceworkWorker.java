package ru.top.homework10Inheritance.taxOnChildlessWorkers;

import java.util.Objects;

public class PieceworkWorker extends AbstractWorker {
    private Integer sumSalary;
    private final Integer TAX_ON_KIDS = 5;

    public PieceworkWorker(String fio, TaxType taxType, Integer kids, Integer sumSalary) {
        super(fio, taxType, kids);
        this.sumSalary = sumSalary;
    }

    @Override
    protected int getPaidAfterTax() {
        if (super.kids == 0) {
            sumSalary = sumSalary * (85 - TAX_ON_KIDS) / 100;
            return sumSalary;
        } else {
            return sumSalary * 85 / 100;
        }
    }

    @Override
    protected int getPaidBeforeTax() {
        return sumSalary;
    }

    @Override
    protected int getAmountOfChildren() {
        if (getKids() != 0) {
            return 0;
        } else {
            return TAX_ON_KIDS;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PieceworkWorker that)) return false;
        return Objects.equals(sumSalary, that.sumSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumSalary);
    }

    public Integer getSumSalary() {
        return sumSalary;
    }

    public void setSumSalary(Integer sumSalary) {
        this.sumSalary = sumSalary;
    }

    public Integer getTAX_ON_KIDS() {
        return TAX_ON_KIDS;
    }
}
