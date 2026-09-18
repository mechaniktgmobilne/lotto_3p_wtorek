package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Gra {
    private static HashSet<Integer> wylosowane;
    private ArrayList<Integer> wpisane;
    private ArrayList<Integer> trafione;

    public Gra() {
        wylosujLiczby();
    }

    public static HashSet<Integer> getWylosowane() {
        return wylosowane;
    }

    public ArrayList<Integer> getWpisane() {
        return wpisane;
    }

    public ArrayList<Integer> getTrafione() {
        return trafione;
    }

    /**
     * losuje 6 liczb z zakresu 1 49 jeżeli jeszcze nie wylosowano
     */
    public void wylosujLiczby(){
        if(wylosowane == null) {
            wylosowane = new HashSet<>();
            Random random = new Random();
            while (wylosowane.size() < 6) {
                wylosowane.add(random.nextInt(49) + 1);
            }
        }
    }

    /**
     * wczytywanie 6 liczb z klawiatury
     * liczby nie mogą się powtarzać
     */
    public void wczytajLiczbyZKlawiatury(){

    }

    /**
     * sprawdza które liczby są wpisane i wylosowane
     */
    public void sprawdzTrafione(){

    }
    //przeciążanie metod -> polimorfizm
    //metody mają taką samą nazwę ale różna liczba argumentów lub ich typ
    public void wypisz(ArrayList<Integer> listaDoWypisania){
        System.out.println(listaDoWypisania);
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.print(listaDoWypisania.get(i)+", ");
        }
    }
    public void wypisz(HashSet<Integer> zbiorDoWypisania){
        System.out.println(zbiorDoWypisania);
        for (Integer element :zbiorDoWypisania ) {
            System.out.print(element+", ");
        }
    }

}
