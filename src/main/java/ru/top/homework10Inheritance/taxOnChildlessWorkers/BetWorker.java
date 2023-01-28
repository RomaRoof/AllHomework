package ru.top.homework10Inheritance.taxOnChildlessWorkers;

import java.util.Objects;

public class BetWorker extends AbstractWorker {

    private Integer sumSalary;
    private final Integer TAX_ON_KIDS = 5;

    public BetWorker(String fio, TaxType taxType, Integer kids, Integer sumSalary ) {
        super(fio, taxType, kids);
        this.sumSalary = sumSalary;
    }


    @Override
    public TaxType getTaxType() {
        return super.getTaxType();
    }


    @Override
    protected int getPaidAfterTax() {
        if (getKids() == 0) {
            sumSalary = sumSalary * (80 - TAX_ON_KIDS) / 100;
            return sumSalary;
        } else {
            return sumSalary * 80 / 100;
        }
    }

    @Override
    protected int getPaidBeforeTax() {
        return sumSalary;
    }

    @Override
    protected int getAmountOfChildren() {
        if (getKids() !=0){
            return 0;
        }else {
            return TAX_ON_KIDS;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetWorker betWorker = (BetWorker) o;
        return Objects.equals(sumSalary, betWorker.sumSalary);
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
