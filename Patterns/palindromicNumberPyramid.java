import java.util.*;

public class palindromicNumberPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++) {
            //Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //firstpart
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //second part
            for(int j=2; j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
