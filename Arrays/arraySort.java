package Arrays;
import java.util.*;

public class arraySort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();
        int[][] nums = new int [rows] [colms];
        
        //Inputarray
        for(int i=0;i<rows;i++) {
            for(int j=0; j<colms; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        //Outputarray
        for(int i=0; i<rows; i++) {
            for(int j=0; j<colms; j++) {
                if(nums[i][j]==x) {
                    System.out.println("x found at location ("+i+","+j+")");
                }
                
            }
        }
    }    
}
