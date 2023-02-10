package pl.excercises.zad3;

public class Quadratic {

    private int a;
    private int b;
    private int c;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calculateDelta() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public void calculateSolution() {
        double delta = calculateDelta();
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
