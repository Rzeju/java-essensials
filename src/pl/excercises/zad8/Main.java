package pl.excercises.zad8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);

        //Wprowadzenie przez użytkownika pierwszej liczby do działania
        System.out.print("Podaje pierwszą liczbę = ");
        float number1 = scanner.nextFloat();

        System.out.print("Podaj znak działania: ");
        //Przekazanie przez użytkownika znaku działania jak char
        //może odkomentować poniższe polecenie
        //char sign = scanner.next().charAt(0);

        //Przekazanie przez użytkownika znaku działania jako String
        String mySign = scanner.next();

        //Wprowadzenie przez użytkownika drugiej liczby do działania
        System.out.print("Podaj drugą liczbę = ");
        float number2 = scanner.nextFloat();

        //instrukcja switch
        switch (mySign) {
            //przypadek dla dodawania
            case "+":
                System.out.println("Wynik dodawania = " + (number1 + number2));
                break;
            //przypadek dla odejmowania
            case "-":
                System.out.println("Wynik odejmowania = " + (number1 - number2));
                break;
            //przypadek dla mnożenia
            case "*":
                System.out.println("Wynik mnożenia = " + (number1 * number2));
                break;
            //przypadek dla dzielenia
            case "/":
                //sprawdzenieczy dzielnia jest zerem (nie wolno dzielić przez zero!!)
                if (number2 == 0) {
                    System.out.println("Błąd");
                } else {
                    System.out.println("Wynik dzielenia = " + (number1 / number2));
                }
                break;
            //blok default (wszystkie pozostałe przypadki poza 4 wyróżnionymi znakami)
            //blok default jest wykonywany w przypadku jeśli nie zostanie wywołany żaden case
            default:
                System.out.println("Błędny znak");
                break;
        }
    }
}
