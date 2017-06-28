import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=Integer.toString(n).length();

int i=0;
int b[]=new int[100];
while(n!=0)
{
b[i]=n%10;
n=n/10;
i++;
}
System.out.println(b(m-1)b(m));
}
}


