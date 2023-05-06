package Recursion;

//print numbers 5 to 6

public class example1 {

    public static void printNumber(int n) {
        if (n==0) { //base Function
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String args[]) {
        int n=5;
        printNumber(n);
    }
    
}
