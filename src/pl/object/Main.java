package pl.object;

public class Main {

    public static void main(String[] args) {

        MyObject myObject_1 = new MyObject();

        System.out.println(myObject_1);
        System.out.println(myObject_1.getSize());

        MyObject myObject_2 = new MyObject(5, "MyObject2", 10.5);
        System.out.println(myObject_2.getName());

        myObject_1.setName("NewName");
        System.out.println(myObject_1.getName());

        myObject_1.equals(null);

        System.out.println(myObject_1.hashCode());
        System.out.println(myObject_2.hashCode());

        System.out.println(myObject_1.equals(myObject_2));
        System.out.println(myObject_2.equals(myObject_2));
    }
}
