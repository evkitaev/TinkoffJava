package com.first.lesson8;

        import static com.first.lesson8.CatCafe.cafeCats;

public class Main {

    static CatCafe Cafe = new CatCafe("",cafeCats, "09-18", 4);
    static Cat[] catsArray = new Cat[3];
    public static void main (String [] args){
        catsArray = cafeCats;
        cafeCats[0] = new Cat ("Иванович", "кот", "Абессин",true);
        cafeCats[1] = new Cat ("Светлана", "кошка", "Сибирская",true);
        cafeCats[2] = new Cat ("Леонид", "кот", "Манчкин",true);
        cafeCats[3] = new Cat ("Татьяна", "кошка", "Обессин",true);

    }

}
