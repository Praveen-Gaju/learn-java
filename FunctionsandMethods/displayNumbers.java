package FunctionsandMethods;
import java.util.*;

public class displayNumbers {
    public static void main(String args[]) {
         int positive = 0, negative = 0, zeros = 0;
         System.out.println("Press 1 to continue 0 to stop");
         Scanner sc=new Scanner(System.in);
         int input = sc.nextInt();
         while(input==1) {
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if (num>0){
                positive++;
            } else if(num<0){
                negative++;
            } else{
                zeros++;
            }
            System.out.println("Press 1 to continue 0 to stop");
         }
         System.out.println("No. of Positives: "+positive);
         System.out.println("No. of Negatives: "+negative);
         System.out.println("No. of Zeros: "+zeros);         
    }
    
}
