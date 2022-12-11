package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();//создание нового списка
            stringList.add("Ivan");//добавление элементов
            stringList.add("Elena");
            stringList.add("Sergey");
            System.out.println(stringList.size());//размер списка
            stringList.get(1);//получения элемента по индексу (начинается с 0 элемента)
            boolean isEmpty = stringList.isEmpty();//проверка списка на пустоту
            System.out.println(isEmpty);
            System.out.println("Просто вывод элементов");
            stringList.stream().forEach(s-> System.out.println(s));//очень полезный метод стрим
            stringList.stream().filter(s-> s.startsWith("I")).map(String::toLowerCase).forEach(System.out::println);
        }

}
