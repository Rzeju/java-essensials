package pl.code_cool;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //deklaracja zmiennej a
        int a;

        //inicjalizacja zmiennej b
        int b = 5;

        a = 10;

        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int d = 10 / 3;

        System.out.println(d);

        long myLong = 1000000000000000L;

        float myFloat = 143.5435345f;

        double myDouble = 1475.3214432535;
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        boolean myTrue = true;
        boolean myFalse = false;
        System.out.println(myTrue);
        System.out.println(myFalse);
        System.out.println(myFalse || myTrue);
        System.out.println(myFalse && myTrue);


    }
}
