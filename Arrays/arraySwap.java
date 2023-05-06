package Arrays;

import java.util.Arrays;

public class arraySwap {
    public static void main(String[] args) {
        int[] arr = {1,6,8,8,9,66,22,77};
        
        swap(arr, 2, 6);        
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while( start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }        
    }
}
