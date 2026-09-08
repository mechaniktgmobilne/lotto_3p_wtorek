package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //wylosuj 10 liczb z zakresuod 1 do 100
        //tablica
        int[] tablicaLiczbLosowych = new int[10]; // nie można później zmienić rozmiaru tablicy
        Random random = new Random();
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = random.nextInt(100)+1;
        }
        //wypisz wylosowane liczby na ekranie
        System.out.println("Tablica liczb losowych");
        for (int elementTablicy : tablicaLiczbLosowych) {
            System.out.println(elementTablicy);
        }

    }
}
