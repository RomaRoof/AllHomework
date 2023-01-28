package ru.top.homework10Inheritance.workerPaymentType;
//Задание 1
//Разработать, и протестировать набор классов для решения задачи подсчета заработной платы сотрудников некоторой фирмы.
//На фирме есть несколько способов оплаты труда:
// ставка – указывается, сколько сотрудник получает за
//рабочий день; для каждого сотрудника записывается,
//сколько дней он отработал в месяце;
// почасовая – указывается, сколько сотрудник получает в
//час, для каждого сотрудника; записывается, сколько часов
//он отработал в месяце
// сдельная – указывается, сколько сотрудник получит за
//выполненную работу; для каждого сотрудника записываются
//суммы для каждой работы, что он успел сделать за месяц.
//Программа должна уметь выводить отчет по всем сотрудникам фирмы о заработной плате в виде:
//ФИО Вид оплаты Сумма
//Иванов ставка 3000 грн
//Сидоров почасовая 800 грн
//Петров сдельная 5500 грн
//Итого 9300 грн

public class WorkerTestRun {
    public static void main(String[] args) {
        AbstractWorker[] abstractWorkers = new AbstractWorker[3];
        HourWorker hourWorker = new HourWorker("Петров В. А.", SalaryType.HOUR, 1500, 15);
        BetWorker betWorker = new BetWorker("Вкутчик Р. З.", SalaryType.BET, 4300, 20);
        PieceworkWorker pieceworkWorker = new PieceworkWorker("Невезукин В. С.", SalaryType.PIECEWORK, 700);
        abstractWorkers[0] = betWorker;
        abstractWorkers[1] = hourWorker;
        abstractWorkers[2] = pieceworkWorker;

        int sum = 0;
        System.out.println("ФИО   Вид оплаты   Сумма");
        for (AbstractWorker abstractWorker : abstractWorkers) {
            sum += abstractWorker.getSalary();
            System.out.println(abstractWorker);
        }
        System.out.printf("Итого: %s", sum);
    }

}
