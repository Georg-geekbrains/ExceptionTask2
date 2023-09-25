package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int d = 2;
            double catchedRes1 = 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}