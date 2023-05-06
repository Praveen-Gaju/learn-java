package Sorting;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 1, 2};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));        
    }

    static void selectionSorting(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }       

    // to find max element in array
    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        
        for(int i = start; i <= last; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }           
        }
        return max;
    }
    
    //swap function
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;        
    }    
}
