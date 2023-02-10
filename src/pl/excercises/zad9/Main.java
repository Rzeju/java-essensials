package pl.excercises.zad9;

public class Main {

    public static void main(String[] args) {

        int width = 5;
        int height = 7;

        for (int x = 0; x < height; x++) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height * 2 + 1; j++) {
                    if (j == x || j == 2 * height - x - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
