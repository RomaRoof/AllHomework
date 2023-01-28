package ru.top.homework12Collection.task1;

import java.util.*;

import static ru.top.homework12Collection.task1.ConsoleManagement.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.print("������� ����� �����\n ��� ��������� ������ ������� \"Stop\":\n");
        List<String> listOfUserElement = new ArrayList<>();
        for (int i = 1; i > 0; i++) {
            String userElement = scanner.next();
            if (!userElement.equals("Stop")) {
                listOfUserElement.add(userElement);
            } else {
                System.out.println("���� ��������");
                break;
            }
        }
        while (listOfUserElement.size() > 0) {
            System.out.println("�������� ���������� ��������:");
            System.out.printf("1 - %s\n2 - %s\n3 - %s\n4 - %s\n5 - %s\n", addElementForList, deleteElementOfList, showList, listCheck, replaceElementOfList);
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("������� ����� ������� ������ �������� � ����� ������: ");
                    String addCurrentElement = scanner.next();
                    listOfUserElement.add(addCurrentElement);
                    System.out.println(listOfUserElement);
                }
                case 2 -> {
                    System.out.println("������� ����� ������� ������ ������ �� ������");
                    String removeCurrentElement = scanner.next();
                    listOfUserElement.remove(removeCurrentElement);
                    System.out.println(listOfUserElement);
                }
                case 3 -> {
                    System.out.println("������� ���������� ������:");
                    System.out.println(listOfUserElement);
                }
                case 4 -> {
                    System.out.println("������� ����� ������� ������ �����:");
                    String elementSearch = scanner.next();
                    System.out.println("����� �������� � ������:");
                    if (listOfUserElement.contains(elementSearch)) {
                        System.out.printf("%s ������\n", elementSearch);
                    } else {
                        System.out.printf("%s �� ������\n", elementSearch);
                    }
                }
                case 5 -> {
                    System.out.println("������� �������� ������� ������ �������� ");
                    String elementBeforeReplacement = scanner.next();
                    if (listOfUserElement.contains(elementBeforeReplacement)) {
                        System.out.printf("%s - ������\n", elementBeforeReplacement);
                        System.out.println("������� �������� �� ������� ���� ��������");
                        String replaceElement = scanner.next();
                        System.out.printf("������� %s ������� ������� �� %s\n", listOfUserElement.set(listOfUserElement.indexOf(elementBeforeReplacement), replaceElement), replaceElement);
                    } else {
                        System.out.println("������ �� �������, ���������� �����");
                    }

                }
            }
            System.out.println("��� ����������� ������ ������� \"Enter\"\n��� ���������� ������ ��������� ������� \"����\"\n");
            if (scanner.next().equals("����")) {
                break;
            }
        }
    }

}
