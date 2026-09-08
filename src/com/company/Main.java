package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //wylosuj 10 liczb z zakresu od 1 do 15 bez powtórzeń
        //zbiór
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        //zbiór elementy bez powtózeń nieindeksowane
        Random random = new Random();
        int liczba;
        int i = 0;
        while (zbiorLiczbLosowych.size()<10) {
            liczba = random.nextInt(15)+1;
            zbiorLiczbLosowych.add(liczba);
        }
        //wypisz wylosowane liczby na ekranie
        System.out.println("Zbior liczb losowych");
        System.out.println(zbiorLiczbLosowych);

    }
}
