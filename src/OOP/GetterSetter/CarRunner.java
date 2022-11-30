package OOP.GetterSetter;

public class CarRunner {

    public static void main(String[] args) {

        Car bmw = new Car();

        bmw.setType("BMW");
        System.out.println("Car type (using getter): " + bmw.getType());
        System.out.println("Car Info (using toString() method): " + bmw);
    }

}
