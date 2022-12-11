package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class SolarSystem {

    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
//        solarSystem.add("mercury");
//        solarSystem.add("venus");
//        solarSystem.add("earth");
//        solarSystem.add("mars");
//        solarSystem.add("jupiter");
//        solarSystem.add("saturn");
//        solarSystem.add("uranos");
//        solarSystem.add("neptune");

        System.out.println(solarSystem);
        //solarSystem.sort();
        //System.out.println(solarSystem.sort());
//
//        ArrayList<Integer> numbers = new ArrayList<>(Array.asList(1,2,3,4,5,6,7));
//        System.out.println(Collection.max(numbers));
//        System.out.println(Collection.min(numbers));


    }
}
