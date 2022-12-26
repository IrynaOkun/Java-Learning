package Collections.Best;

import java.util.ArrayList;
import java.util.List;

public class CollectionListLinkedList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add(2, "");
        System.out.println(fruits);
    }
}
