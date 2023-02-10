package pl.excercises.zad6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);

        //Przypisanie do zmiennej liczby podanej przez użytkownika
        System.out.print("Podaj liczbę naturalną: ");
        int number = scanner.nextInt();

        //zmienna pomocnicza do przechowania sumy
        double suma = 0;
        //pętla zliczająca sumę odwrotności kolejnych liczb do n włącznie
        for (double i = 1; i <= number; i++) {
            System.out.printf(" + %f", 1 / i);
            suma = suma + 1 / i;
        }
        System.out.println(" ");
        System.out.println("Suma to: " + suma);
    }
}
