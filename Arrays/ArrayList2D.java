package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        //Intialisation
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
        
        //Add Elements to Array

        for(int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
    
}
