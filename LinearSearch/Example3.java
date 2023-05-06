package LinearSearch;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[][] arr2d = {
                {212, 334, 443},
                {231, 4546, 323},
                {44, 214, 532}
        };

        int target = 214;
        int[] ans = search(arr2d, target);
        System.out.println(Arrays.toString(ans));        
    }

    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }           
        }
        return new int[] {-1,-1};               
    }    
    
}
