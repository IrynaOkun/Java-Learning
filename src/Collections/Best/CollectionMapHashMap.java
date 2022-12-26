package Collections.Best;

import java.util.HashMap;
import java.util.Map;

public class CollectionMapHashMap {
    public static void main(String[] args) {
//        Map<String, Integer> fruits = new HashMap();
//        fruits.put("apple", 5);
//        fruits.put("cherry", 6);
//        fruits.put("banana", 6);
//        fruits.put("apple", 4);
//        System.out.println(fruits);

        Map<String, Integer> fruits = new HashMap();
        fruits.putIfAbsent("apple", 5);
        fruits.putIfAbsent("cherry", 6);
        fruits.putIfAbsent("banana", 6);
        fruits.putIfAbsent("apple", 4);
        System.out.println(fruits);
    }
}
