import java.util.*;

public class matrixadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("Enter the row and column of your matrix");
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int arr3[][] = new int[r][c];
        System.out.println("Enter your element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element of your next matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of two matrix is");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
