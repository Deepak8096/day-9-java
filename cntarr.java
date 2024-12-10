import java.util.*;

class Main {
    public static void main(String[] args) {
        String a = "deepak";
        int c[] = new int[26];  
        for (int i = 0; i < a.length(); i++) {
            c[a.charAt(i) - 'a']++;  
        }
        System.out.println("Character counts for string 'deepak':");
        System.out.println(Arrays.toString(c));  
        String a1 = "rajkumar"; 
        int c1[] = new int[26];  
        for (int i = 0; i < a1.length(); i++) {
            c1[a1.charAt(i) - 'a']++;  
        }
        System.out.println("Character counts for string 'rajkumar':");
        System.out.println(Arrays.toString(c1));  
    }
}