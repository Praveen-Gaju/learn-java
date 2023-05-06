package Arrays;
import java.util.*;


public class array2DNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();
        
        //Array declaration
        int[][] nums = new int [rows] [colms];

        //Input for Rows and coloumns i for rows and j for coloumns        
        for(int i=0; i<rows; i++) {
            for(int j=0; j<colms; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        //Ouput of array
        for(int i=0; i<rows; i++) {
            for(int j=0; j<colms; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
