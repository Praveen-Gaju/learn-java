package Loops;
import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int count = 0;
        while(n>0) {
            int reminder = n%10;
            if (reminder == i) {
                count++;
            }
            n= n/10;
        }
        System.out.println(count);        
    }
    
}
