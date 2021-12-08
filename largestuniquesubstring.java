
//this is a program to find and print the largest substring with unique characters
//this also prints the final substring along with that number
//this takes atmost only 2 traversals of the substring
//O(N) time complexity 
//O(N) space requirement
import java.util.*;

public class largestuniquesubstring {
    public static void main(String args[]) {
        // str contains the target string
        String str = "hetllobllsaa";
        int min = 0;
        int max = str.length() - 1;
        int answer = 0;
        int current = 0;
        int minanswer = 0, maxanswer = 0;
        HashSet<Character> hs = new HashSet<>(max);
        int i = 0;
        while (i <= max) {
            char ch = str.charAt(i);
            if (hs.contains(ch)) {
                // System.out.println(ch+" is already present");
                while (str.charAt(min) != ch) {
                    hs.remove(str.charAt(min++));
                }
                min++;
                current = i - min;
            } else {
                hs.add(ch);
                // System.out.println(ch+" is NOTpresent");
                current = i - min;
                if (current > answer) {
                    minanswer = min;
                    maxanswer = i;
                    answer = current;
                }
            }
            i++;
        }
        System.out.println(answer + 1);
        System.out.println(str.substring(minanswer, maxanswer + 1));
    }
}