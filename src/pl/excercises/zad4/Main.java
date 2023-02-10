package pl.excercises.zad4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Utworzenie skannera
        Scanner scanner = new Scanner(System.in);

        //Informacja dla użytkownika i konieczności podania liczby całkowitej
        System.out.println("Podaj liczbę: ");
        //zapisanie do zmiennej a liczby podanej przez użytkownika
        int a = scanner.nextInt();

        //pętla for odliczająca liczby od 1 do a
        for (int i = 1; i <= a; i++) {
            //Warunek dla liczby podzielnej przez 3 i 7
            //Zwróć uwagę, że warunek najbardziej szczegółowy jest najwyżej
            //Wykona się tylko jedne z bloków if - else if
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("PIF PAF!");
                //warunek dla liczby podzielnej przez 3
            } else if (i % 3 == 0) {
                System.out.println("PIF!");
                //warunek dla liczby podzielnej przez 3
            } else if (i % 7 == 0) {
                System.out.println("PAF!");
                //dla wszystkich pozostałych liczb
            } else {
                System.out.println(i);
            }
        }
    }
}
