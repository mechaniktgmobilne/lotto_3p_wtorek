package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //wylosuj 10 liczb z zakresu od 1 do 15 bez powtórzeń
        //tablica
        int[] tablicaLiczbLosowych = new int[10]; // nie można później zmienić rozmiaru tablicy
        Random random = new Random();
        int liczba;
        boolean zawiera = false;
        int i = 0;
        while (i<10) {
            liczba = random.nextInt(15)+1;
            for (int j = 0; j < i; j++) {
                if(liczba == tablicaLiczbLosowych[j]){
                    zawiera = true;
                    break;
                }
            }
            if(!zawiera){
                tablicaLiczbLosowych[i] = liczba;
                i++;
            }
            else{
                zawiera = false;
            }
        }
        //wypisz wylosowane liczby na ekranie
        System.out.println("Tablica liczb losowych");
        for (int elementTablicy : tablicaLiczbLosowych) {
            System.out.println(elementTablicy);
        }

    }
}
