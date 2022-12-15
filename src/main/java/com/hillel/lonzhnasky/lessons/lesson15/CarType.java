package com.hillel.lonzhnasky.lessons.lesson15;

public enum CarType {

    CAR("Автомобіль"),
    BUS("Автобус"),
    TRUCK("Вантажівка"),
    MOTORCYCLE("Мотоцикц");

    private String type;

    CarType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
