package com.first.lesson8;

/*Создать класс CatCafe, добавить поля адрес, массив котов в котокафе и время работы и счетчик котов.
Добавить конструктор класса.
Создать объект кафе и добавить в него котов. Всем котам проставить флаг.*/

public class CatCafe {
    String  address;
    String[] cafecats;  //Cat[] cafecats
    // cafecats[0] = new 
    int time;
    //String time;
    int catcount;

    public CatCafe(String address, String[] cafecats, int time, int catcount) {
        this.address = address;
        this.cafecats = cafecats;
        this.time = time;
        this.catcount = catcount;
    }

    public static void main(String args []) {

    }
}
