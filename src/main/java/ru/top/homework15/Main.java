package ru.top.homework15;

import ru.top.homework15.pojo.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeParser toList = new EmployeeParser("src/main/java/ru/top/homework15/employees.csv");
        System.out.printf("Средняя зарплата всех работников - %.2f\n", EmployeeParser.getAnAverageSalary());
        System.out.printf("Список работников имеющих зарплату ниже среднего уровня:\n%s\n", EmployeeParser.getBelowAverageSalary());
        System.out.printf("Список женщин имеющий квалификацию - Senior:\n%s\n", EmployeeParser.getFemaleSenior());
        System.out.printf("Медиана зарплат всех мужчин:\n%s\n", EmployeeParser.getMalesMedianSalary());
        System.out.printf("Медиана зарплат всех женщин:\n%s\n", EmployeeParser.getFemalesMedianSalary());
        System.out.printf("Список заплат женщин чья зарплата выше средней зарплаты мужчин, являющимися сеньорами:\n%s\n", EmployeeParser.getListSalaryFemalesFromAverageSalaryMalesLevelSenior());

    }
}
