package ru.top.homework10Inheritance.taxOnChildlessWorkers;
//������� 3
//�� ������ ����������� ������� ������� ����� �����
//����� �������, ��� ��� �����������, � ������� ��� �����,
//������ ������ ���� �� 5%.

public class WorkerTaxTestRun {
    public static void main(String[] args) {
        AbstractWorker[] abstractWorkers = new AbstractWorker[3];
        HourWorker hourWorker = new HourWorker("������ �. �.", TaxType.TAX_ON_OTHER_WORKS, 0, 5500);
        BetWorker betWorker = new BetWorker("������� �. �.", TaxType.TAX_ON_OTHER_WORKS, 4, 4300);
        PieceworkWorker pieceworkWorker = new PieceworkWorker("��������� �. �.", TaxType.TAX_ON_PIECE_WORK, 0, 7000);
        abstractWorkers[0] = hourWorker;
        abstractWorkers[1] = betWorker;
        abstractWorkers[2] = pieceworkWorker;

        System.out.println("\t���\t\t\t\t\t����� � %(��������)\t\t����� (�����)\t\t� �������(� ������ ������)\t\t����� �� �����������(%)");
        for (AbstractWorker abstractWorker : abstractWorkers) {
            System.out.println(abstractWorker);
        }
    }

}
