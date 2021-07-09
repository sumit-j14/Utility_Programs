/*
This is a function which takes a numer and prints
which numbered Fibonacci number is it
And if it is not , it checks that too
Makes use of antilog of golden ratio
*/
import java.util.Scanner;
public class Which_Fibo 
{
    //This is the required Function
    public static void which_fibo(int NUM)
    {
        
      //some precomputation
    
      double t=Math.sqrt(5)*NUM;
      boolean flag=true;
      double x=Math.log(t)/Math.log(1.618033989);
      long n=Math.round(x);
      double fn=(Math.pow(1.618033989,n)/Math.sqrt(5));
      
      //fn has nearest integer
      
      if(Math.round(fn)==NUM)
      {
      System.out.print(n+"th FIBONACCI");
      flag=false;
      }
      fn=(Math.pow(1.618033989,n-1)/Math.sqrt(5));
     
     // this is jus to make sure there is no error
      
      if(Math.round(fn)==NUM)
      {
          flag=false;
      System.out.print(n-1+"th FIBONACCI");
      }
      fn=(Math.pow(1.618033989,n+1)/Math.sqrt(5));
      if(Math.round(fn)==NUM)
      {
      System.out.print(n+1+"th FIBONACCI");
      flag=false;
      }
      
      //If not fibonacci number
      
      if(flag)
      System.out.print("NOT A FIBONACCI");
    }
    //driver function
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Which_Fibo fib=new Which_Fibo();
        System.out.println("Enter a numer to check ");
        fib.which_fibo(sc.nextInt());
    }
}
//end*