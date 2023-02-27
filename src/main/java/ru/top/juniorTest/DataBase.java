package ru.top.juniorTest;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    static Map <Integer, Devace> data = new HashMap<>();

    public static Devace getObject(int id){
        Devace devace1 = data.get(id);
        return devace1;
    }
    public static void initObject(){
        data.put(1, new Helicopter(1, 23, 333));

    }
    public  static void addDevace (Devace devace){
        data.put(devace.getId(), devace);
    }

}
