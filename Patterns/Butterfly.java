import java.util.*;

public class Butterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //Upperpart
        for(int i=1; i<=n; i++) {
            //1st part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //SPaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        //Lowe half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"); 
            }
            
            System.out.println();
        }
    }           
}
