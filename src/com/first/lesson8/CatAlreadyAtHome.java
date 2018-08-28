package com.first.lesson8;

import java.io.PrintStream;

public class CatAlreadyAtHome extends Exception {

    CatAlreadyAtHome() {
        super("Нельзя забрать кота домой из дома");
    }

    /*@Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Нельзя забрать кота домой из дома");
    }*/
}
