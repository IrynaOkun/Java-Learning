package String;

import java.sql.SQLOutput;

public class aboutString {


    private static String[] array = {
            "Для", "работы", "со", "строками", "в", "языке", "Java",
            "используются", "классы", "String", "StringBuilder", "StringBuffer"
    };

    public static void main(String[] args) {

        System.out.println("_________СРАВНЕНИЕ СТРОК____________");

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        System.out.println(s1 + " equals " + s2 + " -> "
                + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> "
                + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> "
                + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> "
                + s1.equalsIgnoreCase(s4));

        System.out.println("_____СРАВНЕНИЕ СТРОК С ПОМ. МЕТОДА equals");

        String s11 = "Java";
        String s22 = "Java";
        String s33 = new String("Java");
        String s44 = new String(s11);
        System.out.println("s1==s2 : " + (s11 == s22));
        System.out.println("s3==s4 : " + (s33 == s44));
        System.out.println("s1==s3 : " + (s11 == s33));
        System.out.println("s1 equals s2 : " + s11.equals(s22));
        System.out.println("s1 equals s3 : " + s11.equals(s33));

        System.out.println("__________СРАВНЕНИЕ ПОДСТРОК____________");

        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("Foobar".contains("oo"));
        System.out.println("Hello world!!!".regionMatches(6, "world", 0, 3));

        System.out.println("_____________COMPAREToo VS BUBBLE___________");

        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[i].compareTo(array[j]) < 0) {
                    String t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }

                System.out.println(array[i]);
            }
        }

        System.out.println("_______ИЗВЛЕЧЕНИЕ СИМВОЛОВ__________");

        char ch = "аbс".charAt(1);
        System.out.println(ch);

        System.out.println("________Поиск подстроки или символа в строке в Java______________");

        String s = "Для работы со строками в языке Java используются "
                + "классы String, StringBuilder, StringBuffer.";

        System.out.println(s);
        System.out.println("indexOf(S) = "
                + s.indexOf('S'));
        System.out.println("lastIndexOf(r) = "
                + s.lastIndexOf('r'));
        System.out.println("indexOf(String) = "
                + s.indexOf("String"));
        System.out.println("lastIndexOf(String) = "
                + s.lastIndexOf("String"));
        System.out.println("indexOf(S, 60) = "
                + s.indexOf('S', 60));
        System.out.println("lastIndexOf(S, 70) = "
                + s.lastIndexOf('S', 70));


        System.out.println("________Методы concat(), replace(), toLowerCase(), toUpperCase(), trim()\n_______");

        System.out.println("Hello".concat(" World"));
        System.out.println("Hello".replace('l', 'w'));
        System.out.println("Hello".toLowerCase());
        System.out.println("Hello".toUpperCase());
        System.out.println("    Hello World ".trim());


        System.out.println("______subString_________");

        System.out.println("Welcome to Kharkiv!!!".substring(10));
        System.out.println("Welcome to Kharkiv!!!".substring(10, 18));

        System.out.println("____JOIN________");

        String result = String.join(" ", "foobar", "foo", "bar");
        System.out.println(result);

        System.out.println("_______isEmpty___isBank______");

        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());

        System.out.println();

        String s10 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = s10.toCharArray();
        System.out.println(helloArray);


        System.out.println();



        Integer i = new Integer(432);

        System.out.println("ОБОЛОЧКИ ");

        //toString

        String ss = i.toString();

        System.out.println(ss);

        System.out.println();

        //parseInt

        String sa = "1166628";

        Integer ii = Integer.parseInt(sa);

        System.out.println(ii);



    }
}
