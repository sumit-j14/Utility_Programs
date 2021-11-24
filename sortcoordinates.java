// This is a program which takes 2D coordinates as input
// then sorts these pairs accordng to the distance from the origin
// makes use of custom comparator

// if you want to sort according to a distance form a particular point
// just change the formula in the 'distance' function
import java.util.*;
public class sortcoordinates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pairs");
        int num = sc.nextInt();
        ArrayList<Pair> al = new ArrayList<Pair>(num);
        System.out.println("Enter x coordinates with y coordinates one by one");
        for (int i = 0; i < num; i++) {
            int x_co = sc.nextInt();
            int y_co = sc.nextInt();
            Pair pair = new Pair(x_co, y_co);
            al.add(pair);
        }
        sc.close();
        System.out.println("Pairs entry is over");
        for (int i = 0; i < num; i++) {
            int x_co = al.get(i).x;
            int y_co = al.get(i).y;
            System.out.println(i + " th x is " + x_co);
            System.out.println(i + " th y is " + y_co);
        }
        System.out.println("Print test Success");
        System.out.println("Sorting according to distances from origin");
        Collections.sort(al, new Custom_Comparator());
        System.out.println("hope sorted");
        System.out.println("sorted pairs are ");
        for (int i = 0; i < num; i++) {
            int x_co = al.get(i).x;
            int y_co = al.get(i).y;
            System.out.println(i + " th x is " + x_co);
            System.out.println(i + " th y is " + y_co);
        }
    }
}

class Custom_Comparator implements Comparator<Pair> {
    public int compare(Pair first, Pair second) {
        // System.out.println(first);
        // System.out.println(first.);
        double distance_one = first.distance();
        double distance_two = second.distance();

        // double distance_one = Math.sqrt((first.x * first.x) + (first.y * first.y));
        // double distance_two = Math.sqrt((second.x * second.x) + (second.y *
        // second.y));
        if (distance_one > distance_two)
            return 1;
        else
            return -1;
        // else
        // return 0;
    }
}

class Pair {
    public int x, y;

    public Pair(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance() {
        double distance_one = Math.sqrt((this.x * this.x) + (this.y * this.y));
        return distance_one;
    }
}
