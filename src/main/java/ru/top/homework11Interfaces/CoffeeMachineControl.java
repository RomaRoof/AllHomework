package ru.top.homework11Interfaces;

import java.util.Scanner;

//������� 1
//����� ��������� ������ ������ ����-�����, � ���������� ����������������.
//���������� ����������� ������� ���� � �����. ������������ �������� �������� ������� �� ������.
//�� ������������� ����� ����� ��������:
// - �������� � 22 � �������� ���� � 30 ��;
// - ��������� � 22 � �������� ���� � 100 �� ����.
//������������ ���� ������������ � ����������� ���, ������� ���� ������� �� ������.
//���������� ����� �������� ��������� ������ ��� ������.
// - ����������� ����.
// - ����������� ������� ����.
// - ���������� ��� � ������������ ����.
//���������� ����� ������:
// - ���������;
// - ����������;
// - ����������� ��������;
// - ����������� ���������;
// - ������� ���� ������������� ����.
public class CoffeeMachineControl extends CharacteristicsOfTheCoffeeMachine implements FunctionButton, ConsumableResources {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CoffeeMachineControl control = new CoffeeMachineControl(19, 300, 150);
        System.out.println("��� ������ ������ �������� ������� \"���\"");
        control.turnOn();
        System.out.printf("�������� ��������:\n 1 - %s\n 2 - %s\n 3 - %s\n", AMERICANO, ESPRESSO, CLEAR_WASTE_CONTAINER);
        int numberButton = scanner.nextInt();
        switch (numberButton) {
            case 1 -> {
                int remainderCoffee = control.getCoffeeContainer() - CONSUMPTION_OF_COFFEE;
                if (remainderCoffee <= 20) {
                    System.out.println("����������� ����. ��������� ������� (������� \"����\"), ��������� ��������� ��� ���� � �������� ��������");
                    control.switchOff();
                }
                int remainderWater = control.getWaterContainer() - CONSUMPTION_OF_WATER_FOR_AMERICANO;
                if (remainderWater <= 90) {
                    System.out.println("����������� ��� �� ���������� ���� � ����. ��������� ������� (������� \"����\"), ��������� ��������� ��� ���� � �������� ��������");
                    control.switchOff();
                }
                int remainderWaste = control.getWasteContainer() - CONSUMPTION_OF_COFFEE;
                if (remainderWaste <= 22) {
                    System.out.println("�������� ��������� ��� �������. ��������� ������� (������� \"����\"), ���������� ��������� � �������� ��������");
                    control.switchOff();
                }
                System.out.printf("�������� ����: %s\n �������� ���� � ����: %s\n ����� � ���������� � ������������ ���� ��������: %s\n", remainderCoffee, remainderWater, remainderWaste);
                System.out.println("������� ���������");
            }

            case 2 -> System.out.println("������� ��������");

            case 3 -> System.out.println("������� ��������� �������� ����");
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
            System.out.println("����� ����");
        } else {
            System.out.println("������ �� ����������. ���������� �����. �������� - �������� ������������ � ��������!");
            System.exit(1);
        }
    }

    @Override
    public void switchOff() {
        scanner.nextLine();
        String offMachine = scanner.nextLine();
        if (offMachine.equals(FunctionButton.OFF)) {
            System.out.println("����������");
            System.exit(1);
        } else {
            System.out.println("������ �� ����������. ���������� �����. �������� - �������� ������������ � ��������!");
            System.exit(1);
        }
    }

}
