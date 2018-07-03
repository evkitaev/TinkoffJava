package com.first.lesson8;

public class Bird implements Animal {

    @Override
    public void speak(String say) {
        System.out.println("Птичка поет " + say);
    }

    @Override
    public void info() {

    }
}
