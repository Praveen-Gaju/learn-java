package BinarySearch;
import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        System.out.println(Arrays.toString(sortedArraySearch(arr, 60)));        
    }

    //if 2D array is not sorted we use linear search 

    static int[] nonSortedSearch(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }           
        }
        return new int[] {-1,-1};               
    }

    // if 2D array is sorted we use binary
    
    static int[] sortedArraySearch(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (row <arr.length && col > 0 ) {
            if(arr[row][col] == target) {
                return new int[] {row, col};
            } else if(arr[row][col] < target) {
                row++;
            } else {
                col--;
            }            
        }
        return new int[] {-1, -1};
    }    
}


