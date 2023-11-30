import java.util.Arrays;

//this code run and test the QuickSort algo

public class Main {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);

        return swapIndex;
    }


    // WRITE QUICKSORT HELPER METHOD HERE //
    public static void quickSortHelper(int[] array, int left,int right){

        if(left >= right) return;
        int pivot = pivot(array,left,right);
        quickSortHelper(array,left, pivot-1);
        quickSortHelper(array,pivot+1, right);

    }


    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }


    public static void main(String[] args) {

        int[] myArray = {4,6,1,7,3,2,5};

        quickSort(myArray);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7]

         */

    }

}