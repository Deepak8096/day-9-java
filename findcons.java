import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int consonants = 0;
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    consonants++;
                }
        }
        System.out.println("Consonants: " + consonants);
        
    }
}