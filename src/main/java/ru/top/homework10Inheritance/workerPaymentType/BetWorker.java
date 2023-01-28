package ru.top.homework10Inheritance.workerPaymentType;

import java.util.Objects;

public class BetWorker extends AbstractWorker{

    private Integer bet;
    private Integer dayCount;

    public BetWorker(String fio, SalaryType salaryType, Integer bet, Integer dayCount) {
        super(fio, salaryType);
        this.bet = bet;
        this.dayCount = dayCount;
    }

    public Integer getBet() {
        return bet;
    }

    public void setBet(Integer bet) {
        this.bet = bet;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    @Override
    protected int getSalary() {
        return dayCount*bet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetWorker betWorker = (BetWorker) o;
        return Objects.equals(bet, betWorker.bet) && Objects.equals(dayCount, betWorker.dayCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bet, dayCount);
    }
}
