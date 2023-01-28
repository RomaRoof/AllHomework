package ru.top.homework11Interfaces;

import java.util.Scanner;

//Задание 1
//Завод выпускает разные модели кофе-машин, с различными характеристиками.
//Кофемашина загружается молотым кофе и водой. Максимальные значения загрузки зависят от модели.
//На приготовление одной чашки тратится:
// - эспрессо – 22 г молотого кофе и 30 мл;
// - американо – 22 г молотого кофе и 100 мл воды.
//Отработанное кофе сбрасывается в специальный бак, емкость бака зависит от модели.
//Кофемашина может выдавать различные ошибки при работе.
// - Отсутствует вода.
// - Отсутствует молотое кофе.
// - Переполнен бак с отработанным кофе.
//Кофемашина имеет кнопки:
// - включения;
// - выключения;
// - Приготовить эспрессо;
// - Приготовить американо;
// - Очистка бака отработанного кофе.
public class CoffeeMachineControl extends CharacteristicsOfTheCoffeeMachine implements FunctionButton, ConsumableResources {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CoffeeMachineControl control = new CoffeeMachineControl(19, 300, 150);
        System.out.println("Для начала работы аппарата введите \"ВКЛ\"");
        control.turnOn();
        System.out.printf("Выберите действие:\n 1 - %s\n 2 - %s\n 3 - %s\n", AMERICANO, ESPRESSO, CLEAR_WASTE_CONTAINER);
        int numberButton = scanner.nextInt();
        switch (numberButton) {
            case 1 -> {
                int remainderCoffee = control.getCoffeeContainer() - CONSUMPTION_OF_COFFEE;
                if (remainderCoffee <= 20) {
                    System.out.println("Отсутствует кофе. Выключите аппарат (введите \"ВЫКЛ\"), заполните контейнер для кофе и повторно включите");
                    control.switchOff();
                }
                int remainderWater = control.getWaterContainer() - CONSUMPTION_OF_WATER_FOR_AMERICANO;
                if (remainderWater <= 90) {
                    System.out.println("Отсутствует или не достаточно воды в баке. Выключите аппарат (введите \"ВЫКЛ\"), заполните контейнер для воды и повторно включите");
                    control.switchOff();
                }
                int remainderWaste = control.getWasteContainer() - CONSUMPTION_OF_COFFEE;
                if (remainderWaste <= 22) {
                    System.out.println("Заполнен контейнер для отходов. Выключите аппарат (введите \"ВЫКЛ\"), освободите контейнер и повторно включите");
                    control.switchOff();
                }
                System.out.printf("Осталось кофе: %s\n Осталось воды в баке: %s\n Места в контейнере с отработанным кофе осталось: %s\n", remainderCoffee, remainderWater, remainderWaste);
                System.out.println("Готовим Американо");
            }

            case 2 -> System.out.println("Готовим Эспрессо");

            case 3 -> System.out.println("Очищаем контейнер кофейной гущи");
        }

    }

    public CoffeeMachineControl(Integer coffeeContainer, Integer waterContainer, Integer wasteContainer) {
        super(coffeeContainer, waterContainer, wasteContainer);
    }

    @Override
    public Integer getWaterContainer() {
        return super.getWaterContainer();
    }

    @Override
    public Integer getWasteContainer() {

        return super.getWasteContainer();
    }

    @Override
    public Integer getCoffeeContainer() {
        return super.getCoffeeContainer();
    }

    @Override
    public void turnOn() {
        String onMachine = scanner.nextLine();
        if (onMachine.equals(FunctionButton.ON)) {
            System.out.println("Греем воду");
        } else {
            System.out.println("Ничего не происходит. Попробуйте снова. Внимание - Терминал чувствителен к регистру!");
            System.exit(1);
        }
    }

    @Override
    public void switchOff() {
        scanner.nextLine();
        String offMachine = scanner.nextLine();
        if (offMachine.equals(FunctionButton.OFF)) {
            System.out.println("Выключение");
            System.exit(1);
        } else {
            System.out.println("Ничего не происходит. Попробуйте снова. Внимание - Терминал чувствителен к регистру!");
            System.exit(1);
        }
    }

}
