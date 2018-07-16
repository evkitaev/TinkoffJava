package com.first.lesson8;

public abstract class Wild implements Animal {
    static String type = "Дикое животное"; //переделал в статик, что бы проще можно было выводить статичный тип животного в info()
    private int age;

    public Wild(String type, int age) {
        this.age = age;
    }
    /*public Wild() {
    }*/

    public int getAge() {
        return age;
    }

}
