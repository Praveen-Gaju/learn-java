package LeetCodeProblems;

// 410 leetCode Split array largest sum
/*Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split. A subarray is a contiguous part of the array. */

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        System.out.println(splitArray(nums, 3));
        
    }
    
    static int splitArray(int[] nums, int k) {
            int start = 0;
            int end = 0;

            for( int i =0; i< nums.length; i++) {
                start = Math.max(start, nums[i]); // in the end of loop this will contain the max item from the array
                end += nums[i];
            }

            //binary search

            while(start < end){
                //try middle as a potential answer
                int mid = start + (end-start) / 2;

                //calculate how many pieces you can divide with max value
                int sum = 0;
                int pieces = 1;
                for( int num : nums) {
                    if (sum + num > mid) {
                        // you cannot add num to subarray, you have to make new sub array
                        //if you add num to new subarray then sum = num
                        sum = num;
                        pieces++;
                    } else {
                        sum += num;
                    }
                }
                if (pieces > k) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return end; // here start and both are equal          
    }
    
}
