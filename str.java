import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enetr your number");
int n=ob.nextInt();
String s="";
while(n>0)
{
int rem=n%2;
s=s+rem;
n=n-rem;
n=n/2;
}
StringBuffer sb=new StringBuffer(s);
System.out.println(sb.reverse());
}}
