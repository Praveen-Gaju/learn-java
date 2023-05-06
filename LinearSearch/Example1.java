package LinearSearch;

public class Example1 {
    public static void main(String[] args) {
        int [] arr = {11,22, 33, 44, 55, 66, 77, 88};
        System.out.println(linearSearch(arr, 33));
       
    }   
    
    static int linearSearch(int[] arr, int target) {
        
        if(arr.length == 0) {
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return target; //returns value of target
                //return i;  //returns index value of the target
            }            
        }
        return -1; 
    }
}
