import java.util.*;
//import java.util.set;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.println("ENTER YOUR STRING");
String k=ob.nextLine();
int n=k.length();
char c[]=k.toCharArray();
boolean arr[]=new boolean[256];
StringBuffer sb=new StringBuffer();
for(int i=0;i<n;i++)
{char p=c[i];
if(!arr[p])
{
arr[p]=true;
sb.append(p);}
}
System.out.println(sb.toString());
}}