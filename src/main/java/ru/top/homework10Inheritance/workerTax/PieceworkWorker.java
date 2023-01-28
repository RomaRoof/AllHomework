package ru.top.homework10Inheritance.workerTax;

import java.util.Objects;

//�������� � �����������, ������� ��������� ������� ��
//����������� ������; ��� ������� ���������� ������������
//����� ��� ������ ������, ��� �� ����� ������� �� �����.
public class PieceworkWorker extends AbstractWorker {
    private Integer sumSalary;

    public PieceworkWorker(String fio, TaxType taxType, Integer sumSalary) {
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
        return sumSalary * 85 / 100;
    }

    @Override
    protected int getPaidBeforeTax() {
        return sumSalary;
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
}
