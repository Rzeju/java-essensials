package pl.loops;

public class LoopsExample {

    public static void main(String[] args) {

        int result = 0;
        for (int i = 0; i < 5; i++) {
             result = result + i;
             //result += i;
        }

        System.out.println(result);

        int[] myArray = new int[10];
        myArray[2] = 10;
        myArray[4] = 12;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        int j = 0;
        for (int number : myArray) {
            j++;
        }

        int counter = 0;
        while (counter < 10) {
            System.out.println("Jest to " + counter + " obrót pętli");
            counter++;
        }

        counter = 0;
        while (true) {
            System.out.println("Niekończona pętla while, obrót - " + counter);
            if (counter >= 5) {
                break;
            }
            counter++;
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("Kolejna parzysta liczba " + i);
        }

        do {
            System.out.println("Kod w 'do' wykona się przynajmniej raz");
        } while (false);
    }
}
