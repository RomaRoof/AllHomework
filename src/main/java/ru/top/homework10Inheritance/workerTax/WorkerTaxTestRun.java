package ru.top.homework10Inheritance.workerTax;
//������� 2
//��� ����������� ������� ������� ����� � ������ �������. ��� �����������, ������� �� ������ � ��������� ������
//� ����� 20%.
//��� ����������� �� �������� ������� ����� � 15%.
//��������� ������ ����� �������� ����� �� ���� ����������� ����� � ���������� ����� � ����:
//���      �����, %  ����� (���)      � ������ (���)
//������    20%        3000              2400
//�������   20%         800               640
//������    15%        5500              4675

public class WorkerTaxTestRun {
    public static void main(String[] args) {
        AbstractWorker[] abstractWorkers = new AbstractWorker[3];
        HourWorker hourWorker = new HourWorker("������ �. �.", TaxType.TAX_ON_OTHER_WORKS, 5500);
        BetWorker betWorker = new BetWorker("������� �. �.", TaxType.TAX_ON_OTHER_WORKS, 4300);
        PieceworkWorker pieceworkWorker = new PieceworkWorker("��������� �. �.", TaxType.TAX_ON_PIECE_WORK, 7000);
        abstractWorkers[0] = betWorker;
        abstractWorkers[1] = hourWorker;
        abstractWorkers[2] = pieceworkWorker;

        System.out.println("���    ����� � %      �����     � �������");
        for (AbstractWorker abstractWorker : abstractWorkers) {
            System.out.println(abstractWorker);
        }
    }
}
