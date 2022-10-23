package JavaCore;

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


        new_array1 = new int[] {1, 2, 3, 4, 5, 6};


        System.out.println(new_array[1]);
        System.out.println(new_array1[0]);
        System.out.println(new_array2[6]);

        System.out.println(new_array.length);

        System.out.println(new_array2[new_array2.length - 1]);

        //



    }
}
