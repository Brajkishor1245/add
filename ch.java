import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
String k=ob.nextLine();
char c[]=k.toCharArray();
for(int i=0;i<c.length;i++){
System.out.print(c[i]+" ");}
Arrays.sort(c);
System.out.println();
for(int i=0;i<c.length;i++)
{
System.out.print(c[i]+" ");}
System.out.println();
String s="";
for(int i=c.length-1;i>=0;i--)
{
s=s+k.charAt(i);
}
System.out.println("Reverse string is " +s);
if(k.equals(s))
System.out.println("palindrome");
else
System.out.println("Not palindrome");
System.out.println("enter your substring and location");
String p=ob.nextLine();
int n=ob.nextInt();
StringBuffer sb=new StringBuffer(k);
sb.insert(n,p);
sb.append(p);
String x=sb.toString();

String y=sb.toString();
System.out.println("New String is :"+x);
System.out.println("Appended string is "+y);
}}