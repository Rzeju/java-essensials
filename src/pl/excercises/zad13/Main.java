package pl.excercises.zad13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //utworzenie scanner
        //będzie pobierał tekst od użytkownika
        Scanner scanner = new Scanner(System.in);
        //pobranie tekstu od użytkownika i zapisanie do zmiennej
        String text = scanner.nextLine();

        //podzielenie tekstu na tablice Stringów (każdy element to odzielne słowo)
        //separatorem jest tutaj spacja
        String[] myText = text.split(" ");

        //pętla przechodząca przez wszystkie słowa w tablicy
        for (int i = 0; i < myText.length; i++) {
            //dwukrotne wypisanie na ekran każdego ze słów
            String word = myText[i];
            System.out.printf("%s %s ", word, word);
        }
    }
}
