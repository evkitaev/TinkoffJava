package com.first.lesson8;

        import java.util.Arrays;

        import static com.first.lesson8.CatCafe.*;

public class Main {
   static Wild wild;

       public static void main (String [] args){

        Cat cat = new Cat ("","Бяня",7,"","кот", "Бобтейл",false);
           cat.takeHome();
           cat.info();
           cat.speak("Люблю тыгыдыкать по ночам!");

        Cat cat1 = new Cat ("","",9,"","кот", "Сибирский",false);
           cat1.info();

        Dog dog = new Dog ("Виктор",5,"","Евгений", "Мопс");
           dog.info();
           dog.speak("Храплю как 50 летний мужик когда сплю");

        Lynx lynx = new Lynx("", 10,"Рысь");
           lynx.info();
           lynx.speak("Я " + lynx.getBreed() +  ", прыгаю ввысь!");









    }

}
