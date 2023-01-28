package ru.top.homework10Inheritance.workerTax;

public abstract class AbstractWorker {
    protected String fio;
    protected TaxType taxType;

    public AbstractWorker(String fio, TaxType taxType) {
        this.fio = fio;
        this.taxType = taxType;
    }

    protected abstract int getPaidAfterTax();

    protected abstract int getPaidBeforeTax();

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
        return fio + "\s" +
                taxType.getMeaning() +
                " " + getPaidBeforeTax() + " " + getPaidAfterTax();
    }
}
