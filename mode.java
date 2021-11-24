
// this is program which finds the mode of some integers
// this uses hashmap and time complexity O(N)
// and space complexity O(n)
import java.util.HashMap;
import java.util.Scanner;

public class mode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int size = sc.nextInt();
        int mode = 0;
        System.out.println("enter elements");
        int frequency_of_mode = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (hm.containsKey(num) == false) {
                hm.put(num, 1);
            } else {
                hm.put(num, hm.get(num) + 1);
            }
            if (hm.get(num) > frequency_of_mode) {
                frequency_of_mode = hm.get(num);
                mode = num;
            }
        }
        System.out.println("mode is " + mode);
        sc.close();
    }
}
