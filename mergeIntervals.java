
//a custom comparator sorts the arraylist of pairs in O(nlog n ) time
//then only a single iteration is needed O(n) time
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class mergeIntervals {
    public static void main(String[] args) {
        System.out.println("enter number of pairs");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Pair> al = new ArrayList<>(num);
        System.out.println("enter pairs one by one");
        for (int i = 0; i < num; i++) {
            System.out.println("enter pair number " + (i + 1));
            Pair newpair = new Pair(sc.nextInt(), sc.nextInt());
            al.add((newpair));
        }
        // printing test
        // for( int i= 0; i < num ; i++)
        // {
        // System.out.println(al.get(i).start);
        // System.out.println(al.get(i).end);
        // }
        System.out.println("*********");
        Collections.sort(al, new customcomparator());
        // printing test
        // for (int i = 0; i < num; i++) {
        // System.out.print(al.get(i).start + " ");
        // System.out.println(al.get(i).end);
        // }
        System.out.println("net intervals after merging are");
        int min = al.get(0).start;
        int max = al.get(0).end;
        for (int i = 0; i < num;) {
            int key = i + 1;
            while (key < num && al.get(key).start < max) {
                max = Math.max(al.get(key++).end, max);
            }
            System.out.println(min + " , " + max);
            if (key == num - 1) {
                System.out.println(al.get(key).start + " , " + al.get(key).end);
                break;
            } else if (key == num)
                break;
            else {
                i = key;
                min = al.get(key).start;
                max = al.get(key).end;
            }
        }
        sc.close();
    }
}

class customcomparator implements Comparator<Pair> {
    public int compare(Pair one, Pair two) {
        if (one.start > two.start) {
            // System.out.println(one.start + " is greater than " + two.start);
            return 1;
        } else if (one.start == two.start) {
            if (one.end > two.end)
                return 1;
        } else
            return -1;
        return -1;
    }
}

class Pair {
    int start, end;

    public Pair(int one, int two) {
        this.start = one;
        this.end = two;
    }
}