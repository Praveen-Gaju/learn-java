package LinearSearch;

public class Example2 {
    public static void main(String[] args) {
        String name = "PRAVEEN";
        char ch = 'A';
        System.out.println(linearSearch(name, ch));
        
    }

    static boolean linearSearch (String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for(int i=0; i<str.length(); i++) {
            if(target == str.charAt(i)) {
                 return true;
            }
        } 
        return false;
    }
    
}
