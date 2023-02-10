package pl.object;

import java.util.Objects;

public class MyObject {

    private int size;
    private String name;
    private double weight;

    public MyObject() {
    }

    public MyObject(int size, String name, double weight) {
        this.size = size;
        this.name = name;
        this.weight = weight;
    }

    public MyObject(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return size == myObject.size && Double.compare(myObject.weight, weight) == 0 && Objects.equals(name, myObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name, weight);
    }
}
