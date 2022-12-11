package Collections.InterfaceMap;

import java.util.TreeMap;
import java.util.*;


public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> countries = new TreeMap<String, Integer>();
        countries.put("Гваделупа", 1);
        countries.put("США", 2);
        countries.put("Гаваї", 3);
        countries.put("Бельгія", 4);
        //вивести вміст
        System.out.println(countries);
        //вивести останній ключ
        System.out.println("Останній ключ:" + countries.lastKey());
        countries.put("Албанія", 5);

        System.out.println(" Вміст зіставлення:");
        // взяти множину входжень
        Set<Map.Entry<String, Integer>> set = countries.entrySet();
        // Вивести елементи
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }

}
