//Create 2D array from uoyre input
import java.util.*;

public class Two_d_arraycreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the size of your matrix in row and then column"); // Taking the input row and column number from user
        i = sc.nextInt();
        j = sc.nextInt();
        int[][] arr = new int[i][j]; //2d array creation
        System.out.println("Enter the element of matrex");
        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {
                arr[m][n] = sc.nextInt(); //taking array element from user and store in array
            }
        }
        System.out.println("Matrix is");
        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {
                System.out.print(arr[m][n] + " ");
            }
            System.out.println(" ");
        }
    }

}
