package Collections.Best;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMapTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new TreeMap<>();
        fruits.putIfAbsent("apple", 5);
        fruits.putIfAbsent("cherry", 6);
        fruits.putIfAbsent("banana", 6);
        fruits.putIfAbsent("apple", 4);
        System.out.println(fruits);
    }
}
