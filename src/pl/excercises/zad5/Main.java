package pl.excercises.zad5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Utowrzenie skanera
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podajmy liczbę naturalną n = ");
        //Przypisanie do zmiennej liczby wprowadzonej przez użytkownika
        int n = scanner.nextInt();

        //i będzie kolejną liczbą sprawdzaną pod kątem tego czy jest liczbą pierwszą
        for (int i = 2; i < n; i++) {
            //zmienna pomocnicza - informuje o tym czy rozpatrywana liczba i jest liczbą pierwszą
            boolean isPrime = true;
            //j będzie kolejnym dzielnikiem libczy i warunki : (j < i, j <= i / 2, i <= Math.sqrt(i))
            for (int j = 2; j < Math.sqrt(i); j++) {
                //warunek sprawdzający czy kolejna liczba j jest dzielnikiem liczby i
                //jeżeli tak, rozpatrywana liczba nie będzie pierwsza (ma inny dzielnik niż 1 i ona sama)
                if (i % j == 0) {
                    //ustawienie 'flagi' na false, rozpatrywana liczba i nie jest pierwsza
                    isPrime = false;
                    //przerwanie dalszego poszukiwania dzielników, wystarczy nam tylko jeden (czyli trzeci poza 1 i samą liczbą i)
                    break;
                }
            }
            //sprawdzenie flagi i wypisanie na ekran tylko tych liczb i, które są pierwsze
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

}
