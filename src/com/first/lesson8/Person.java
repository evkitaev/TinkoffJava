package com.first.lesson8;


//Создать класс Person. В классе Cat при взятии кошки домой заполнять поле владелец.
public class Person {
    String personName;
    Pet pet; //В классе Person добавить поле, хранящее питомца.

    public String getpersonName() {
        return personName;
    }

    public Person(String personName) {
        this.personName = personName;
    }

    public void getPet(String personName){ //Добавить метод, позволяющий добавлять любого питомца. Тут я что то не могу придумать как это осуществить

    }

    @Override
    public void getPet(){

    }

    @Override
    public String toString() {
        return personName;
    }
}
