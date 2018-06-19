package com.first.lesson8;

        import static com.first.lesson8.CatCafe.cafeCats;

public class Main {


    public static void main (String [] args){
        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat ("Иванович", "кот", "Абессин",true);
        catsArray[1] = new Cat ("Светлана", "кошка", "Сибирская",true);
        catsArray[2] = new Cat ("Леонид", "кот", "Манчкин",true);
        catsArray[3] = new Cat ("Татьяна", "кошка", "Обессин",true);
        CatCafe cafe = new CatCafe("",catsArray, "09-18");

        System.out.println(cafe.toString());



        //System.out.println(Arrays.toString(cafe));

    }

}
