import java.util.*;
public class minmaxfindinarray {
    public static void main(String[] args) {
        minmax m=new minmax();
        m.min();
    }

}
class minmax{
    public void min(){
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter the size of array");
        a=sc.nextInt();
        int []arr= new int[a];
        int min=arr[0];
        System.out.println("Enter the element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            if(min<arr[i]){
                min=arr[i];
            }
        }
        System.out.println("You have enter the array is");
        int b=0;
        while (b<arr.length) {
             System.out.print( arr[b]+" ");
             b++;
        }
        System.out.println(" ");
        System.out.println("the miximum of the array is "+ min);
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the minimum of the array is "+ min);

    }
}