import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] sum = new int[r][c];
        int[][] mul = new int[r][c];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();
        
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("\nMatrix Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
        
        System.out.println("\nMatrix Multiplication:");
        int[][] product = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                product[i][j] = 0;
                for (int k = 0; k < c; k++)
                    product[i][j] += A[i][k] * B[k][j];
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}