package pl.excercises.zad3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);

        //Pobranie wartości współczynników a, b i c
        System.out.print("Podaj wartość a = ");
        int a = scanner.nextInt();
        System.out.print("Podaj wartość b = ");
        int b = scanner.nextInt();
        System.out.print("Podaj wartość c = ");
        int c = scanner.nextInt();

        Quadratic quadratic = new Quadratic(a, b, c);
        quadratic.calculateSolution();

        //Obliczenie delty
        double delta = (Math.pow(b, 2) - 4 * a * c);
        System.out.println("Delta = " + delta);

        //Delta mniejsza zero, koniec programu
        if (delta < 0) {
            System.out.println("Delta ujemna, nie ma rozwiązania");
            //rozwiązanie równania kwadratowego, delta większa 0
        } else if (delta >= 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 = %.2f - x2 = %.2f", x1, x2);
            //System.out.printf("x2 = %.2f%n", x2);
        }
    }
}
