package com.first.lesson8;

import java.io.PrintStream;

public class CustomExeption extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Нельзя забрать кота домой из дома");
    }
}
