package Algorithms;

import java.util.Arrays;
import java.lang.reflect.Array;

public class BubbleSort {

    //BubbleSort

    public static void main(String[] args) {

        int[] array = new int[] {2, 56, 12, -45, 0, 23};
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 2; j >= i; j--) {
                    if (array[j] > array[i]) {
                        int temp = array[j + 1];
                        array[j+1] = array[j];
                        array[j] = temp;
                    }
                }
            }

        System.out.println(Arrays.toString(array));

            


    }
}
