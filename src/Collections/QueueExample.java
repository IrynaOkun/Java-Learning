package Collections;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer comp1, Integer comp2) {//настроили метод таким образом, что элементы будут добавляться в обратном порядке
                if (comp1 > comp2) {
                    return -1;
                }
                if (comp1 < comp2) {
                    return 1;
                }
                return 0;
            }
        };
        Queue<Integer> priorityQueue = new PriorityQueue<>(10, comparator);
        priorityQueue.add(7);
        priorityQueue.add(4);
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(80);
        System.out.println(priorityQueue);

        System.out.println();


        Queue<Integer> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add(7);
        priorityQueue2.add(4);
        priorityQueue2.add(9);
        priorityQueue2.add(1);
        priorityQueue2.offer(80);//добавление
        System.out.println(priorityQueue2);
        System.out.println(priorityQueue2.poll());//удаление сверху
        System.out.println(priorityQueue2.peek());//получить верхний
        System.out.println(priorityQueue2);

    }
}
