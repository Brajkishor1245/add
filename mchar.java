import java.util.*;
class t
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter your string");
String s=ob.nextLine();
int a[]=new int[256];
for(int i=0;i<s.length();i++)
{
a[s.charAt(i)]++;
}
for(int i=0;i<256;i++)
{
System.out.print(a[i]);
}
int max=a[0];
char l=' ';
for(int i=0;i<256;i++)
{
if(a[i]>max)
{max=a[i];
l=s.charAt(i);}

}
System.out.println();
System.out.println(max);
System.out.println("most repeted character" +l);
}}