package com.first.lesson8;


public class Pet extends Animal {
    //В класс Pet перенести поля имя и возраст из класса Cat и добавить поле владелец.
    public String name; //поле имя - всем классам
    protected int age; //поля возраст только дочерним классам
    /*private String owner; //поле владелец должно быть доступно только классу Pet*/
    private String type; //поле владелец должно быть доступно только классу Pet
   String person;

    public String getType() {
        return type;
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

    public Pet(String name, int age, String type, String person) {
        this.name = name;
        this.age = age;
        this.type = "Домашнее животное";
        this.person = person;
    }

    public Pet() {
    }

    //В классе Pet в методе speak() дополнительно добавить на вывод в консоль кличку животного.
    @Override
    public void speak(String say) {
            System.out.println(getName() + " говорит: " + say + "\n");
        }
    }



