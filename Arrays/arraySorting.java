package Arrays;

import java.util.*;

public class arraySorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i=0;i<size;i++) {
            num[i] = sc.nextInt();
        }

        boolean isascending=true;
        for(int i=0; i<num.length-1; i++) {  // NOTICE numbers.length - 1 as termination condition
            if(num[i] > num[i+1]) {          // This is the condition for descending order
                isascending = false;
            }
        }
  
        if(isascending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 
    }
    
}
