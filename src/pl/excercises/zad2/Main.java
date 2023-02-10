package pl.excercises.zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoją wagę w kilogramach = ");
        //Skaner pobiera liczbę typu float wpisaną przez użytkownika
        float weight = scanner.nextFloat();
        System.out.print("Podaj swój wzrost w centrymetrach = ");
        //Skaner pobiera liczbę typu int wpisaną przez użytkownika
        int height = scanner.nextInt();

        //Zamian wzrostu z centymetrów na metry (pamiętaj aby przy dzieleni jedna z liczb była typu float lub double)
        float heightInMeters = height / 100f;

        //Obliczenie wartości wskaźnika BMI
        double BMI = weight / Math.pow(heightInMeters, 2);

        //Instrukcja warunkowa drukująca na ekranie odpowiednią informację w zależności od wartości BMI
        //Zwróc uwagę na zapis łączenia ze sobą dwóch warunków symbolem '&&' (koniunkcja, 'i', iloczyn logiczny)
        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI optymalne - " + BMI);
        } else {
            System.out.println("BMI Nieoptymalne - " + BMI);
        }

        //ROZWIĄZANIE OBIEKTOWE

        //Utworzenie obiektu typu Bmi i przekazanie w konstruktorze danych (waga, wzrost)
        Bmi bmi = new Bmi(weight, height);
        //Wywołanie metody obliczającej Bmi i drukującej na ekranie odpowiedni komunikat
        bmi.calculateBmi();

    }

}
