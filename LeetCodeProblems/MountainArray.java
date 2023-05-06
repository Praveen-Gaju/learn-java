package LeetCodeProblems;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        System.out.println(mountainSearchInArray(arr, 2));               
    }

    static int mountainSearchInArray(int[] arr, int target) {
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
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
    
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        
        boolean isAsc = arr[start] <  arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }           
        }
        return -1;
    }
}
