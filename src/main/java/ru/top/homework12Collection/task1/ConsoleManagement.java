package ru.top.homework12Collection.task1;

public enum ConsoleManagement {
    addElementForList ("�������� ������� � ������"),
    deleteElementOfList ("������� ������� �� ������"),
    showList ("�������� ���������� ������"),
    listCheck ("�������� ������� �������� � ������"),
    replaceElementOfList ("�������� �������� � ������");

    private final String desc;

    ConsoleManagement(String desc) {
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
