import java.util.*;

public class Singly_linkedlist_operations {
    public static void main(String[] args) {
        linkedlistoperation lk =new linkedlistoperation();
        lk.operation();
    }
}

class linkedlistoperation {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void operation() {
        int data, c, d, e, f, g, h;
        Scanner sc = new Scanner(System.in);
        node head = null;
        node temp = null;
        node ptr;
        do {
            System.out.println("Enter 1 to insertion and enter 2 to delition anter 3 to display the element");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    System.out.println("Enter data which you insert in linkedlist");
                    data = sc.nextInt();
                    node newnode = new node(data);
                    System.out.println(
                            "enter 5 to insertion in first , enter 6 to insert in middle and insert 7 to insert in last");
                    e = sc.nextInt();
                    switch (e) {
                        case 5:
                            if (head == null) {
                                head = newnode;
                                System.out.println("your valu is insert in first position");
                            } else {
                                newnode.next = head;
                                head = newnode;
                                System.out.println("your valu is insert in first position");
                            }
                            break;
                        case 6:
                            if (head == null) {
                                System.out.println(
                                        "List is empty you can not insert any position you insert only first position so your valu is inserted in first position");
                                head = newnode;
                            } else {
                                System.out.println("enter the position where you want to insert the valu");
                                f = sc.nextInt();
                                temp = head;
                                for (int i = 0; i < f - 2; i++) {
                                    temp = temp.next;
                                }
                                newnode.next = temp.next;
                                temp.next = newnode;
                                System.out.println("insert in " + f +" position");
                            }
                            break;
                        case 7:
                            if (head == null) {
                                System.out.println(
                                        "List is empty you can not insert any position you insert only first position so your valu is inserted in first position");
                                head = newnode;
                            } else {
                                temp = head;
                                while (temp.next != null) {
                                    temp = temp.next;
                                }
                                temp.next = newnode;
                                System.out.println("insert in last");
                            }
                            break;
                        default:
                            System.out.println(
                                    "You enter wrong input first read the massage very cairfully then press the bautan acurdingly");
                            break;
                    }
                    break;
                case 2:
                    System.out.println(
                            "enter 1 to delete element fron first position and enter 2 to delete element element from any position and enter 3 to delete the element from last position");
                    g = sc.nextInt();
                    switch (g) {
                        case 1:
                            temp = head;
                            if (head == null) {
                                System.out.println("List is empty deletion is not possible");
                            } else {
                                temp = temp.next;
                                head = temp;
                                System.out.println("one element delete from first position");
                            }
                            break;
                        case 2:
                            temp = head;
                            ptr = temp.next;
                            if (head == null) {
                                System.out.println("List is empty deletion is not possible");
                            } else {
                                System.out.println("enter the position from where you want to delete element");
                                h = sc.nextInt();
                                for (int i = 0; i < h-2; i++) {
                                    
                                        temp = ptr;
                                        ptr = ptr.next;
                                }
                                temp.next = ptr.next;
                                System.out.println("one valu delete from your " + h + " position");
                            }
                            break;
                        case 3:
                            if (head == null) {
                                System.out.println("List is empty deletion is not possible");
                            } else {
                                temp = head;
                                ptr = temp.next;
                                while (ptr != null) {
                                    temp = ptr;
                                    ptr = ptr.next;
                                }
                                temp.next = null;
                                System.out.println("One element is delete from last position of list");
                            }
                            break;
                        default:
                            System.out.println(
                                    "You enter wrong input first read the massage very cairfully then press the bautan acurdingly");
                            break;
                    }
                    break;
                case 3:
                    if (head == null) {
                        System.out.println("List is empty");
                    } else {
                        temp = head;
                        while (temp!= null) {
                            System.out.print(temp.data + " ");
                            temp = temp.next;
                        }
                        System.out.println(" ");
                    }
                    break;
                default:
                    System.out.println(
                            "You enter wrong input first read the massage very cairfully then press the bautan acurdingly");
                    break;
            }
            System.out.println("Enter 4 to continue the loop to exit loop enter any key without 4 ");
            c = sc.nextInt();
        } while (c == 4);
    }
}