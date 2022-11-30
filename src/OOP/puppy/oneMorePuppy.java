package OOP.puppy;

public class oneMorePuppy {

    public oneMorePuppy(String name) {
        // This constructor has one parameter, name .
        System.out.println("Passed Name is :" + name);
    }

    public static void main(String[] args) {
        // Following statement would create an object myPuppy
        oneMorePuppy myPuppy = new oneMorePuppy("tommy");
    }
}
