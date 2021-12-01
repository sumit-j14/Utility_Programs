// this is a program to print the indegree of all vertices of a Directed graph
// HashMap is used to store the indegrees of all vertices
// This lays the foundation of Topological Sorting of graphs
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class indegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < v; i++) {
            System.out.println("Enter the number of connections to vertex " + i);
            int num = sc.nextInt();
            if (num != 0)
                System.out.println("Enter vertices coonected to " + i + " one by one");
            for (int j = 0; j < num; j++)
                adj.get(i).add(sc.nextInt());
        }
        HashMap<Integer, Integer> indegree = new HashMap<>();
        for (int i = 0; i < v; i++) {
            indegree.put(i, 0);
        }
        for (int i = 0; i < v; i++) {
            for (int j : adj.get(i)) {
                indegree.put(j, indegree.get(j) + 1);
            }
        }
        System.out.println(indegree);
        sc.close();
    }
}
