package pl.excercises.zad14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //pierwszy argument
        char firstLetter = scanner.next().charAt(0);
        //drugi argument
        char secondLetter = scanner.next().charAt(0);

        int result = 0;
        //warunek sprawdzający czy podane litery są małe i z przedziału a-z
        //wartości liczbowe znaków zaciągnięte z tablicy ASCII
        if ((firstLetter < 'a' || firstLetter > 'z') || (secondLetter < 'a' || secondLetter > 'z')) {
            //wypisanie informacji o błędnie wprowadzonych literach
            System.out.println("Podaj tylko małe litery");
        } else if (firstLetter == secondLetter) {
            //przy dwóch takich samych znakach
            System.out.println("Podałeś dwie takie same litery. Brak znaków między nimi");
        } else {
            //obliczenie liczby znaków pomiędzy przekazanymi literami
            result = Math.abs(firstLetter - secondLetter) - 1;
            //wyświetlenie wyniku na ekran
            System.out.println("Odległość między literami to = " + result);
        }
    }
}
