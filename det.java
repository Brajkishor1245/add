import java.util.*;
import java.lang.Integer;
class StringToIntExample1
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
       String s=ob.nextLine();
       String b=ob.nextLine();
       String s1[]=s.split(" ");
       String s2[]=s.split(" ");
       int c1[]=new int[2];
       int c2[]=new int[2];
       for(int i=0;i<2;i++)
       {String x=s1[i];
String y=s2[i];
           c1[i]=Integer.parseInt(x);
           c2[i]=Integer.parseInt(y);
       }
       int su=c1[0]*c2[1];
       int cu=c2[0]*c1[1];
       int f=su-cu;
       System.out.println(f);
    }
}