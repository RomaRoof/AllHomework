package ru.top.homework10Inheritance.workerPaymentType;
//������� 1
//�����������, � �������������� ����� ������� ��� ������� ������ �������� ���������� ����� ����������� ��������� �����.
//�� ����� ���� ��������� �������� ������ �����:
// ������ � �����������, ������� ��������� �������� ��
//������� ����; ��� ������� ���������� ������������,
//������� ���� �� ��������� � ������;
// ��������� � �����������, ������� ��������� �������� �
//���, ��� ������� ����������; ������������, ������� �����
//�� ��������� � ������
// �������� � �����������, ������� ��������� ������� ��
//����������� ������; ��� ������� ���������� ������������
//����� ��� ������ ������, ��� �� ����� ������� �� �����.
//��������� ������ ����� �������� ����� �� ���� ����������� ����� � ���������� ����� � ����:
//��� ��� ������ �����
//������ ������ 3000 ���
//������� ��������� 800 ���
//������ �������� 5500 ���
//����� 9300 ���

public class WorkerTestRun {
    public static void main(String[] args) {
        AbstractWorker[] abstractWorkers = new AbstractWorker[3];
        HourWorker hourWorker = new HourWorker("������ �. �.", SalaryType.HOUR, 1500, 15);
        BetWorker betWorker = new BetWorker("������� �. �.", SalaryType.BET, 4300, 20);
        PieceworkWorker pieceworkWorker = new PieceworkWorker("��������� �. �.", SalaryType.PIECEWORK, 700);
        abstractWorkers[0] = betWorker;
        abstractWorkers[1] = hourWorker;
        abstractWorkers[2] = pieceworkWorker;

        int sum = 0;
        System.out.println("���   ��� ������   �����");
        for (AbstractWorker abstractWorker : abstractWorkers) {
            sum += abstractWorker.getSalary();
            System.out.println(abstractWorker);
        }
        System.out.printf("�����: %s", sum);
    }

}
