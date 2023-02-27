package ru.top.juniorTest;

public interface Flyable {
    default void fly(){
        System.out.println(this.getClass().getSimpleName());
    };
}
