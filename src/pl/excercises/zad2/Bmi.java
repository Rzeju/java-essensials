package pl.excercises.zad2;

//Klasa Bmi
public class Bmi {

    //prywatne pole przechowujące wagę w kilogramach
    private float weight;
    //prywatne pole przechowujące wzrost w metrach
    private float height;

    //Konstruktor przyjmujący dwa parametry, wagę w kilograamch i wzrost w centymetrach
    public Bmi(float weightInKilograms, int heightInCentimeters) {
        this.weight = weightInKilograms;
        //Zamiana wzrostu wcentymetrach na metry (zamiana taka może odbywać się już w konstruktorze)
        this.height = heightInCentimeters / 100f;
    }

    //Metoda obliczająca wartość Bmi i drukująca odpowiedni komunikat na ekran
    //Metoda ta nie zwraca żadnej wartości (void)
    public void calculateBmi() {
        //Obliczenie wartości Bmi
        double BMI = weight / Math.pow(height, 2);

        //Instrukcja warunkowa drukująca na ekranie odpowiednią informację w zależności od wartości BMI
        //Zwróc uwagę na zapis łączenia ze sobą dwóch warunków symbolem '&&' (koniunkcja, 'i', iloczyn logiczny)
        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI Optymalne" + BMI);
        } else {
            System.out.println("BMI Nieoptymalne" + BMI);
        }
    }
}
