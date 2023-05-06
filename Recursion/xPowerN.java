package Recursion;

public class xPowerN {
    public static int calcPower(int x, int n) {
        if(n==0) {
            return 1;
        }
        if (x==0){
            return 0;
        }
        int xPowernm1 = calcPower(x, n-1);
        int xPown = x * xPowernm1;
        return xPown;
    }

    public static void main (String args[]) {
        int ans=calcPower(2, 3 );
        System.out.println(ans);
    }
    
}
