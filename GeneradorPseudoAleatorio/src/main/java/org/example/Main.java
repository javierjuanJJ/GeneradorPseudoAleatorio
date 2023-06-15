package org.example;

import org.example.GenerarAleatiorio.GenerarAleatorio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int generateAleatory = 0;
        for (int counter = 0; counter < 100; counter++) {
            generateAleatory = GenerarAleatorio.generateAleatory(1, 5);
            System.out.println("Aleatory Number" + (counter + 1) + " is " + generateAleatory);
        }

    }
}