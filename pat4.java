import java.util.*;
class t
{
public static void main(String srh[])
{
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
for(int i=0;i<n;i++)
{
for(int j=n;j>i;j--)
{
System.out.print(" ");
}
for(int k=1;k<i;k++)
{
System.out.print("*");
}
System.out.println();
}}}