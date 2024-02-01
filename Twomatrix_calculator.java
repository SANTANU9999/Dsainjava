import java.util.*;

public class Twomatrix_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            operation op = new operation();
            System.out.println(
                    "if you want to Addition then prass 1,\nif you want to Subtraction then prass 2,\nif you want to multiplication then tenn press 4,\nif you want to Multiplication with a Element or Number then press 5,\nif you want to do transpose of matrix then enter 6,\nif you want to divition then enter 7");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    op.addition();
                    break;
                case 2:
                    op.subtraction();
                    break;
                case 4:
                    op.multiplication();
                    break;
                case 5:
                    op.multiplicationtionOfaElementWithMatrix();
                    break;
                case 6:
                    op.transpose();
                    break;
                case 7:
                    System.out.println("Mtrix devision is not possible");
                default:
                    System.out.println("Enter the exti valu");
                    break;
            }
            System.out.println(
                    "Enter 3 if you cuntinued this processs and enter any key with out 3 to termenate this process");
            a = sc.nextInt();
        } while (a == 3);
    }
}

class operation {
    public void addition() {
        arrycreate ar = new arrycreate();
        int arr1[][] = ar.fast();
        int arr2[][] = ar.second();
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            int arr3[][] = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("Addition on two array");
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    System.out.print(arr3[i][j] +" ");
                }
                System.out.println(" ");
            }
        }
        else {
            System.out.println("For this two matrix addition is not possible ");
        }
    }
    public void subtraction() {
        arrycreate ar = new arrycreate();
        int arr1[][] = ar.fast();
        int arr2[][] = ar.second();
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            int arr3[][] = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    arr3[i][j]=arr1[i][j]-arr2[i][j];
                }
            }
            System.out.println("Subtraction on two array");
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        else {
            System.out.println("For this two matrix subtraction is not possible ");
        }
    }
    public void multiplication() {
        arrycreate ar = new arrycreate();
        int arr1[][] = ar.fast();
        int arr2[][] = ar.second();
        if (arr1[0].length == arr2.length) {
            int arr3[][] = new int[arr1.length][arr2[0].length];
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    arr3[i][j]=0;
                    for(int k=0;k<arr2.length;k++){
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            System.out.println("Multiplication on two array is ");
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        else {
            System.out.println("For this two matrix Multiplication is not possible ");
        }
    }
    public void multiplicationtionOfaElementWithMatrix() {
        Scanner sc= new Scanner(System.in);
        arrycreate ar = new arrycreate();
        int arr1[][] = ar.fast();
        int e;
        System.out.println("enter the element which you want Multiplication with matrix");
        e=sc.nextInt();
            int arr3[][] = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    arr3[i][j]=arr1[i][j]*e;
                }
            }
            System.out.println("array after Multiplication with a element");
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    System.out.print(arr3[i][j] +" ");
                }
                System.out.println(" ");
            }
    }
    public void transpose() {
        arrycreate ar = new arrycreate();
        int arr1[][] = ar.fast();
        
            int arr3[][] = new int[arr1[0].length][arr1.length];
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    arr3[i][j]=arr1[j][i];
                }
            }
            System.out.println("array after Transpoze");
            for (int i = 0; i < arr3.length; i++) {
                for(int j=0;j<arr3[0].length;j++){
                    System.out.print(arr3[i][j] +" ");
                }
                System.out.println(" ");
            }
    }
}

class arrycreate {
    public int[][] fast() {
        Scanner sc = new Scanner(System.in);
        int r1, c1;
        System.out.println("Enter how many row and column have in first matrix ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        int arr[][] = new int[r1][c1];
        System.out.println("Enter first matrix elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public int[][] second() {
        Scanner sc = new Scanner(System.in);
        int r1, c1;
        System.out.println("Enter how many row and column have in second matrix ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        int arr2[][] = new int[r1][c1];
        System.out.println("Enter Second matrix elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }       
        return arr2;
    }
}