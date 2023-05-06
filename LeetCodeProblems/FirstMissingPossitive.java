package LeetCodeProblems;

//Leetcode 41 First Missing Positive

public class FirstMissingPossitive {

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(missingPossitive(nums));
                
    }

    static int missingPossitive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        //Search for first missing number
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }            
        }

        return nums.length + 1;
    }

    //swap function
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;        
    }
    
}
