import java.io.*;
import java.util.*;
public class Large
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int max=0,temp;
if(a>=b && a>=c) 
{
System.out.println("Largest number: "+a);
}
if(b>=a && b>=c) 
{
System.out.println("Largest number: "+b);
}
if(c>=a && c>=b) 
{
System.out.println("Largest number: "+c);
}
}
}
