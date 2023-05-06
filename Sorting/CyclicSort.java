package Sorting;
import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 1, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));        
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
            
        }       
    }
    
    //swap function
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;        
    }
}
