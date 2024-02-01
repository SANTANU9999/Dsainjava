import java.util.*;

public class stack_operation_using_linkedlist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackOperation so = new stackOperation();
        int d;
        do{
        System.out.println("enter 1 for push 2 for pop 3 for display");
        int m = sc.nextInt();
        switch (m) {
            case 1:
                so.push();
                break;
            case 2:
                so.pop();
                break;
            case 3:
                so.display();
                break;
            default:
                System.out.println("Wrong input");
                break;

        }
        System.out.println("to continu enter 3");
        d=sc.nextInt();
    }while(d==3);
    }

}

class stackOperation {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;
    node temp;
    int s, o;

    public void push() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter the element which you push in array");
            s = sc.nextInt();
            node nw = new node(s);
            if (head == null) {
                head = nw;
            } else {
                nw.next = head;
                head = nw;
            }
            System.out.println("if you want to push more element on stack then enter 4");
            o = sc.nextInt();
        } while (o == 4);
    }

    public void pop() {
        temp = head;
      if (temp== null) {
            System.out.println("stack underflow");
        }
        else{
            head=temp.next;
        }
        temp.next = null;
        System.out.println("one element is pop from stack");
    }

    public void display() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}