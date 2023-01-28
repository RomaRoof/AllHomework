package ru.top.homework15;

import ru.top.homework15.pojo.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeParser {
    private static final List<Employee> employeeList = new ArrayList<>();

    public EmployeeParser(String fileName) {
        try (BufferedReader readEmployee = new BufferedReader(new FileReader(fileName))) {
            readEmployee.readLine();
            String line;
            while ((line = readEmployee.readLine()) != null) {
                String[] words = line.split(", ");
                String firstName = words[0];
                String lastName = words[1];
                String age = words[2];
                String gender = words[3];
                String level = words[4];
                String salary = words[5];
                employeeList.add(new Employee(firstName, lastName, age, gender, level, salary));
//                System.out.printf("%s %s : возраст - %s; пол - %s; должность - %s; з/п - %s\n", firstName, lastName,
//                        age, gender, level, salary);
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public static double getAnAverageSalary() {
        return employeeList.stream()
                .mapToDouble(salary -> Double.parseDouble(salary.getSalary().replaceAll(",", ".")))
                .average()
                .orElseThrow();
    }

    public static List<Employee> getBelowAverageSalary() {
        return employeeList.stream()
                .filter(belowAverageSalary -> (Double.parseDouble(belowAverageSalary.getSalary()
                        .replaceAll(",", "."))) < getAnAverageSalary())
                .collect(Collectors.toList());
    }

    public static List<Employee> getFemaleSenior() {
        return employeeList.stream()
                .filter(female -> female.getGender().equals("FEMALE"))
                .filter(senior -> senior.getLevel().equals("SENIOR"))
                .toList();
    }

    public static double getMalesMedianSalary() {
        List<Double> sortMale = employeeList.stream()
                .filter(male -> male.getGender().equals("MALE"))
                .mapToDouble(salary -> Double.parseDouble(salary.getSalary().replaceAll(",", ".")))
                .sorted()
                .boxed()
                .toList();
        return sortMale.stream()
                .mapToDouble(salary -> salary.doubleValue())
                .skip((sortMale.size() - 1) / 2)
                .limit(sortMale.size() % 2 == 0 ? 2 : 1)
                .average()
                .orElseThrow();
    }

    public static double getFemalesMedianSalary() {
        List<Double> sortFemale = employeeList.stream()
                .filter(female -> female.getGender().equals("FEMALE"))
                .mapToDouble(salary -> Double.parseDouble(salary.getSalary().replaceAll(",", ".")))
                .sorted()
                .boxed()
                .toList();
        return sortFemale.stream()
                .mapToDouble(salary -> salary.doubleValue())
                .skip((sortFemale.size() - 1) / 2)
                .limit(sortFemale.size() % 2 == 0 ? 2 : 1)
                .average()
                .orElseThrow();
    }
    public  static List<Employee> getListSalaryFemalesFromAverageSalaryMalesLevelSenior (){
        double sortMaleLevelSeniorAndGetAverageSalary =
                employeeList.stream()
                        .filter(male -> male.getGender().equals("MALE"))
                        .filter(senior -> senior.getLevel().equals("SENIOR"))
                        .mapToDouble(salary -> Double.parseDouble(salary.getSalary().replaceAll(",", ".")))
                        .average()
                                .orElseThrow();

               return employeeList.stream()
                        .filter(female -> female.getGender().equals("FEMALE"))
                        .filter(salery -> Double.parseDouble(salery.getSalary().replaceAll(",", "."))> sortMaleLevelSeniorAndGetAverageSalary)
                        .collect(Collectors.toList());
    }

}

