package Arrays;

public class Arrays_2 {

    public static void main(String[] args) {

        int number = 10; // рпимитивный тип данных. Значения лежат в коробке [10]
        char character = 'a'; //примитивный тип данных

        String s = "Hello"; //Ссылочный тип данных. Класс String, имя переменной = Объект класса стринг
        String s1 = new String("Hello"); //Переменные(пульты) ссылаются на эти объекты, которые где-то лежат

        //Ссылочный тип данных
        int[] numbers = new int[5]; //переменная numbers ссылается на новый объект класса массив; numbers => [массив]
        System.out.println(numbers[0]); // 0 1 2 3 4
        //System.out.println(numbers[5]); error: ArrayIndexOutOfBoundsException

        numbers[0] = 10;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();
        //Инициализация массива
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }



    }
}
