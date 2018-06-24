package com.first.lesson8;

import java.text.MessageFormat;

public class Dog extends Pet{
    private String type = "Собака";
    private String breed;

    //Для всех полей добавить геттеры и сеттеры.
    public Dog(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Тип: {0}, Кличка: {1}, Порода: {2}, Возраст: {3}, Владелец: {4}", getType(), getName(), breed, getAge(), getOwner());
        }

    }
