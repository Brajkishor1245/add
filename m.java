import java.util.*;
class t
{
public static void  main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter your string");
String s=ob.nextLine();
int l=s.length();
int b[]=new int[l];
for(int i=0;i<l;i++)
{
b[i]=Integer.parseInt(s.charAt(i));
}
for(int i=0;i<l;i++)
{
System.out.println(b[i]);
}
}}
