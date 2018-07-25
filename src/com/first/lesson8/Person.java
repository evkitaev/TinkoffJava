package com.first.lesson8;


import java.util.HashMap;
import java.util.Map;

//Создать класс Person. В классе Cat при взятии кошки домой заполнять поле владелец.
public class Person {
    String personName;
    //Pet pet; //В классе Person добавить поле, хранящее питомца.
    Map<String, Pet> map = new HashMap<String, Pet>();

    public String getpersonName() {
        return personName;
    }

    public Person(String personName) {
        this.personName = personName;
    }

    public Pet getPet(){ //Добавить метод, позволяющий добавлять любого питомца. Тут я что то не могу придумать как это осуществить
    return (Pet) map;
    }

    public void setPet(Pet pet){
        this.map = (Map<String, Pet>) pet;
        pet.setPerson(personName);
    }

    @Override
    public String toString() {
        return personName;
    }
}
