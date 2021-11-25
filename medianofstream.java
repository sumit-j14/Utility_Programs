
// this is a program for finding out median of integer stream
// makes use of 2 heaps one min and other max
// using PriorityQueues concept and heap data structure
import java.util.*;

public class medianofstream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("keep entering numbers one by one");
        System.out.println("enter -999999 to exit");
        double median = 0;
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        int k = 0;
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        while (true) {
            k++;
            int next = sc.nextInt();
            if (next == -999999) {
                System.out.println("exit successful");
                break;
            } else {
                if (k % 2 == 0) {
                    System.out.println("even");
                    if (max_heap.size() > min_heap.size()) {
                        if (next > median) {
                            min_heap.add(next);
                            median = max_heap.peek() + min_heap.peek();
                            median /= 2;
                        } else {
                            min_heap.add(max_heap.poll());
                            max_heap.add(next);
                            median = max_heap.peek() + min_heap.peek();
                            median /= 2;
                        }
                    } else {
                        if (next > median) {
                            max_heap.add(min_heap.poll());
                            min_heap.add(next);
                            median = max_heap.peek() + min_heap.peek();
                            median /= 2;
                        } else {
                            max_heap.add(next);
                            median = max_heap.peek() + min_heap.peek();
                            median /= 2;
                        }
                    }
                } else {
                    System.out.println("odd");
                    if (next > median) {
                        min_heap.add(next);
                        median = min_heap.peek();
                    } else {
                        max_heap.add(next);
                        median = max_heap.peek();
                    }
                }
            }
            System.out.println("median is " + median);
        }
        sc.close();
    }

}