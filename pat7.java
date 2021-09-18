import java.util.*;
class t
{
public static void main(String arh[])
{
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=(i*2)-1;k++)
{
System.out.print("$");
}
System.out.println();
}
for(int g=n-1;g>=1;g--)
{
for(int j=1;j<n;j++)
{
System.out.print("");
}
for(int k=1;k<=(g*2)-1;k++)
{System.out.println("$");
}
System.out.println();
}

for(int i=0;i<=n+2;i++)
{
System.out.println("@");
}}}



