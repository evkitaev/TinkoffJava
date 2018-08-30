package com.first.lesson8;

import java.text.MessageFormat;
import java.util.List;
/*Создать класс CatCafe, добавить поля адрес, массив котов в котокафе и время работы и счетчик котов.
Добавить конструктор класса. Создать объект кафе и добавить в него котов. Всем котам проставить флаг.*/

public class CatCafe {
    String address;
    List<Cat> catList;
    String time;
    int catCount;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Cat> getCafeCats() {
        return catList;
    }

    public void setCafeCats(List cafeCats) {
        this.catList = catList;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCatCount() {
        return catCount;
    }

    public void setCatCount(int catCount) {
        this.catCount = catCount;
    }



    public CatCafe(String address, List<Cat> catList, String time) {
        this.address = "улица Мурзика";
        this.time = "09.00 - 22.00";
        this.catCount = catList.size();
        this.catList = catList;

    }

    public void getCatHome(Cat cat) throws CatAlreadyAtHome {
        cat.takeHome();
        catCount -= 1;
        catList.remove(cat);
    }




    @Override
    public String toString() {
        String catsCafeString = "";
        for (Cat n : catList) {
            }
        return MessageFormat.format(
                "Адрес кафе: {0}\n" +
                        "Коты в кафе: {1}\n" +
                        "Часы работы кафе: {2}\n" +
                        "Количество котиков в кафе: {3}", address,"\n" + catList.toString(), time, catCount);

    }

}





