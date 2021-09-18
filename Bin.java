import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
long n=ob.nextLong();
long sum=0;
for(int i=0;i<n;i++)
{
if(n

i==0)
{sum=sum+i;
}
}
if(sum==n)
{
System.out.println("perfect number");
}
else
{
System.out.println("not perfect number");
}
}}
