import java.util.*;
class d
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter your number");
int temp=1;
int r=ob.nextInt();
while(r>0)
{
int m=r%10;
temp=temp*m;
r=r/10;
}
System.out.println("OTP CODE IS: " +temp);
}}