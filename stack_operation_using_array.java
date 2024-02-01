import java.util.*;
public class stack_operation_using_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        op s= new op();
        int m,d;
        do{
            System.out.println("enter 1 for push 2 for pop 3 for display");
             m = sc.nextInt();
            switch (m) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
    
            }
            System.out.println("to continue enter 4");
            d=sc.nextInt();
        }while(d==4);
    }
    
}
class op{
    Scanner sc=new Scanner(System.in);
    int n=10;
    int []arr=new int [n];
    int top=-1;
    public void push(){
        
        if(top==n-1){
          System.out.println(" stack overflow");
        }
        else{
            System.out.println("enter the element");
            int s= sc.nextInt();
            top=top+1;
            arr[top]=s;
        }
        
    }
    public void pop(){
        if(top==-1){
            System.out.println("stack underflow");
        }
        else{
            top=top-1;
            System.out.println("one element is pop from stack");
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
        for(int i=top;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
    }
    }

}
