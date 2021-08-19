public class Subsequence 
{
    //prints all the subsequence of any String passed to this function
    public static void subsequence_helper(String s,int n,int start,String temp)
    {
     if(start==n)
     System.out.println(temp);
     else
     {
         subsequence_helper(s,n,start+1,temp);
         subsequence_helper(s,n,start+1,(temp+s.charAt(start)));
     }
    }
    //helper function
    public static void subsequence(String s)
    {
        subsequence_helper(s,s.length(),0,"");
    }
    //driver
    public static void main(String args[]) 
    {
    // We may give any string !
     String s="xyz";
     //we just need to pass the string and thats it!
     subsequence(s);
    }
    
   
}