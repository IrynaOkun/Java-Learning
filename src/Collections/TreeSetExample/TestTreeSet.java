package Collections.TreeSetExample;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    ClassComparator comp = new ClassComparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };
    TreeSet<Car> ts1 = new TreeSet<>(comp);

    public static void main(String[] args) {
        TestTreeSet t = new TestTreeSet();
        t.test();
    }

    void test() {
        Car car1 = new Car("Ferrary", 12000, 1988);
        Car car2 = new Car("Ford", 13000, 1955);
        Car car3 = new Car("Toyota", 13500, 2003);
        Car car4 = new Car("Citroen", 12000, 2014);
        Car car5 = new Car("Mercedes-Benz", 15000, 2011);
        ts1.add(car1);
        ts1.add(car2);
        ts1.add(car3);
        ts1.add(car4);
        ts1.add(car5);
        System.out.println("Сортування по роках: " + ts1);
        //Зворотній компаратор для TreeSet(Java8)
        TreeSet<Car> ts2 = new TreeSet<>(comp.reversed());
        ts2.addAll(ts1); //додати вміст попереднього TreeSet у новий
        System.out.println("Зворотнє сортування:" + ts2);
    }

}
