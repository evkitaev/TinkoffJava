package com.first.lesson8;


public class Pet extends Animal {
    //В класс Pet перенести поля имя и возраст из класса Cat и добавить поле владелец.
    public String name; //поле имя - всем классам
    protected int age; //поля возраст только дочерним классам
    private String owner; //поле владелец должно быть доступно только классу Pet

    //Для всех полей добавить геттеры и сеттеры.
    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;

    }

    public Pet() {
    }

    //В классе Pet в методе speak() дополнительно добавить на вывод в консоль кличку животного.
    @Override
    public void speak(String say) {
        if (getName() == null) {
            System.out.println(getType() + " говорит: " + say); //на случай, если мы не знаем клички)
        } else {
            System.out.println(getName() + " говорит: " + say);
        }
    }
}


