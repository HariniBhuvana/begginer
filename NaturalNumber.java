import java.io.*;
import java.util.*;
public class NaturalNumber
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n,count=0;
    System.out.println("enter the no");
     n=s.nextInt();
  
    while(n > 0)
    {
      n=n/10;
      count++;
    }
    System.out.println(count);
    
    
  }
  
}
 
