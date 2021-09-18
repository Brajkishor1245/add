import java.util.*;
class t
{
public static void main(String srg[])
{
Scanner ob=new Scanner(System.in);
String s=ob.nextLine();
int l=s.length();
char b[]=new char[l];
for(int i=0;i<l;i++)
{
b[i]=s.charAt(i);
}
char temp;
char flag;
char p[]=new char[l];
for(int i=0;i<l-1;i++)
{
temp=b[i];
flag=b[i+1];
p[i]=b[i+1];
p[i+1]=b[i];
}
String k=new String(p);
System.out.println(k);
}}
