package com.first.lesson8;
/*
Добавить в класс Animal методы speak(), который выводит в консоль, что говорит животное,
и info(), который выводит информацию о животном
*/
public class Animal {
    private String say;
    Pet pet;
    Cat cat;
    Dog dog;
    Lynx lynx;

    public String getType() {
        return type;
    }

    private String type;

    public Animal(String say) {
        this.say = say;
    }

    public String getSay() {
        return say;
    }

    public Animal(){}

    public void speak(String say) {
        System.out.println("Животное говорит: " + say);
    }
    //Метод info(), который выводит информацию о животном
    public void info(){
        //не получилось понять, что нужно передавать в этот метод
        System.out.println(cat.getClass());
}
}





