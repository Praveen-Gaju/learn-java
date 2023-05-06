public class Patterns {
    public static void main(String[] args) {
        pattern12(5);
        
    }

    static void pattern28(int n) {
        for(int row = 1; row <= 2*n; row++) {
            int totalColInRow = row > n ? 2*n - row : row;
            int noOfSpaces = n - totalColInRow;
            for (int s = 1; s<= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        
    }
    
    static void pattern12(int n) {
        for(int row = 1; row <= 2*n; row++) {
            int totalColInRow = row > n ? 2*n - row : row;
            int noOfSpaces = n - totalColInRow;
            for(int space = 1; space <= noOfSpaces ; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <=totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row<= n; row++) {
            //loop for spaces
            for(int space = 1; space <= row;space++) {
                System.out.print(" ");
            }
            for(int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for(int row = 1; row <= n; row++) {               
            //loop for space
            for(int space = n - 1; space >= row; space--) {  
                System.out.print(" ");
            }
            //loop for stars
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for(int row = 1; row <= n; row++) {
            for(int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            for(int col = n + 1; col<=2*n- row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for(int row = 1; row <= n; row++) {
            for(int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            } 
            for(int col = n + 1; col <= n+row-1; col++) {
                System.out.print("*");
            }
            System.out.println();           
        }
    }

    static void pattern7(int n) {
        for(int row = 1; row <= n; row++) {
            for(int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= n - row + 1; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++){
            for(int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int totalColInRow = row > n ? 2 * n -row - 1 : row;
            for(int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern1(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();            
        }        
    }    
}
