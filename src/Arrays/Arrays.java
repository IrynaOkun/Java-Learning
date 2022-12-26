package Arrays;

import org.w3c.dom.ls.LSOutput;

public class Arrays {

    public static void main(String[] args) {

        int new_array[];
        int[] new_array1;
        int[] new_array2 = {1, 2, 3, 4, 5, 6, 567};

        new_array = new int[5];
        new_array[0] = 5;
        new_array[1] = 10;
        new_array[2] = 15;
        new_array[3] = 20;


        new_array1 = new int[]{1, 2, 3, 4, 5, 6};


        System.out.println(new_array[1]);
        System.out.println(new_array1[0]);
        System.out.println(new_array2[6]);

        System.out.println(new_array.length);

        System.out.println(new_array2[new_array2.length - 1]);

        System.out.println();
        // for

        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array2[i]);

        }

        System.out.println("printing Array");

        System.out.println(new_array1.toString());

        // for EACH (
        //Позволяет пройти весь массив без использования индекса переменной

        System.out.println();
        System.out.println("_____________________");

        for (int el : new_array2) {
            System.out.print(el + " ");
        }

        System.out.println();

        int[] myArray = new int[10]; // создали массив целых чисел на 10 элементов и присвоили ему имя myArray
        System.out.println(myArray.length); // вывели в консоль длину массива, то есть количество элементов,
        // которые мы можем поместить в массив

        System.out.println();

        String[] seasons = new String[4]; /* объявили и создали массив. Java выделила память под массив из 4 строк, и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)*/

        seasons[0] = "Winter"; /* в первую ячейку, то есть, в ячейку с нулевым номером мы записали строку Winter. Тут мы получаем доступ к нулевому элементу массива и записываем туда конкретное значение  */
        seasons[1] = "Spring"; // проделываем ту же процедуру с ячейкой номер 1 (второй)
        seasons[2] = "Summer"; // ...номер 2
        seasons[3] = "Autumn"; // и с последней, номер 3
        System.out.println(seasons);

        //инициализация плюс

        String[] seasons2 = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        String[] seasons3 = {"Winter", "Spring", "Summer", "Autumn"};

        //вывод на печать

        String[] seasons4 = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons4[i]);
        }

        //
        System.out.println("___________________");



//        int[] array6 = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив
//        System.out.println(array6);//пытаемся вывести наш массив на экран без метода toString - получаем 16-ричное число
//        System.out.println(Arrays.toString(array6));//печатаем массив "правильно"
//        Arrays.sort(array6, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
//        System.out.println(Arrays.toString(array6));//выводим отсортированный массив на экран
//        int key = Arrays.binarySearch(array6, 5); // ищем key - число 5 в отсортированном массиве.
//        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
//        System.out.println(key);//распечатываем индекс искомого числа
//        //System.out.println(Arrays.binarySearch(array, 0));//а теперь попробуем найти число, которого в массиве нет,
//        // и сразу же выведем результат на экран



    }

}
