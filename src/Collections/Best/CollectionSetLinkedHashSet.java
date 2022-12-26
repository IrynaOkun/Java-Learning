package Collections.Best;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSetLinkedHashSet {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("banana");
        //fruits.add("apple");
        System.out.println(fruits);
    }
}
