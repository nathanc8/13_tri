import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = {4, 3, 7, 2, 9, 1, 8};
//        bubbleSort(arrayToSort);
//        System.out.println(Arrays.toString(arrayToSort));
        quicksort(arrayToSort);
//        System.out.println(Arrays.toString(arrayToSort));
    }

    public static int[] quicksort(int[] array) {
        int pivot = array[0];
        int higherNumberIndex = 0;
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= pivot) {
                //inversion des trucs &
                higherNumberIndex++;
                temp = array[i];
                array[i] = array[higherNumberIndex];
                array[higherNumberIndex] = temp;
            }
            List<Integer> infList = new ArrayList<Integer>();
            List<Integer> supList = new ArrayList<Integer>();
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