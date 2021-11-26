
// this is program to remove duplicates from a linkedlist in ascending order
// makes use of user defined linkedlist
import java.util.Scanner;

public class removeduplicatesfromsortedlinkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of first node");
        node head = new node(sc.nextInt());
        System.out.println("KEEP Entering values in ascending order ");
        System.out.println("-999999 to stop");
        node temp = head;
        while (true) {
            int next = sc.nextInt();
            if (next != -999999) {
                node newnode = new node(next);
                temp.next = newnode;
                temp = temp.next;
            } else {
                break;
            }
        }
        temp = head;
        System.out.println("linkedlist entered is ");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("removing duplicates");
        temp = head;
        node ahead = head.next;
        while (temp.next != null) {
            while (ahead != null && temp.data == ahead.data) {
                ahead = ahead.next;
            }
            temp.next = ahead;
            temp = ahead;
        }
        System.out.println("new linkedlist is ");
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        sc.close();
    }
}

class node {
    int data;
    node next;

    public node(int value) {
        this.data = value;
    }
}