package com.first.lesson8;

public class Wild extends Animal {
    private String type = "Дикое животное";
    private int age;

    public Wild(String type, int age) {
        this.type = "Дикое животное";
        this.age = age;
    }
    public Wild() {
    }

    public int getAge() {
        return age;
    }

    public String getType() {

        return type;
    }

    @Override
    public void speak (String say){
        System.out.println(getType() + " " + " говорит " + say);
    }



}
