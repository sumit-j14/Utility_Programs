
// this program is used ofr finding out the median of 
// of positive and negative integers 
// this makes use of heap data structure
import java.util.PriorityQueue;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int size = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(size);
        for (int i = 0; i < size; i++) {
            pq.add(sc.nextInt());
        }
        int k = -1, median = 0;
        double median_even = 0.0;
        if (size % 2 == 0) {

            while (pq.size() != 0) {
                k++;
                int i = pq.poll();
                if (k + 1 == (size / 2)) {

                    median_even += i;
                    median_even += pq.poll();
                    median_even /= 2;
                    break;
                }
            }
            System.out.println("median is " + median_even);
        } else {
            System.out.println("here");
            while (pq.size() != 0) {
                int i = pq.poll();
                k++;
                if (k == (size / 2)) {

                    median += i;
                    break;
                }
            }
            System.out.println("median is " + median);
        }
        sc.close();
    }
}