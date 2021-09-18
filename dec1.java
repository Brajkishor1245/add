import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter your Binary number");
int n=ob.nextInt();
int p=0,rem;
int temp=0;
while(n!=0)
{
rem=n%10;
temp+=rem*(Math.pow(2,p));
n=n/10;
p++;
}
System.out.println(temp);}}