import java.io.*;
import java.util.*;
public class Alphabet
{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
{
char ch=s.next().charAt(0);
  if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
