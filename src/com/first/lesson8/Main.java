package com.first.lesson8;

        import java.util.Arrays;

        import static com.first.lesson8.CatCafe.*;

public class Main {

       public static void main (String [] args){
        /*Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat ("Иванович", "кот", "Абессин", 9, false,  null);
        catsArray[1] = new Cat ("Светлана", "кошка", "Сибирская", 5, false, "Джеоржджий");
        catsArray[2] = new Cat ("Леонид", "кот", "Манчкин", 3, true,"Боб");
        catsArray[3] = new Cat ("Татьяна", "кошка", "Абессин",2,false, "Дидрик");
        CatCafe cafe = new CatCafe("",catsArray, "");
        cafe.getCatHome(catsArray[0]);
        System.out.print(cafe.toString()+ "\n");*/

        Cat cat = new Cat ("Бяня", "кот", "Бобтейл",7, true, null);
           cat.takeHome();
           System.out.println(cat);
           cat.speak("Люблю тыгыдыкать по ночам!");

        Dog dog = new Dog ("Виктор", 5, "Евгений","Мопс");
           System.out.println("\n" + dog);
           dog.speak("Храплю как 50 летний мужик когда сплю");

        Lynx lynx = new Lynx(null,5,null,"евразиатская");
           System.out.println("\n" + lynx);
           lynx.speak("Я рысь, прыгаю ввысь!");

           dog.info();

           //при выводе типа животного возможно имелось ввиду ввывод имени класса?






    }

}
