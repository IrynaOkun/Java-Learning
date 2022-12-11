package Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedList {

    private LinkedList<Car> ll=new LinkedList<>();

    public static void main(String[] args) {
        TestLinkedList t=new TestLinkedList();
        t.test();

    }
    void test(){
        Car car1=new Car("Ferrary", 10800, 1995);
        Car car2=new Car("Запорожець", 2600, 1989);
        ll.add(car1);
        ll.add(car2);
        //додаємо в початок списку
        ll.addFirst(new Car("Alfa Romeo 155", 11678, 2000));
        ll.remove(car2); // видалити об'єкт
        System.out.println("Після видалення car2: "+ll);
        ll.remove(1); //видалити елемент за індексом
        System.out.println("Після видалення першого елементу: "+ll);
        Car myCar=ll.get(0);
        System.out.println("Отриманий елемент за індексом [0]:"+myCar);
        ll.set(0, car1); //замінити елемент за індексом
        System.out.println("Замінений елемент за індексом [0]"+ll.get(0));
        ArrayList<Car> arrList=new ArrayList<Car>();
        arrList.add(car1);
        arrList.add(car2);
        ll.addAll(arrList); //додаємо вміст ArrayList у наш LinkedList
        System.out.println("Після додавання ArrayList:"+ll);
    }
}
