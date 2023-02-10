package pl.excercises.zad1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Rozwiązanie nieobiektowe!!!!!!!!

        //Utworzenie skanera do pobierania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        //komunikat dla usera
        System.out.print("Podaj średnicę okręgu d = ");
        //pobranie wartości średnicy koła
        float diameter = scanner.nextFloat();
        //obliczenie obwodu koła
        double perimeter = diameter * Math.PI;
        //wyświetlenie odpowiedzi
        System.out.printf("Obdów okręgu o średnicy d = %f, wynosi Ob = %f%n", diameter, perimeter);


        //Rozwiązanie obiektowe!!!!!

        //Utworzenie obiektu typu Circle (koło) dla podanej przez użytkownika średnicy
        Circle circle = new Circle(diameter);
        //obliczenie obwodu metodą obiektu circle
        double perimeterFromObject = circle.calculatePerimeter();
        //wyświetlenie wyniku
        System.out.printf("OBIEKTOWO ---> Obwód okręgu o średnicy d = %f, wynosi Ob = %f", diameter, perimeterFromObject);
    }
}
