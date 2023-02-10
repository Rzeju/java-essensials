package pl.excercises.zad9;

public class TrivialSolution {

    public static void main(String[] args) {

        //długość fali, liczba trójkątów
        int size = 3;

        //liczba spacji pomiędzy gwiazdaki w tej samej linii
        int spacesBetween = 6;
        //liczba spacji pomiędzy gwiazdkami oddzielnych fal
        int spacesBefore = 1;

        //pętle dla fali o wysokości 4
        for (int i = 0; i < 4; i++) {

            //pętla rysująca falę pinia po linii
            for (int j = 0; j < size; j++) {

                //pętla drukująca spacje pomiędzy osobnymi falami
                for (int x = 0; x < spacesBefore - 1; x++) {
                    System.out.print(" ");
                }

                //kolejną gwizdkę w rzędzoe
                System.out.print("*");

                //pętla drukująca spacje pomiędzy gwizdkami tej samej fali
                for (int y = 0; y < spacesBetween; y++) {
                    System.out.print(" ");
                }

                //kolejna gwiazdka
                System.out.print("*");

                for (int x = 0; x < spacesBefore; x++) {
                    System.out.print(" ");
                }
            }
            //złamanie wiersza
            System.out.print("\n");

            //modyfikacja odległości pomiędzy gwiazdkami
            spacesBefore = spacesBefore + 1;
            spacesBetween = spacesBetween - 2;
        }
    }
}
