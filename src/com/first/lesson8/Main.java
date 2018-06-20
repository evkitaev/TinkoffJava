package com.first.lesson8;

        import java.util.Arrays;

        import static com.first.lesson8.CatCafe.*;

public class Main {

       public static void main (String [] args){
        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat ("Иванович", "кот", "Абессин",true);
        catsArray[1] = new Cat ("Светлана", "кошка", "Сибирская",false);
        catsArray[2] = new Cat ("Леонид", "кот", "Манчкин",true);
        catsArray[3] = new Cat ("Татьяна", "кошка", "Абессин",false);
        CatCafe cafe = new CatCafe("",catsArray, "");

        cafe.getCatHome(catsArray[2]); //как увести еще котика в одной строчке?


           System.out.print(cafe.toString()+ "\n");
           System.out.println(Arrays.toString(catsArray));

    }

}
