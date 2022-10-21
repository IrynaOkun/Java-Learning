package Algorithms;

public class AlgoFindMinElemInArrayr {

    public static void main(String[] args) {

        int [] array = {56, 23, 89, 12, 45, -67, 23, 78, 23, 90, 43};
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);



    }
}
