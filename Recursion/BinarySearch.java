package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6 ,7, 20, 45, 67, 89};
        System.out.println(recursiveBinarySearch(arr, 67, 0, arr.length - 1));
        
    }

    static int recursiveBinarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid; 
        }

        if(target > arr[mid]) {
            return recursiveBinarySearch(arr, target, mid + 1, end);
        }

        return recursiveBinarySearch(arr, target, start, mid - 1);
    }
    
}
