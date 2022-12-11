package Collections.LinkedList;

public class Car {
    private String name;
    private double price;
    private int year;
    public Car(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year=year;
    }
    @Override
    public String toString() {
        return "\n Car [name=" + name + ", price=" + price + ", year=" + year
                + "]";
    }
}
