package Loops;
import java.util.*;


public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input from user until user press x or X
        int ans = 0;
        while (true) {
            //take operation as input
            System.out.print("Enter the Operator: ");
            char op = sc.next().trim().charAt(0);            
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter Two Numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();                
                if(op == '+') {
                    ans = a + b;
                }
                if(op == '-') {
                    ans = a - b;
                }
                if(op == '*') {
                    ans = a * b;
                }
                if(op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }                    
                }
                if(op == '%') {
                    ans = a % b;
                }                
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator");
            }   
            System.out.println(ans);         
        }        
    }
    
}
