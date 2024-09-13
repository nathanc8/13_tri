import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = {4, 3, 7, 2, 9, 1, 8};
//        bubbleSort(arrayToSort);
//        System.out.println(Arrays.toString(arrayToSort));
        something(arrayToSort);
//        System.out.println(Arrays.toString(arrayToSort));
    }

    public static int[] something(int[] array) {
        int pivot = array[0];
        int currentIndex = 0;
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            if (pivot < array[i]) {
                //inversion des trucs
                currentIndex++;
                temp = array[i];
                array[i] = array[currentIndex];
                array[currentIndex] = temp;
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array.length - i - 1; j > 0; j--)
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
        return array;
    }

}