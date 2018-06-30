package com.first.lesson8;

import java.text.MessageFormat;

public class Lynx extends Wild{
        private String breed;

    public Lynx(String type, int age, String breed) {
        super(type, age);
        this.breed = breed;
    }

    public String getBreed() {
            return breed;
        }

        @Override
        public String toString() {

            return MessageFormat.format("Тип: {0}, Порода: {1}, Возраст: {2}", getType(), getBreed(), getAge());
        }

        @Override
        public void speak (String say){
        System.out.println(getType() + " говорит: " + say + "\n");
    }

        @Override
        public void info(){
            System.out.println("Тип: " + getType() +", "+ "Порода: " + getBreed() + ", " + "Возраст: " + getAge());
        }


    }

