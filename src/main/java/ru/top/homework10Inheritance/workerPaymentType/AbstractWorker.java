package ru.top.homework10Inheritance.workerPaymentType;

public abstract class AbstractWorker {
    protected String fio;
    protected SalaryType salaryType;

    public AbstractWorker(String fio, SalaryType salaryType) {
        this.fio = fio;
        this.salaryType = salaryType;
    }

    protected abstract int getSalary();

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(SalaryType salaryType) {
        this.salaryType = salaryType;
    }

    @Override
    public String toString() {
        return fio + "\s" +
                salaryType.getDesc() +
                " " + getSalary();
    }
}
