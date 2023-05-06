package LeetCodeProblems;
//leetcode 268 Find Missing Number using cyclic sort 

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};   
        int ans = missingNumber(arr);
        System.out.println(ans);           
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }            
        }
        
        //search for elements
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }            
        }
        //case 2
        return nums.length;
    }   
    
    //swap function
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;        
    }
    
}
