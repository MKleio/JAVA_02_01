package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite ugi");
        Scanner sc = new Scanner(System.in);
        double ugis = sc.nextFloat();
        System.out.println("Iveskite svori");
        double svoris = sc.nextFloat();
        System.out.println("KMI: " + skaiciuokKMI(svoris,ugis));
        //test
    }

    public static double skaiciuokKMI(double svoris, double ugis) {
        return svoris / Math.pow(ugis,2);
    }
}
