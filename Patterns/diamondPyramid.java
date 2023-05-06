import java.util.*;

public class diamondPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        //Upper Part
        for(int i=1; i<=n; i++) {
            //for Spaces
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j=1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         //Lower Part
         for(int i=n; i>=1; i--) {
            //for Spaces
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j=1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
