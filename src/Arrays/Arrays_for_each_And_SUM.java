package Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class Arrays_for_each_And_SUM {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        //Cсылочные типы данных являются классами (как класс мейн, класс Arrays_for_each)

        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Джава";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        System.out.println("_________________________");

        for(int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("__________________________");
        //For each - пишем тип, затем имя переменной, которая будет использоваться внутри этого цикла, и затем имя
        // массива. Т.е. мы хотим внутри этого цикла работать со строкой, можно любое имя, например х
        for (String string: strings) {
            System.out.println(string);
        }

        System.out.println("___________________________");
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int x : numbers1) {
            sum = sum + x;
            //sum += x;
        }
        System.out.println(sum);

        System.out.println("__________________________");
        int value = 0;
        String s; // выделили память только под ссылку
        //System.out.println(s); пока она не проинициализирована, на экран вывести нельзя
        String s1 = "Hello"; // Тут уже выделяется память под строку. Дом Hello с адресом s1

        String s3 = null; // пустота, нично, "черная дыра"/ Специальный тип
        System.out.println(s3);


        System.out.println("_____________just____________");

        int[] nums = { 1, 2, 3, 4, 5 };
        int sum1 = 0;

        for(int i = 0; i < 5; i++)
            sum1 += nums[i];

        System.out.println(sum1);

        System.out.println("________FOR _EACH_______");

        int[] nums2 = { 1, 2, 3, 4, 5 };
        int sum2 = 0;

        for(int i : nums2)
            sum2 += i;

        System.out.println(sum2);

        System.out.println("________break__________");

        int[] nums3 = { 1, 2, 3, 4, 5 };
        int sum3 = 0;

        for(int i : nums3) {
            sum3 += i;
            if(i == 3) break;// останавливаем цикл, если значение равно 3

        }

        System.out.println(sum3);

        System.out.println("____поиск значений в неупорядоченном массиве________");

        int[] nums4 = { 3, 1, 6, 4, 9, 5, 8, 2 };

        int val = 5;
        boolean found = false;

// ищем значение 5 в массиве
        for (int x : nums4) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Значение найдено");
        }

        System.out.println("Arrays plus Loop");

        boolean[] arr = new boolean[1000];

        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println();

        boolean[] arr1 = new boolean[1000];

        for( int i = 0; i< arr1.length; i++){
            arr1[i] = true;
        }

        for( int i = 0; i< arr1.length; i++){
            System.out.println(arr1[i]);
        }

        //чередуем

        boolean[] arr2 = new boolean[1000];

        for( int i = 0; i< arr2.length; i=i+2){
            arr2[i] = true;
        }

        for( int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }

        //сумма элементов массива
        System.out.println("__________sumOfarrays________");

        int[] array3 = new int[3];

        array3[0]=5;
        array3[1]=17;
        array3[2]=350;

        int sum4 = 0;

        for( int i = 0; i < array3.length; i++){
            sum += array3[i];
        }

        for( int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }

        System.out.println("Сумма - "+ sum);


    }
}
