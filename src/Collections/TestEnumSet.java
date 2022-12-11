package Collections;


import java.util.EnumSet;

enum Colors {
    RED, GREEN, YELLOW, BLUE, BLACK
};

public class TestEnumSet {

    public static void main(String[] args) {
        // Створюємо множину
        EnumSet<Colors> set1, set2, set3, set4, set5;

        // Додаємо окремі елементи, порядок зберігання буде згідно порядку перелічення
        set1 = EnumSet.of(Colors.RED, Colors.GREEN,
                Colors.BLACK, Colors.BLUE);
        // Заповнити тими елемнтами, яких нема у вказаній множині
        set2 = EnumSet.complementOf(set1);
        // Всі із даного перелічення
        set3 = EnumSet.allOf(Colors.class);
        // Додати усі елементи перелічення в діапазоні від GREEN до BLACK
        set4 = EnumSet.range(Colors.GREEN, Colors.BLACK);
        // створити пусту множину перелічень відповідного типу
        set5 = EnumSet.noneOf(Colors.class);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
        System.out.println("Set 5: " + set5);
    }
}
