package LeetCodeProblems;

//LeetCode Problem number 33

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println((search(nums, 0)));        
    }
    
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // If pivot value is -1 that implies array is not rotated, just do normal binary search

        if(pivot == -1) {
            //Normal Binar Search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //If pivot is found you have two ascending sorted arrays

        if(nums[pivot] == target) {
            return pivot;
        }

        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot -1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length-1);        
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }    
    
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //4 caes to find pivot number in array
            // CASE 1
            if( mid < end && nums[mid] > nums[mid+1]) {  
                return mid;
            }   
            //CASE 2
                if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }
            //CASE 3
            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }       
        return -1;
    }

    static int findPivotWithDuplicateas(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //4 caes to find pivot number in array
            // CASE 1
            if( mid < end && nums[mid] > nums[mid+1]) {  
                return mid;
            }   
            //CASE 2
                if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }
            //CASE 3: If the elements start, end and middle are equal skip duplicates
            if(nums[mid] == nums[start] && nums[mid] == nums[start]) {
                //skip the duplicate elements
                //what if elements at start and are pivot are pivot
                //check if start is pivot
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                //Check if end is pivot
                if(nums[end] < nums[end-1]){
                    return end;
                }
                end--;
            }

            //left side is sorted so pivot should be in the right side

            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }          
        }       
        return -1;
    }
}
