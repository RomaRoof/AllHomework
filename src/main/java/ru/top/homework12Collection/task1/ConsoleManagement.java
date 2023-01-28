package ru.top.homework12Collection.task1;

public enum ConsoleManagement {
    addElementForList ("Добавить элемент в список"),
    deleteElementOfList ("Удалить элемент из списка"),
    showList ("Показать содержимое списка"),
    listCheck ("Проверка наличия элемента в списке"),
    replaceElementOfList ("Заменить значение в списке");

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
