package com.first.lesson8;

import java.text.MessageFormat;

public class Lynx extends Pet{
        private String type;
        private String breed;

        //Для всех полей добавить геттеры и сеттеры.
        public Lynx(String name, int age, String owner, String breed) {
            super(name, age, owner);
            this.type = "Дикая кошка";
            this.breed = breed;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        @Override
        public String toString() {
            if (getOwner() == null){ return MessageFormat.format("Тип: {0}, Кличка: {1}, Порода: {2}, Возраст: {3}", getType(), "Рысь", breed, getAge());

        }
            return MessageFormat.format("Тип: {0}, Кличка: {1}, Порода: {2}, Возраст: {3}, Владелец: ", getType(), getName(), breed, getAge(), getOwner());
        }

    }

