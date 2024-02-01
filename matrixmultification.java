import java.util.*;

public class matrixmultification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c, d, e;
        System.out.println("Enter the row and column of your matrix");
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[r][c];
          System.out.println("Enter the row and column of your matrix");
        d = sc.nextInt();
        e = sc.nextInt();
        int arr2[][] = new int[d][e];
        int arr3[][] = new int[r][e];
        System.out.println("Enter your element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
      
        System.out.println("Enter the element of your next matrix");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < e; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<e;j++){
                arr3[i][j]=0;
                for(int k=0;k<r;k++){
                    arr3[i][j]=arr3[i][j]+arr[i][k]*arr2[k][j];
                }
            }
        }
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < e; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

}
