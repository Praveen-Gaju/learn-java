package FunctionsandMethods;
import java.util.*;

import java.util.*;

public class Methods {
    
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int sumOfTwoNumbers(int a, int b) {
        int sum=a+b;
        return sum;
    }

    public static int product(int a, int b) {
        int mul=a*b;
        return mul;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Product of two numbers is: "+ product(a, b));                  
    }    
}
