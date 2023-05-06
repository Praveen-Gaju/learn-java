package Recursion;

public class xPowernLogn {
    public static int calcPowern(int x, int n) {
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        //if n is even 

        if(n%2 ==0 ){
            return calcPowern(x, n/2) * calcPowern(x, n/2);
        } else { //if n is odd 
            return calcPowern(x, n/2) * calcPowern(x, n/2) * x;
        }
    }

    public static void main(String args[]) {
        int ans=calcPowern(2, 5);
        System.out.println(ans);
    }
    
}
