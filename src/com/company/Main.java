package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //wylosuj 10 liczb z zakresu od 1 do 15 bez powtórzeń
        //lista
        ArrayList<Integer> listaLiczbLosowych = new ArrayList<>();
        Random random = new Random();
        int liczba;
        int i = 0;
        while (listaLiczbLosowych.size()<10) {
            liczba = random.nextInt(15)+1;
            if(listaLiczbLosowych.contains(liczba)){
                continue;
            }
            listaLiczbLosowych.add(liczba);
        }
        //wypisz wylosowane liczby na ekranie
        System.out.println("Lista liczb losowych");
        System.out.println(listaLiczbLosowych);

    }
}
