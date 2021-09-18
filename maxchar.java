import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
String k=ob.nextLine();
int arr[]=new int[127];
for(int i=0;i<k.length();i++)
{
arr[k.charAt(i)]++;
}
int max=-1;
char c=' ';
for(int i=0;i<k.length();i++)
{
if(max<arr[k.charAt(i)])
{
max=arr[k.charAt(i)];
c=k.charAt(i);
}}
System.out.println(c);
System.out.println(k.charAt(max));;
}}