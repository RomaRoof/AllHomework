package ru.top.juniorTest;

public abstract class Devace {
    private final int id;
    private double speed;
    private double price;

    public Devace(int id, double speed, double price) {
        this.id = id;
        this.speed = speed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
