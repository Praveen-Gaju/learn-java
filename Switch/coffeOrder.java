package Switch;
import java.util.*;

public class coffeOrder{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coffeSize = in.nextInt();
        switch(coffeSize) {
            case 1:
            System.out.println("small Size coffe");
            break;
            case 2:
            System.out.println("Medium Size coffe");
            break;
            case 3:
            System.out.println("Large Size Coffe");
            break;
            default:
            System.out.println("Enter Valid Input");
        }
    }
}
