package Recursion;

public class factorial {

    public static int Facto(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int factonm1=Facto(n-1);
        int facton = n*factonm1;
        return facton;
    }
     public static void main(String args[]) {
        int n=5;
        int ans = Facto(n);
        System.out.println(ans);
     }
    
}
