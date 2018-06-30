package com.first.lesson8;


//Создать класс Person. В классе Cat при взятии кошки домой заполнять поле владелец.
public class Person {
    String personName;

    public String getpersonName() {
        return personName;
    }

    public Person(String personName) {
        this.personName = personName;
    }
    @Override
    public String toString() {
        return personName;
    }
}
