import java.util.*;
class t
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        String n=ob.nextLine();
        String s=ob.nextLine();
        int f=ob.nextInt();
        String b[]=s.split(" ");
        int c[]=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            c[i]=Integer.parseInt(b[i]);
            
        }int count=0;
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            if(f==c[i])
            count=i;
        }
        System.out.println(count);
    }
}