import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
ArrayList<Integer> arr=new ArrayList<Integer>();
int n=ob.nextInt();
int fee=0; 
for(int i=0;i<n;i++)
{
arr.add(ob.nextInt());
}
for(int i=0;i<n;i++)
{
if(arr.get(i)<=17)
{
fee=fee+200;
}
else if(arr.get(i)>17 && arr.get(i)<=40)
{
fee=fee+400;
}
else if(arr.get(i)>40)
{
fee=fee+300;
}
}
System.out.println("Your Income " +fee+" INR");
for(int i=0;i<arr.size();i++)
{
System.out.print(arr.get(i)+" ");
}
System.out.println();
System.out.println(arr);
}}