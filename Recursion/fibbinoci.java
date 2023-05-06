package Recursion;

public class fibbinoci {    
    public static void main (String args[]) {
        int ans = fibonacciSeries(4);
        System.out.println(ans);
    }
    
    static int fibonacciSeries(int n) {
        
        if(n < 2) {
            return n;
        }       
        
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    } 
}
