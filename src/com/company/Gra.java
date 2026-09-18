package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Gra {
    private static HashSet<Integer> wylosowane;
    private ArrayList<Integer> wpisane;
    private ArrayList<Integer> trafione;

    public Gra() {
        wylosujLiczby();
        wpisane = new ArrayList<>();
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
    private void wylosujLiczby(){
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
    private void wczytajLiczbyZKlawiatury(){
        Scanner scanner = new Scanner(System.in);
        wpisane.clear();
        int liczba;
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbę nr "+(i+1));
            liczba = scanner.nextInt();
            while (wpisane.contains(liczba)){
                System.out.println("podaj inną liczbę");
                liczba = scanner.nextInt();
            }
            wpisane.add(liczba);
        }
    }

    /**
     * sprawdza które liczby są wpisane i wylosowane
     */
    private void sprawdzTrafione(){
        trafione = new ArrayList<>();
        for (Integer liczba: wylosowane) {
            if(wpisane.contains(liczba))
            {
                trafione.add(liczba);
            }
        }
    }
    //przeciążanie metod -> polimorfizm
    //metody mają taką samą nazwę ale różna liczba argumentów lub ich typ
    private void wypisz(ArrayList<Integer> listaDoWypisania){
        System.out.println(listaDoWypisania);
        for (int i = 0; i < listaDoWypisania.size(); i++) {
            System.out.print(listaDoWypisania.get(i)+", ");
        }
        System.out.println();
    }
    private void wypisz(HashSet<Integer> zbiorDoWypisania){
        System.out.println(zbiorDoWypisania);
        for (Integer element :zbiorDoWypisania ) {
            System.out.print(element+", ");
        }
        System.out.println();
    }

    public void zagraj()
    {
        wylosujLiczby();
        wczytajLiczbyZKlawiatury();
        sprawdzTrafione();
        System.out.println("Wylosowano: ");
        wypisz(wylosowane);
        System.out.println("Wpisano: ");
        wypisz(wpisane);
        System.out.println("Trafione: ");
        wypisz(trafione);
    }

}
