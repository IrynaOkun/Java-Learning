package Collections.Best;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetTreeSet {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add("banana");
        //fruits.add("apple");
        System.out.println(fruits);
    }
}
