package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Gra {
    private static HashSet<Integer> wylosowane;
    private ArrayList<Integer> wpisane;
    private ArrayList<Integer> trafione;

    public Gra() {
        wylosujLiczby();
    }

    /**
     * losuje 6 liczb z zakresu 1 49 jeżeli jeszcze nie wylosowano
     */
    public void wylosujLiczby(){

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

    }
    public void wypisz(HashSet<Integer> zbiorDoWypisania){

    }

}
