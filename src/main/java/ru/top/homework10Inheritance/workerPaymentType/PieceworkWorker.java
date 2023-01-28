package ru.top.homework10Inheritance.workerPaymentType;

import java.util.Objects;

//сдельная – указывается, сколько сотрудник получит за
//выполненную работу; для каждого сотрудника записываются
//суммы для каждой работы, что он успел сделать за месяц.
public class PieceworkWorker extends AbstractWorker {
    private Integer pieceworkSalary;
    private final Integer PIECEWORK_MONTH = 30;

    public PieceworkWorker(String fio, SalaryType salaryType, Integer pieceworkSalary) {
        super(fio, salaryType);
        this.pieceworkSalary = pieceworkSalary;
    }

    public Integer getPieceworkSalary() {
        return pieceworkSalary;
    }

    public Integer getPIECEWORK_MONTH() {
        return PIECEWORK_MONTH;
    }

    @Override
    protected int getSalary() {
        return pieceworkSalary*PIECEWORK_MONTH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PieceworkWorker that)) return false;
        return Objects.equals(pieceworkSalary, that.pieceworkSalary) && Objects.equals(PIECEWORK_MONTH, that.PIECEWORK_MONTH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceworkSalary, PIECEWORK_MONTH);
    }
}
