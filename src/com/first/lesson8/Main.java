package com.first.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

       public static void main (String [] args) throws CustomExeption {

           /*Cat[] catsArray = new Cat[3];
           catsArray[0] = new Cat ("","Бяня", 7,"Екатерина","кот","Бобтейл",true);
           catsArray[1] = new Cat ("","Мурзик",7,"","кот","",false);
           catsArray[2] = new Cat ("","Буся",3, "","кошка","Английская",false);*/

           List<Cat> catList = new ArrayList();
           catList.add(new Cat ("","Бяня", 7,"Екатерина","кот","Бобтейл",true));
           catList.add(new Cat ("","Мурзик",7,"","кот","",false));
           catList.add(new Cat ("","Буся",3, "","кошка","Английская",false));

           CatCafe cafe = new CatCafe("", catList, "");

           cafe.getCatHome(catList.get(2));

           System.out.print(cafe.toString()+ "\n");
           System.out.println(catList.toString()); //[com.first.lesson8.Cat@4554617c, com.first.lesson8.Cat@74a14482] - как поправить?


        Cat cat = new Cat ("","Бяня",7,"","кот", "Бобтейл",false);
           cat.takeHome();
           cat.info();
           cat.speak("Люблю тыгыдыкать по ночам!");

        Cat cat1 = new Cat ("", "", 6, "", "кот", "Сибирский", false);
           cat1.info();

        Dog dog = new Dog ("Виктор",5,"","Евгений", "Мопс");
           dog.info();
           dog.speak("Храплю как 50 летний мужик когда сплю");

        Lynx lynx = new Lynx("", 10,"Рысь");
           lynx.info();
           lynx.speak("Я " + lynx.getBreed() +  ", прыгаю ввысь!");

           Person person = new Person("Анатолий");
           person.setPet(dog); // при указании cat выводится запись формата com.first.lesson8.Cat@4554617c, почему?
           System.out.println(dog);











    }

}
