package LeetCodeProblems;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceilingNumber(arr, 10));
    }
    
    static int ceilingNumber(int[] arr, int target) {
        // ceiling of number is smallest number, greater >= target, returns index value of element in array.
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) { 
                return mid;               
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }                                  
        }
        return start;
    }
}
