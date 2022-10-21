public class FindElementInArray {

    //ЛИНЕЙНЫЙ ПОИСК


    public static int searchLinear(int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {

                return i;
            }
        }

        return -1;
    }

    //with text


    public static int searchLinearText(int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("searching at index: " + i + " , value: " + array[i]);
            if (array[i] == elementToFind) {
                System.out.println("found at index: "+ "\t" + i + " , value: " + array[i]);

                return i;
            }
        }
        System.out.println("not found: " + elementToFind);

        return -1;
    }


    public static void main(String[] args) {

        int[] array = new int[] {45, 11, 22, -56, 44, 23, -88, 45, 12, 34, 65, 89};

        System.out.println(searchLinear(array, 12));
        System.out.println();
        System.out.println(searchLinearText(array, 12));
    }

}
