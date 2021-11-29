// creating dummy Directed Graph which represents a small map
// graphs working internally as Adjacency List using ArrayList
// allows naming vertices as cities / user wanted places;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class graphtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of vertices");
        int v = sc.nextInt();
        System.out.println("Enter names of vertices one by one");
        HashMap<Integer, String> map = new HashMap<>(v);
        for (int i = 0; i < v; i++) {
            // System.out.println("talkng about " + i);
            System.out.println("enter name corresponding to vertex " + i);
            map.put(i, sc.next());
            System.out.println(i + " " + map.get(i));
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
            System.out.println("Enter number of connections with vertex " + map.get(i));
            int num = sc.nextInt();
            for (int j = 0; j < num; j++)
                adj.get(i).add(sc.nextInt());
        }
        for (int i = 0; i < v; i++) {
            System.out.print("from " + map.get(i) + " to : ");
            for (int j = 0; j < adj.get(i).size(); j++)
                System.out.print(map.get(adj.get(i).get(j)) + " ");
            System.out.println();
        }
        sc.close();
    }

}