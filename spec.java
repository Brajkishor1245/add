import java.util.*;
class t
{
int cou(String a)
{
int count=0;
int n=a.length();
int b[]=new int[n];
for(int i=0;i<n;i++)
{
b[i]=a.charAt(i);
}
for(int i=0;i<n;i++)
{
if(b[i]>=48 &&b[i]<=57)
{
continue;
}
if(b[i]>=65 &&b[i]<=90)
{
continue;}
if(b[i]>=97 &&b[i]<=122)
{
continue;
}
else{
count=count+1;}

}
return count;}}
class d
{
public static void main(String arg [])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter your string");
String s=ob.nextLine();
t os=new t();
int r=os.cou(s);
System.out.println("occurance of soecial character is :" +r);
}}
