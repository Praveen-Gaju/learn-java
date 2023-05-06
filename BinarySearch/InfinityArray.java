package BinarySearch;

//To find position of an infinite array in sorted array, in this case arr.length is not used.

public class InfinityArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(findingRange(arr, 10));
        
    }

    static int findingRange(int[] arr, int target) {
        //first find the range, start with a box size of 2
        int start = 0;
        int end = 1;
        //condition for target to lie in the range
        while(target > arr[end]) {
            int newStart = end + 1; // end= end + size of box *2
            end = end + ((end - start +1) *2);
            start = newStart;  //swap of numbers
        }
        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }    
}
