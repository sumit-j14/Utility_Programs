
// this is a program for printing the kth largest number in an array of integers
// time compexity is O (nlogn )
// O(N) for heapify O(logn) for each element
// uses min heap data structure 
// priority queue class in java
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("keep entering number one by one");
        System.out.println("-999999 to stop");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (true) {
            int number = sc.nextInt();
            if (number == -999999) {
                System.out.println("stopped");
                break;
            } else {
                pq.add(number);
            }
        }
        int k = 0;
        System.out.println("enter value of k ");
        int position = sc.nextInt();
        while (pq.size() != 0) {
            k++;
            if (k == position)
                System.out.println(position + "th number is " + pq.poll());
            else {
                pq.poll();
            }
        }
        sc.close();
    }

}