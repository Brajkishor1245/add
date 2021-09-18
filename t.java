import java.util.*;
class d
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);

int num=0;
int n=ob.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<=i+2;j++)
{
System.out.print(num);
num=num+1;
}
System.out.println();
}}}