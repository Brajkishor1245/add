import java.util.*;
class t
{
public static void main(String arg[])
{ 
Scanner ob=new Scanner(System.in);
System.out.println("enter your string");
String a=ob.nextLine();
String b[]={"break","switch","if","else"};
int l=a.length();
boolean flag=false;
if(l>0&&l<=6){
for(int i=0;i<b.length;i++)
{
if(a.equals(b[i]))
{
//System.out.print("String is keyword");
flag=true;
}
}
if(flag)
System.out.println("String is  keyword");
else 
System.out.println("String is not keyword");
}
else
{
System.out.println("String is invalid");}}}
