package pl.excercises.zad15;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //liczby wprowadzone przez użytkownika
        int[] numbers = {1, 1, 3, 10, 10, 10, 3, 8, 3, 1, 2, 10, 8, 3, 5, 5};

        //tablica wartości logicznych, zachowuje informacje czy data liczba była już sprawdzana
        //dla wartości 1 w podanej tablicy wystarczy porównać pierwszą z nich z pozostałymi liczbami
        //i zapamiętać ile razy wystąpiła (tutaj 4 razy)
        //potem nie ma już potrzeby powtórnego sprawdzania pozostałych 1 (jedynek)
        boolean[] visited = new boolean[numbers.length];
        //początkowo żadna z liczb nie została jeszcze odwiedzona, stąd false
        Arrays.fill(visited, false);

        //Pętla porónująca liczby
        for (int i = 0; i < numbers.length; i++) {
            //sprawdzenie czy dana liczba była już sprawdzona
            if(visited[i]) {
                //jeżeli dana liczba była już sprawdzona, pomiń ją (pomiń ten krok, obrót pętli)
                continue;
            }

            //zmienna pomocnicza, informuje o liczbie wystąpień danej liczby w tablicy
            int counter = 1;
            //pętla porównuje daną liczbę z pozostałymi. Nie porównuje liczby samej ze sobą, stąd (j = i + 1)
            for (int j = i + 1; j < numbers.length; j++) {
                //sprawdzenie czy liczby są takie same
                if (numbers[i] == numbers[j]) {
                    //jeżeli takie same to ustaw, że dana liczba była już spradzwona (true)
                    //zwiększa counter o 1
                    visited[j] = true;
                    counter++;
                }
            }
            //jeżeli dana liczba wystąpiłą więcej niż raz, wypisz ją na ekran
            if (counter > 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
