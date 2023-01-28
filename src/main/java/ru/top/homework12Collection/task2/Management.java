package ru.top.homework12Collection.task2;

public enum Management {
    addNewUser("�������� ������ ������������"),
    deleteExistingUser("������� ������������� ������������"),
    exitFromTheProgram("����� �� ���������");

    private final String desc;

    Management(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
