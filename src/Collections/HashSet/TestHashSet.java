package Collections.HashSet;

import java.util.HashSet;

public class TestHashSet {


    HashSet<String> hs = new HashSet<String>();

    public static void main(String[] args) {
        TestHashSet test = new TestHashSet();
        test.test();
    }

    void test() {
        hs.add("Австралія");
        hs.add("Україна");
        hs.add("США");
        System.out.println("1) Три країни: " + hs + " розмір=" + hs.size());
        hs.add("Австралія"); // помилки не буде, але в HashSet нічого не поміняється
        System.out.println("2) Після спроби додати Авcтралію ще раз: " + hs);
        hs.remove("США"); //видаляємо США з множини
        hs.add("Німеччина");
        hs.add("Англія");
        hs.add(null);
        hs.add(null); // другий раз не додаситься
        System.out.println("3)" + hs);
        System.out.println("4) Чи містить множина Німеччину? " + hs.contains("Німеччина"));
        System.out.println("5) Множина пуста? " + hs.isEmpty());
        //можемо також отримати ітератор, або ж перебрати множину у for earch
        for (String str : hs) {
            System.out.println(str);
        }
        hs.clear(); // очистити
        System.out.println("6) Розмір після очищення=" + hs.size());
    }
}
