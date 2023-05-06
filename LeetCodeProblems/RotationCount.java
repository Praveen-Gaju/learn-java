package LeetCodeProblems;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotation(nums));        
    }

    static int countRotation(int[] nums) {
        int pivot = findPivot(nums);
        
        if(pivot == -1) {
            return 0;
        }
        return pivot + 1; 
    }

    //Use this for non duplicte arrays
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

    //Use this for duplicate arrays
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
