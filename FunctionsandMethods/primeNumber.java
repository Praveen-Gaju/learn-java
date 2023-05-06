package FunctionsandMethods;
import java.util.*;

public class primeNumber {

    public static void prime(int n) {
        boolean isprime=true;
        for(int i=2; i<=n/2; i++) {          
                if(n%i == 0) {
                    isprime=false;
                    break;
                }                    
        }
        if(isprime) 
        {
            if(n==1) {
                System.out.println(n+ "is neither Prime or Composite");
            } else {
                System.out.println(n+ " is a prime number");
            } 
        }else {
                System.out.println(n+"This not Prime number");            
        }

    }

    public static void average(int a, int b, int c) {
        Scanner sc = new Scanner(System.in);
        int avg = (a+b+c)/3;
        System.out.println(avg);

    }

    public static void sumOfOddNum(int n)  {
        int sum=0;
        for(int i=1; i<=n;i++) {
            if(i%2 !=0) {
                sum=sum+i;
            }           
        }
        System.out.println(sum);
    }
   
    public static void main(String ags[]) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sumOfOddNum(n);           
    
    }
    
}



