package pl.excercises.zad1;

//klasa Circle (opisuje koło)
public class Circle {

    //średnica koła - pole finalne, jego wartość nie może się zmienić
    private final float diameter;

    //konstruktor klasy Circle
    public Circle(float diameter) {
        this.diameter = diameter;
    }

    //getter dla pola diameter (zwraca wartość pola diameter)
    public float getDiameter() {
        return diameter;
    }

    //metoda obliczająca obwód koła (zwraca obliczoną wartość obwodu koła)
    public double calculatePerimeter() {
        return diameter * Math.PI;
    }
}
