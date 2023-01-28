package ru.top.homework10Inheritance.taxOnChildlessWorkers;
//Задание 3
//На основе предыдущего задания сделать новый отчет
//таким образом, что для сотрудников, у которых нет детей,
//ставка налога выше на 5%.

public class WorkerTaxTestRun {
    public static void main(String[] args) {
        AbstractWorker[] abstractWorkers = new AbstractWorker[3];
        HourWorker hourWorker = new HourWorker("Петров В. А.", TaxType.TAX_ON_OTHER_WORKS, 0, 5500);
        BetWorker betWorker = new BetWorker("Вкутчик Р. З.", TaxType.TAX_ON_OTHER_WORKS, 4, 4300);
        PieceworkWorker pieceworkWorker = new PieceworkWorker("Невезукин В. С.", TaxType.TAX_ON_PIECE_WORK, 0, 7000);
        abstractWorkers[0] = hourWorker;
        abstractWorkers[1] = betWorker;
        abstractWorkers[2] = pieceworkWorker;

        System.out.println("\tФИО\t\t\t\t\tналог в %(основной)\t\tСумма (всего)\t\tК выплате(с учетом налога)\t\tНалог на бездетность(%)");
        for (AbstractWorker abstractWorker : abstractWorkers) {
            System.out.println(abstractWorker);
        }
    }

}
