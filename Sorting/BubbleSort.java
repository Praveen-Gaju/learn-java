package Sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4, 5, 3, 6, 1, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));        
    }
    
    static void bubbleSort(int[] arr) {
        //run loop n-1 times 
        
        for(int i = 0; i < arr.length; i++) {
            //for each step max value will be shifted to the respective index

            for(int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    //Do Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
