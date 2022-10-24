package Algorithms;

public class FindMaxElemInArray {

    public static void main(String[] args) {
        int[] array = {1, 22, 3, 4, 5, 62};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }


}
