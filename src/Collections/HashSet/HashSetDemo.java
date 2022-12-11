package Collections.HashSet;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>();

        System.out.println("Adding element into hashSet...");
        hashSet.add("Charlie");
        hashSet.add("Delta");
        hashSet.add("Alpha");
        hashSet.add("Echo");
        hashSet.add("Bravo");

        System.out.println("hashSet content:");
        System.out.println(hashSet);
    }
}
