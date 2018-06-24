package com.first.lesson8;

public class Animal {
    private String say;
    Pet pet;

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
    public void info(){ //
        System.out.println(pet);
}
}





