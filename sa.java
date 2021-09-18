import java.util.*;
class t
{
    public static void main(String arg[]);
    Scanner ob=new Scanner(System.in);
    int c=ob.nextInt();
    int r=ob.nextInt();
    int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
            for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=ob.nextInt();
            }
        }
        int s[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
                
            }
        }
            for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(s[i][j]+" ");
            }
        }
}}