// create 1D array from user input
import java.util.*;
public class One_dimantion_array_creation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
         System.out.println("How many element you want to store in your array");
        a=sc.nextInt(); // input the array size form user
        int []arr=new int[a];
        System.out.println("Enter the elements which you insert in array");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt(); // input array elements from user and store array
        }
        System.out.println("Array is ");
        for(int i=0;i<a;i++){
           System.out.print(arr[i]+" "); //print array elements
        }
    }
    
}