
// this is used to print frequencies of all elements in array
// uses HashMap
// O(N) space and O(N) time complexity
import java.util.HashMap;
import java.util.Map; 

public class freqallelements {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i : arr) {
            System.out.println(i);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if (hm.containsKey(i) == false) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}