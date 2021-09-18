import java.io.*;
import java.util.*;
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int k = in.nextInt();
        int e = in.nextInt();
    
    String p="";
   for(int i=k;i<=e;i++)
   {
       p=p+S.charAt(i);
   }
System.out.println(p);
}}