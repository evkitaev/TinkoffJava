package com.first.lesson8;

/* Создать класс Cat, добавить поля имя, пол, порода, флаг (в котокафе или дома) и тд.
Добавить в класс несколько конструкторов (все поля заполняются по умолчанию, указываем только имя и пол, указываем все поля).
Пустых полей быть не должно.*/

public class Cat extends Pet {
    private String gen;
    private String breed;
    private boolean flag; //true = дома, false = в котокафе
    private Person person = new Person ("Екатерина");
    Wild wild;

    public String getGen() {
        return gen;
    }
    public String getBreed() {
        return breed;
    }
    public Person getPerson() {
        return person;
    }
    public boolean isFlag() {
        return flag;
    }

    public Cat(String type, String name, int age, String personName, String gen, String breed, boolean flag) {
        super(name, age, type, personName);
        this.gen = gen;
        this.breed = breed;
        this.flag = flag;
    }

    private String getLocation(boolean flag) {
        if (flag) {
            return "дома";
        } else {
            return "котокафе";
        }
    }

    public void takeHome() throws CatAlreadyAtHome {
        if (isFlag()){
            throw new CatAlreadyAtHome(); //Добавить исключение, при попытке взять домой кота, с флагом "Дома".
        }
        this.flag = true;
        System.out.println("Владелец: " + getPerson()); //проставление владельца, при заборе домой

    }

    @Override
    public void info() {
        if (flag)
            System.out.println("Тип: " + getType() + ", " + "Кличка: " + getName() + ", "+ "Порода: " + getBreed() + ", " + "Возраст: " + getAge() + ", " + "сейчас " + getLocation(flag));

        else
            System.out.println("Тип: " + getType() + ", " + "Порода: " + getBreed() + ", " + "Пол: " + getGen() + ", " + "Возраст: " + getAge() + ", " + "Владелец отсутствует," + " сейчас в " + getLocation(flag) + "\n");


    }
    public String toString() {
        return "Тип: " + getType() + ", " + "Кличка: " + getName() + ", "+ "Порода: " + getBreed() + ", " + "Возраст: " + getAge() + ", " + "сейчас " + getLocation(flag);
    } //причем в классе dog уже так реализовано, не знаю что мне помешало сравнить)
}
