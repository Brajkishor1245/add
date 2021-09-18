/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner ob=new Scanner(System.in);
	    int a=ob.nextInt();
	    int l=ob.nextInt();
	    String s=ob.nextLine();
	    char c[]=new char[l];
	    for(int i=0;i<l;i++)
	    {
	        c[i]=s.charAt(i);
	    }
	    int b[]=new int[l];
	    for(int i=0;i<l;i++)
	   {
	       b[i]=c[i];
		
	}
	for(int i=0;i<l;i++)
	   {
	       System.out.println(b[i]+"    "+c[i]);
}}}