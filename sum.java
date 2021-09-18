import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
String k=ob.nextLine();
String b[]=k.split(" ");
int c[]=new int[n];
for(int i=0;i<n;i++)
{
c[i]=Integer.valueOf(b[i]);
}
int Sum=c[0]+c[1];
System.out.println(Sum);
}}