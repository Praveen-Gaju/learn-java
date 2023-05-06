package LeetCodeProblems;

public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};       
        System.out.println(floorNumber(arr, 5));
        
    }

    static int floorNumber(int[] arr, int target) { 
         // floor of number is biggest number <=target, returns index value of element in array.
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
        return end;
    }
    
}
