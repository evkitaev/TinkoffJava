package com.first.lesson8;

public class Cat {

    public  String name;
    public  String gen;
    public  String breed = "Абиссин";
    public  boolean flag; //true = Дома

    public Cat(String name, String gen, String breed) {
        this.name = name;
        this.gen = gen;
        this.breed = breed;
        this.flag = flag;
    }

   /* public Cat(String name, String gen, String breed, String flag) {
        name = name;
        breed = breed;
        flag = flag;
    }*/

    @Override
    public String toString() {
        return name + " " + gen + " " + breed + " " + flag;
    }
}
