package ru.top.homework10Inheritance.workerPaymentType;

import java.util.Objects;

public class HourWorker extends AbstractWorker {

    private Integer hourSalary;
    private Integer hourCount;

    public HourWorker(String fio, SalaryType salaryType, Integer hourSalary, Integer hourCount) {
        super(fio, salaryType);
        this.hourSalary = hourSalary;
        this.hourCount = hourCount;
    }

    public Integer getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(Integer hourSalary) {
        this.hourSalary = hourSalary;
    }

    public Integer getHourCount() {
        return hourCount;
    }

    public void setHourCount(Integer hourCount) {
        this.hourCount = hourCount;
    }

    @Override
    protected int getSalary() {
        return hourSalary*hourCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourWorker that = (HourWorker) o;
        return Objects.equals(hourSalary, that.hourSalary) && Objects.equals(hourCount, that.hourCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourSalary, hourCount);
    }
}
