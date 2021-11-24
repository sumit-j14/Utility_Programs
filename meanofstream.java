// this is a program for finding out the arithmetic mean of stream of POSITIVE
// as well as NEGATIVE numbers 
import java.util.Scanner;
public class meanofstream {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int sum = 0;
    double average = 0;
    int numbers = 0 ;
System.out.println("keep entering number one by one");
System.out.println("press -999999 to exit");
while(true)
{
int next = sc.nextInt();
if(next==-999999)
{
    System.out.println("EXIT SUCESSFUL");
    break;
}
numbers++;
sum+=next;
average= sum/(double)numbers;
System.out.println("new average is "+average);
}
}
}