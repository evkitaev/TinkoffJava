package com.first.lesson8;

import java.text.MessageFormat;

public class Dog extends Pet{
    private String breed;

    public Dog(String name, int age, String type, String person, String breed) {
        super(name, age, type, person);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return MessageFormat.format("Тип: {0}, Кличка: {1}, Порода: {2}, Возраст: {3}, Владелец: {4}", getType(), getName(), breed, getAge(), person);
        }

    @Override
    public void info() {
        System.out.println("Тип: " + getType() +", "+ "Порода: " + getBreed() + ", " + "Возраст: " + getAge() + ", " + "Владелец: " + person);
    }

}
