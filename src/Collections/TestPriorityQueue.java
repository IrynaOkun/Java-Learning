package Collections;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(11);
        pq.add(750);
        pq.add(50);
        pq.offer(1);
        pq.add(300);
        pq.add(25);
        pq.add(2);
        pq.offer(20);
        pq.add(5);
        pq.add(40);
        System.out.println("Порядок зберігання елементів" + pq);

        // Отримуємо і видаляємо елемент з голови черги
        while (!pq.isEmpty()) {
            System.out.println("Отримали: " + pq.poll());
            System.out.println("Новий порядок:" + pq);
        }
    }
}
