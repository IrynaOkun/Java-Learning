package Loop;

public class LoopS {

    public static void main (String[] Args) {
        System.out.println("_______ВЛОЖЕННЫЕ ЦИКЛЫ________");
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        int ii, jj, a = 0;

        for (ii = 1; ii < 10; ii++) {
            for (jj = 1; jj < 10; jj++) {
                a = ii * jj;
                System.out.print(a + " | ");
            }
            System.out.println();
        }


        System.out.println("__________FOR VS WHILE__________");

        for(int iii = 10; iii > 0; iii--){
            System.out.println("Отсчёт пошёл... " + iii);
        }

        System.out.println();

        int iiii = 10;
        while(iiii > 0){
            System.out.println("Отсчёт пошёл... " + iiii);
            iiii--;
        }

        System.out.println("______________");

        int i2 = 1;
        while (i2 < 8) {
            System.out.print(i2 + " ");
            i2++;
        }


        //no one time
        int i3 = 1;
        while (i3 < 0) {
            System.out.print(i3 + " ");
            i3++;
        }

        //зацикливание

//        int i4 = 1;
//        while (true) {
//            System.out.print(i4 + " ");
//            i4++;
//        }

        int i5 = 100;
        while ( i5 >= 10){
            System.out.println( "Обратный отсчет:" + i5);
            i5-=10;
        }

        System.out.println("__________DO_____WHILE_________");

        int i6 = 1;
        do {
            i6++;
            System.out.print(i6 + " ");
        } while(i6 < 0);

        System.out.println("____FOR_____");

        for (int i7 = 1; i7 <= 5; i7++) {
            System.out.println ("Супер!");
        }

        System.out.println("_______FOR_EACH_____!!!!!!!____");

        String[] daysOfWeek =
                { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };


        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }
    }
}
