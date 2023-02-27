package ru.top.juniorTest;

//есть несколько видом устройств - самолет, вертолет, авто. каждый имеет характеристики - идентификатор(обязаятельный,
// не изменяется в ходе работы программы), скорость, стоимость. вертолет и самолет могут летать - достаточно выводить
// имя класса. реализовать все это + некое локальное хранилище из которого можно получать по идентификатору объекты
public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Helicopter helicopter = new Helicopter(1, 33, 345);
        DataBase.initObject();
        Devace hel = dataBase.getObject(1);
        helicopter.fly();
        System.out.println(hel);
    }


}
