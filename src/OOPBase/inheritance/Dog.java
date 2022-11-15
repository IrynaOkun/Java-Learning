package OOPBase.inheritance;

public class Dog extends Animal{

    //static
    static String name = "Dog";

    public static void getName() {
        System.out.println(name);
    }

    //no static
    String nameNoStatic = "Dog";

    public void getNameNoStatic() {
        System.out.println(nameNoStatic);
    }

}
