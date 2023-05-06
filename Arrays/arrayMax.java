package Arrays;

public class arrayMax {
    public static void main(String[] args) {
        int[] arr = {11, 22, 55, 6666, 45, 665, 654, 876};
        System.out.println(max(arr));
    }
    
    static int max (int[] arr) {

        int maxval = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > maxval) {
                maxval = arr[i];
            }
        }        
        return maxval;
    }    
}
