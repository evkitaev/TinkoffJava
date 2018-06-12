package com.first.lesson8;

public class Cat {

    public  String name;
    public  String gen;
    public  String breed;
    public  String flag;

    public Cat(String name, String gen) {
        this.name = name;
        this.gen = gen;
    }

    @Override
    public String toString() {
        return name + " " + gen +" "+ breed + " " + flag;
    }
}
