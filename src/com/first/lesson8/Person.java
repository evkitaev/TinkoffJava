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

    public Map <String, Pet> getPetMap(){ //Добавить метод, позволяющий добавлять любого питомца. Тут я что то не могу придумать как это осуществить
    return map;
    }

    public Pet getPetByName (String name){
     return map.get(name);

    }

    @Override
    public String toString() {
        return personName;
    }
}
