
// this is a program to print the Topological Sort of all vertices of a Directed graph
// This does not work if there is a cycle ONLY FOR DAG
// Some work might only be completed if and only if all its dependencies have completed or removed
// HashMap is used to store the indegrees of all vertices
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class topologicalSort {
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
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < v; i++) {
            if (indegree.get(i) == 0)
                queue.add(i);
        }
        while (queue.size() != 0) {
            int current = queue.poll();
            System.out.println(current);
            for (int i = 0; i < v; i++) {
                indegree.put(i, indegree.get(i) - 1);
                if (indegree.get(i) == 0)
                    queue.add(i);
            }
        }
        sc.close();
    }
}
