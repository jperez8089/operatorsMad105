package com.example.java;

public class Main {

    public static void main(String[] args) {
        boolean a = (1 + 1 == 2);
        boolean b = (10 - 5 == 5);
        boolean c = (10 * 5 == 50);
        boolean d = (10 / 2 == 5);
        boolean e = (10 % 2 == 5);

        if (a) {
            System.out.println("1+1 = 2 is " + a);
        }
        if (b) System.out.println("10-5 = 5 is " + b);

        if (c) {
            System.out.println("10*5 = 50 is " + c );

            if (d) {
                System.out.println("10/2= 5 " + b);
            }
            if (e){
                System.out.println("10 % 2 = 5 is " + c);
            }


        }




    }
}

