//Prints a diamond Pattern of *
import java.util.*;
public class diamond
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid_spaces=0;
        int pre_spaces=0;
        for( int i =1;i<n;i++)
        {
            if(i==1)
            {
              //no need of mid spaces
            }
            else
                mid_spaces=(i*2)-3;
            pre_spaces=n-i;
            for(int k=1;k<=pre_spaces;k++)
                System.out.print(" ");
            System.out.print("*");
            for(int k=1;k<=mid_spaces;k++)
                System.out.print("_");
            if(i!=1)
                System.out.print("*");
            System.out.println();
        }
        // this completes the upper portion
        for( int i=n-1;i>0;i--)
        {
            if(i==1)
                //no need of mid spaces
                mid_spaces=0;
            else
                mid_spaces=(i*2)-3;
            pre_spaces=n-i;
            for(int k=1;k<=pre_spaces;k++)
                System.out.print(" ");
            System.out.print("*");
            for(int k=1;k<=mid_spaces;k++)
                System.out.print("_");
            if(i!=1)
                System.out.print("*");
            System.out.println();
        }
        // this completes the required diamond pattern  !!
    }
}