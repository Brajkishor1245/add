import java.util.*;
import java.lang.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
int a[]=new int[100];
for(int i=0;i<10;i++)
{
a[i]=ob.nextInt();
}
int fee=0;
for(int i=0;i<10;i++)
{
if(a[i]<17)
{
fee=fee+200;}
else if(a[i]<=17&& a[i]>=40)
{
fee=fee+400;
}
else if(a[i]>40);
{
fee=fee+300;
}
}
System.out.print("TOTAL INCOME " +fee +" INR");
}}