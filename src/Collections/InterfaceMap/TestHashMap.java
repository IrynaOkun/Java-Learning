package Collections.InterfaceMap;

import java.util.HashMap;
import java.util.*;
import java.util.Set;


public class TestHashMap {

    public static void main(String[] args) {
        // створюємо об'єкт HashMap з назвою capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // додаємо ключі і значення (Країна, Столиця)
        capitalCities.put("Англія", "Лондон");
        capitalCities.put("Німеччина", "Берлін");
        capitalCities.put("Норвегія", "Осло");
        capitalCities.put("США", "Вашингтон");
        //вивести значення об'єкту capitalCities
        System.out.println(capitalCities);
        //звернутися до HashMap використовуючи ключ
        System.out.println(" Отримати столицю США");
        System.out.println(capitalCities.get("США"));
        //Видалити Англію
        System.out.println(" Видаляємо Англію");
        capitalCities.remove("Англія");
        System.out.println(capitalCities);
        //видалити все можна так
        //capitalCities.clear();
        // друкуємо ключі
        System.out.println(" Ключі:");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // друкуємо значення
        System.out.println(" Значення:");
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        // Друкувати ключі і значення
        System.out.println(" Ключі і значення:");
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        System.out.println("Використовуємо Map.Entry");
        //одержати множину входжень
        Set<Map.Entry<String, String>> set = capitalCities.entrySet();
        //вивести множину входжень
        for (Map.Entry<String, String> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}
