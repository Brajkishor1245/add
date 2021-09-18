import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
int arr[]=new int[n];
int i;
for(i=0;i<n;i++)
{
arr[i]=ob.nextInt();
}
     boolean flag=false;
        int temp=0;
    for(i=0;i<n-1;i++){
if(i==n-2)
{break;}else{
    {
        if(arr[i]>arr[i+1])
        {
	flag=true;
    }
   else{
    temp=arr[i];
    arr[i]=arr[i+1];
    arr[i+1]=temp;
    }}}}
System.out.println("your required output");
    for( i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }}