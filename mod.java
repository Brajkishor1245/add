import java.util.*;
class t
{
public static void main(String arg[])
{
int num,n,i;
Scanner ob=new Scanner(System.in);
System.out.println("enter your number");
num=ob.nextInt();
System.out.println("enyter number you want to add");
n=ob.nextInt();
String k=String.valueOf(num);
int l=k.length();
int ch[]=new int[l];
for(i=0;i<l;i++)
{
ch[i]=k.charAt(i);
}
int ne[]=new int[l];
for(i=0;i<l;i++)
{
ne[i]=ch[i];
ne[i]=ne[i]+(n);
};
for(i=0;i<l;i++)
{
System.out.print(ne[i]);
System.out.print("");}
System.out.println("");
for(i=0;i<l;i++)
{
System.out.println(ch[i]);}}}

