package ru.top.homework10Inheritance.workerTax;
//Задание 2
//Для предыдущего задания вывести отчет с учетом налогов. Для сотрудников, которые на ставке и почасовой оплате
//– налог 20%.
//Для сотрудников со сдельной оплатой труда – 15%.
//Программа должна уметь выводить отчет по всем сотрудникам фирмы о заработной плате в виде:
//ФИО      Налог, %  Сумма (грн)      К оплате (грн)
//Иванов    20%        3000              2400
//Сидоров   20%         800               640
//Петров    15%        5500              4675

public class WorkerTaxTestRun {
    public static void main(String[] args) {
        AbstractWorker[] abstractWorkers = new AbstractWorker[3];
        HourWorker hourWorker = new HourWorker("Петров В. А.", TaxType.TAX_ON_OTHER_WORKS, 5500);
        BetWorker betWorker = new BetWorker("Вкутчик Р. З.", TaxType.TAX_ON_OTHER_WORKS, 4300);
        PieceworkWorker pieceworkWorker = new PieceworkWorker("Невезукин В. С.", TaxType.TAX_ON_PIECE_WORK, 7000);
        abstractWorkers[0] = betWorker;
        abstractWorkers[1] = hourWorker;
        abstractWorkers[2] = pieceworkWorker;

        System.out.println("ФИО    налог в %      Сумма     К выплате");
        for (AbstractWorker abstractWorker : abstractWorkers) {
            System.out.println(abstractWorker);
        }
    }
}
