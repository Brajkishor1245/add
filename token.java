
import java.io.*;
import java.util.*;

 class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.length()>0)
        {
            
        String a[] = s.split("[!,?._'@\\s]+");
        }
        int n=a.length;
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}

