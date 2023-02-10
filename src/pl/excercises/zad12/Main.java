package pl.excercises.zad12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);

        ////przypisanie do zmiennej tekstu podanego przez użytkownika
        String text = scanner.nextLine();

        //podzielenie tekstu na tablicę Stringów
        //każdy znak będzie oddzielnym elementem tej tablicy
        String[] textArray = text.split("");

        //zmienna przechowująca liczbę spacji
        int spaces = 0;
        for (int i = 0; i < textArray.length; i++) {
            //sprawdzenie czy koljeny element tablicy jest spacją
            if (textArray[i].equals(" ")) {
                //zwiększe liczbnika spacji o 1 (inkrementacja)
                spaces++;
            }
        }

        //obliczenie stosunku liczby spacji do wszystkich znaku w tekście (wynik w procentach)
        float result = 100f * spaces / textArray.length;

        //wypisanie wyniku na ekran
        System.out.printf("W podanym tekście zawartość spacji to %f%%", result);


        ///ALTERNATYWNE ROZWIĄZANIE

        //przypisanie podanego tekstu do zmienne str
        String str = text;
        //liczba wszystkich znaków w tekście
        int all = str.length();
        //wypisanie informacji o długości tekstu
        System.out.println("Długość tekstu ze spacjami: " + all);

        //podział tekstu na wyraz (spacja jest znakiem oddzielającym - "regex")
        //liczba słów będzie o jeden większa niż liczba spacji
        int spacje = text.split(" ").length - 1;
        //wypisanie informacji o liczbie spacji w tekście
        System.out.println("Spacje: " + spacje);

        //dwa spoosby na obliczenie wyniku
        //preferowany jest drugi sposób (bez rzutowania)
        double rownanie = ((double) spacje / all) * 100;
        double wynik = 100d * spacje / all;

        //wypisanie obu wyników i porównanie ich
        System.out.println("rownanie = " + rownanie + "%");
        System.out.println("wynik = " + wynik + "%");


        System.out.printf("2. W podanym tekście zawartość spacji to %f%%", wynik);
    }
}
