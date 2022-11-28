package Static_Issue;

public class Static_Variable {
    public static void main(String[] args) {

        double radius = 60;
        System.out.printf("Radisu: %f \n", radius);             // 60
        System.out.printf("Area: %f \n", Math.PI * radius);     // 188,4
    }
}
class Math{
    public static final double PI = 3.14;
}


