package Collections.ArrayList;

import java.util.ArrayDeque;

public class TestArrayDeque {


    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();

        System.out.println("Використання в якості стеку");
        ad.push("Перший"); // метод інтерфуйсу Deque
        ad.push("Другий");
        ad.push("Третій");
        System.out.println("Перший елемент ArrayDeque: " + ad.getFirst());//Отримуємо перший елемент, але не видаляємо
        System.out.println("Вміст ArrayDeque: " + ad);
        System.out.println(ad.pop()); //Отримуємо і видаляємо з вершини стеку
        System.out.println(ad.pop()); //еквівалентно до removeFirst()
        System.out.println(ad.pop());
        //System.out.println(ad.pop()); //ArrayDeque порожній видасть NoSuchElementException
        System.out.println();
        System.out.println("Використання в якості черги");

        ad.offer("Перший");
        ad.offer("Другий");
        ad.offer("Третій");
        System.out.println("Перший елемент ArrayDeque: " + ad.getFirst());//Отримуємо перший елемент, але не видаляємо
        System.out.println("Вміст ArrayDeque: " + ad);
        System.out.println(ad.poll()); //витягнути і видалити з голови
        System.out.println(ad.poll());
        System.out.println(ad.poll());
        System.out.println(ad.poll());
    }
}
