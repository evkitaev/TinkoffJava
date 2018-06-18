package com.first.lesson8;

public class CatCafe {
    static String address = "улица Мурзика";
    static Cat[] cafeCats = new Cat [3];
    static int time = 12;
    static int catCount;
     public static void main (String [] args){
         cafeCats[0] = new Cat ("Игорь", "Кот", "");
         cafeCats[1] = new Cat ("Светлана", "кошка", "в котокафе");
         cafeCats[2] = new Cat ("Иванович","кот","в котокафе");
         System.out.println(cafeCats);
     }
    public CatCafe(String address, Cat[] cafeCats, int time, int catCount) {
        this.address = address;
        this.time = time;
        this.catCount = catCount;
        this.cafeCats = cafeCats;

    }


}
