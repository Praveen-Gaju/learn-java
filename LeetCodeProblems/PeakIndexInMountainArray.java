package LeetCodeProblems;

//Leetcode 162 and 852 same answer

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 4, 3, 2, 1};
        System.out.println(peakIndex(arr));        
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]) {
                //In this case array starts move from ascending to descending order, this may be the answer but look at left of array for possible answer
                
                end = mid;
            } else {
                // you are ascending part of array
                start = mid + 1; //if in case to check mid + 1 element > mid element
                
            }
        }
        // in the end start == end both pointing the same element which is maximum element in array
        return end; // we can return start or end because both will be at same element of an array
    }    
}
