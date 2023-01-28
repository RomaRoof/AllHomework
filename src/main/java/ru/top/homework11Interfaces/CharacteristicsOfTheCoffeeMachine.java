package ru.top.homework11Interfaces;

public class CharacteristicsOfTheCoffeeMachine {
    private final Integer coffeeContainer;
    private final Integer waterContainer;
    private final Integer wasteContainer;

    public CharacteristicsOfTheCoffeeMachine(Integer coffeeContainer, Integer waterContainer, Integer wasteContainer) {
        this.coffeeContainer = coffeeContainer;
        this.waterContainer = waterContainer;
        this.wasteContainer = wasteContainer;
    }

    public Integer getCoffeeContainer() {
        return coffeeContainer;
    }

    public Integer getWaterContainer() {
        return waterContainer;
    }

    public Integer getWasteContainer() {
        return wasteContainer;
    }

}
