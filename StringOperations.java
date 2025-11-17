import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("\nString 1: " + s1);
        System.out.println("String 2: " + s2);
        
        System.out.println("Length of s1: " + s1.length());
        
        System.out.println("Uppercase s1: " + s1.toUpperCase());
        System.out.println("Lowercase s2: " + s2.toLowerCase());
        
        String concat = s1 + " " + s2;
        System.out.println("Concatenated: " + concat);
        
        if (concat.length() >= 5) {
            System.out.println("Substring of concat (0 to 5): " + concat.substring(0, 5));
        } else {
            System.out.println("Cannot take substring (length too short)");
        }

        sc.close();
    }
}
