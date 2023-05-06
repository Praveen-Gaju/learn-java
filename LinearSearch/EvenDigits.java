package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1, 44, 55, 245, 3653, 6647};
        System.out.println(findNumbers(arr));       
    }

    static int findNumbers(int[] nums) {
        
        int count = 0;
        
        for(int num :nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums) { // to verify the digits is even or not
        int numberOfDigits = digit(nums);
        
        /*if(numberOfDigits%2 == 0){
            return true;
        } */

        return numberOfDigits%2 == 0;               
    }

    static int digit(int nums) { //to verify the number of digits in number
        while(nums < 0) {
            nums = nums * -1;
        }
        int count = 0;
        while(nums > 0) {
            count++;
            nums /= 10; //nums = nums/10;
        }
        return count;
    }
    
}
