/* Binary Search Function
Besides telling whether the target is present or not ,
this upgraded Function tells the expected position 
*/
import java.util.Scanner;
public class BinSearch_Class
{
    //Bin_Search_Function
    public static int Bin_Search(int [] arr , int target , int low , int high)
    {
      while(low<=high)
      {
          int mid=(high+low)/2;
          if(arr[mid]==target)
          {
              //returns position present
              return mid;
          }
          else if(arr[mid]>target)
          {
              high=mid-1;
          }
          else
          {
              low=mid+1;
          }
      }
      //when not present it returns expected location
      return high+2;
    }
    
    // Driver Function
    public static void main(String args[])
    {
      Scanner scanner=new Scanner(System.in);
      //array input 
      
      System.out.println("Enter Size of array");
      int n=scanner.nextInt();
      
      //creation
      int arr[]=new int[n];
      
      //input further
      
      System.out.println("Enter array elements");
      for(int index=0;index<n;index++)
      arr[index]=scanner.nextInt();
      
      //targtet input
      
      System.out.println("enter target element");
      int target=scanner.nextInt();
      
      //object creation
      BinSearch_Class bin=new BinSearch_Class();
      
      /*
      next portion of code has the actaul or expected position
      We check that through simple if else statements
      And Print the position with reuslt
      */
      
      int position=bin.Bin_Search(arr, target , 0 , n-1);
      
      // this is the condition check
      
      if((position>=0&&position<=arr.length-1)&&arr[position]==target)
      System.out.println((1+position)+" FOUND");
      else
      System.out.println(position+" NOT FOUND");
    }
}
//end*