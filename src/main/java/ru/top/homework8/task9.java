package ru.top.homework8;

public class task9 {
    //    Вычислить сумму чисел в определенном диапазоне. Начало
//    и конец диапазона задается параметрами
    public static void main(String[] args) {
        System.out.printf("Сумма чисел: %s", getTheSumOfTheNumbersInTheRange(20,30, 0));
    }

    public static int getTheSumOfTheNumbersInTheRange(int rangeStart, int endOfRange, int sum) {
        if (rangeStart <= endOfRange)
        {
            System.out.println(rangeStart + " ");
            sum = sum + rangeStart;
            rangeStart++;
            return getTheSumOfTheNumbersInTheRange(rangeStart, endOfRange, sum);
        }
        return sum;
    }

}
