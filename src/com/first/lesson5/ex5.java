package com.first.lesson5;

public class ex5 {
    public static void main (String[] args) {
        int cath1 = 3;
        int cath2 = 2;
        //double hyp = Math.sqrt(cath1*cath1 + cath2*cath2);
        double hyp = Math.sqrt(Math.pow(cath1, 2) + Math.pow(cath2,2));
        System.out.println(hyp);
        double s = (cath1*cath2*hyp);
        System.out.println("S = " + s);
        double p = (cath1 + cath2 + hyp);
        System.out.println("P = " + p);

    }
}
