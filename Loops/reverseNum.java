package Loops;
import java.util.*;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int revNum = 0;
        while(num>0) {
            int rem = num % 10;
            num = num/10;
            revNum = (revNum*10) + rem;
        }
        System.out.println(revNum);
    }
    
}
