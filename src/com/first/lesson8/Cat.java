package com.first.lesson8;

/* Создать класс Cat, добавить поля имя, пол, порода, флаг (в котокафе или дома) и тд.
Добавить в класс несколько конструкторов (все поля заполняются по умолчанию, указываем только имя и пол, указываем все поля).
Пустых полей быть не должно.*/

import java.sql.SQLOutput;

public class Cat {

    public  String name;
    public  String gen;
    public  String breed;
    public  boolean flag; //true = в котокафе, false = дома

    public Cat (){
        this.name = "Мяотик";
        this.gen = "Кот";
        this.breed = "Обессин";
        this.flag = false;
    }

    public Cat(String name, String gen, String breed, boolean flag) {
        this.name = name;
        this.gen = gen;
        this.breed = breed;
        this.flag = flag;


    }

    public Cat(String name, String gen) {
        this.name = name;
        this.gen = gen;
        this.breed = "Заморский";
        this.flag = false;
    }

    public String flag1 (boolean flag){
        if (flag = true)
            return "дома";
            else
                return "котокафе";

    }

    @Override
public String toString() {
    return name + " " + gen + " " + breed + " " + flag;
}
}
