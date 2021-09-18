import java.util.*;
class d
{
public static void main(String arg[])

{
Scanner ob=new Scanner(System.in);
System.out.println("enter number of row");
int r=ob.nextInt();
System.out.println("enter number of column");
int c=ob.nextInt(); 
int a[][]=new int[r][c];
System.out.println("enter matrix elements");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=ob.nextInt();
}}
System.out.println("Matrix elements are");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j]+"  ");
}
System.out.println();
}
int sum=0;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if(i==j){
sum=sum+a[i][j];
}}}
System.out.println("Sum of diagonal is" +sum);

}}