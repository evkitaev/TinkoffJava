package com.first.lesson8;

/* Создать класс Cat, добавить поля имя, пол, порода, флаг (в котокафе или дома) и тд.
Добавить в класс несколько конструкторов (все поля заполняются по умолчанию, указываем только имя и пол, указываем все поля).
Пустых полей быть не должно.*/

import java.text.MessageFormat;

public class Cat extends Pet {
    private String type;
    private String gen;
    private String breed;
    private boolean flag; //true = дома, false = в котокафе

    //Для всех полей добавить геттеры и сеттеры.
    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String breed) {
        this.type = type;
    }


    public Cat (String name, String gen, String breed, int age, boolean flag, String owner){
        super(name, age, owner);
        this.type = "Домашний кот";
        this.gen = gen;
        this.breed = breed;
        this.flag = flag;

    }

    private String getLocation(boolean flag) {
        if (flag) {
            return "дома";
        }
        else {
            return "котокафе";
        }
    }

    public void takeHome() { //Создать класс Person. В классе Cat при взятии кошки домой заполнять поле владелец.
        this.flag = true;
        setOwner("Домовой"); //set или get?

    }

   @Override
    public String toString() {
        if (flag){
        return MessageFormat.format("\nТип: {0}, Кличка: {1}, {2}, Порода: {3}, Возраст: {4}, Местонахождение: {5}, Владелец: {6}", getType(), getName(), gen, breed, getAge(), getLocation(flag), getOwner());
        }
        else {
            return MessageFormat.format("\nКличка: {0}, {1}, Порода: {2}, Возраст: {3}, Местонахождение: {4}, Владелец отсутствует", getName(), gen, breed, getAge(), getLocation(flag));
        }

   }
}
