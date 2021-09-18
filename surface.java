import java.util.*;
class surface
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
int a=ob.nextInt();
int b=ob.nextInt();
float c[]=new float[a];
float d[]=new float[b];
for(int i=0;i<a;i++)
{
c[i]=ob.nextFloat();
}
for(int i=0;i<b;i++)
{
d[i]=ob.nextFloat();
}
float sum=0;
float fsum=0;
for(int i=0;i<a;i++)
{
sum=sum +(18*c[i]);
}
for(int i=0;i<b;i++)
{
fsum=fsum+(12*d[i]);
}
float cal=fsum+sum;
System.out.println("Total estimated cost: "+cal);
}}