import java.io.*;
import java.util.*;
public class Nloop
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int sum=0;
    int a[]=new int[N];
    for(int i=0;i<N;i++)
    {
      a[i]=s.nextInt();
    }
    for(int i=0;i<N;i++)
    {
      sum=sum+a[i];
    }
    System.out.println(sum);
  }
}
