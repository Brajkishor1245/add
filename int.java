import java.util.*;
import java.lang.*;
class t
{
public static void main(String arg[]) 
{
Scanner ob=new Scanner(System.in);
//System.out.println("enter your String")
//System.out.println();
System.out.println("enter your number");
int n=ob.nextInt();
ob.nextLine();
System.out.println("Enter your string");
String s=ob.nextLine();
String b[]=s.split(" ");
//int n=b.length;
//String b[]=s.split(" ");
int c[]=new int[b.length];
for(int i=0;i<c.length;i++)
{
c[i]=Integer.parseInt(b[i]);
}
Arrays.sort(c);
System.out.println(b.length);
System.out.println(c[c.length-1]+c[c.length-2]);
}}
