
// this is a program to print BFS Traversal of an Undirected Graph
// user is given freedom to enter the starting index
// Time complexity O(N+E) almost linear time
// graph is stored as adjacency List 
import java.util.*;

public class bfsiterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of vertices ");
        int v = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());
        for (int i = 0; i < v; i++) {
            System.out.println("enter number of cennections with vertex " + i);
            int num = sc.nextInt();
            for (int j = 0; j < num; j++)
                adj.get(i).add(sc.nextInt());
        }
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        System.out.println("enter starting vertex for BFS");
        int start = sc.nextInt();
        int i;
        if (visited.contains(start) == false) {
            System.out.println(start);
            visited.add(start);
            q.add(start);
            while (q.size() != 0) {
                i = q.poll();
                for (int adjacent : adj.get(i)) {
                    if (visited.contains(adjacent) == false) {
                        System.out.print(adjacent + " ");
                        visited.add(adjacent);
                        q.add(adjacent);
                    }
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
