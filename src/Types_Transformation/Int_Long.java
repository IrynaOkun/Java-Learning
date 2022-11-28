package Types_Transformation;

public class Int_Long {

    public static void main(String[] args) {

        int bigNumber = 10000000;

        byte littleNumber = 16;

        bigNumber = littleNumber;
        System.out.println(bigNumber);

        System.out.println("___________________");
//матрьошка
        int bigNumber2 = 10000000;

        short littleNumber2 = 1000;

        //littleNumber2 = bigNumber2;//ошибка!

        littleNumber2 = (short) bigNumber2;

        System.out.println(littleNumber2);

        System.out.println("________________");

        double d = 2.7;

        long x = (int) d;
        System.out.println(x);


        System.out.println("________CHAR___________");

        char c = '!';
        char z = 'z';
        char i = '8';

        int x1 = 32816;

        char c1 = (char) x1;
        System.out.println(c1);

        System.out.println("__________[]__________");

        char c2 = '1';

        int i2 = 1;

        System.out.println(i2 + (char) c2);


        class Test {
            double aaa = 128;
            byte bbb = (byte) aaa;
            //System.out.println(bbb); //error(в консоли увидим -128)
        }

        double a=11.2345;
        int b=(int)a;
        System.out.println(b); // в консоли получится число 11
    }


}

