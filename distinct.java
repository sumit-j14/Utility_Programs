import java.util.HashSet;

// this is used to count the number of distinct integres in an array
// uses HashSet 
// O(N) Space and O(N) time complexity\
/**
 * distinct
 */
public class distinct {

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i : arr)
            System.out.println(i);
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        System.out.println("number of distinct elements is " + hs.size());
    }
}