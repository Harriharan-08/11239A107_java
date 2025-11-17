import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            System.out.print("Enter another number: ");
            int b = sc.nextInt();

            System.out.println("Result = " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }
        finally {
            System.out.println("Program Finished.");
        }

        sc.close();
    }
}
