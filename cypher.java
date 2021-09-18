import java.util.*;
class t
{
String cypher(String str,int b)
{
int l=str.length();
int d[]=new int[l];
char c[]=new char[l];
for(int i=0;i<l;i++)
{
d[i]=str.charAt(i);
}
for(int i=0;i<l;i++)
{
if(d[i]>=48 &&d[i]<=57)
{
d[i]=d[i]+b;
}
else if(d[i]>=65 && d[i]<=90)
{
d[i]=d[i]+b;
}
else if(d[i]>=97 && d[i]<=122)
{
d[i]=d[i]+b;
}
}
for(int i=0;i<l;i++)
{
c[i]=(char)d[i];
}
String s=new String(c);
return s;
}}
class d
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
String a=ob.nextLine();
int n=ob.nextInt();
t os=new t();
String p=os.cypher(a,n);
System.out.println(p);
}}

