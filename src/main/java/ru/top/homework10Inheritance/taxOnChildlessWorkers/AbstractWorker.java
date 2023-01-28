package ru.top.homework10Inheritance.taxOnChildlessWorkers;

public abstract class AbstractWorker {
    protected String fio;
    protected TaxType taxType;
    protected Integer kids;

    public AbstractWorker(String fio, TaxType taxType, Integer kids) {
        this.fio = fio;
        this.taxType = taxType;
        this.kids = kids;
    }

    protected abstract int getPaidAfterTax();

    protected abstract int getPaidBeforeTax();
    protected abstract int getAmountOfChildren();


    public Integer getKids() {
        return kids;
    }

    public void setKids(Integer kids) {
        this.kids = kids;

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public TaxType getTaxType() {
        return taxType;
    }

    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }

    @Override
    public String toString() {
        return "\t" + fio + "\t\t\t\s" + taxType.getMeaning()
                + "\t\t\t\t\t\t" + getPaidBeforeTax() + "\t\t\t\t\t\t"
                + getPaidAfterTax() + "\t\t\t\t\t\t" + getAmountOfChildren();
    }
}
