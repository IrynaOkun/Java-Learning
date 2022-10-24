package JavaCore;

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






    }
}
