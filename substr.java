import java.util.Scanner;
 
 class t {
 
    public static void main(String args[]){
 
        Scanner in = new Scanner(System.in);
 
        String s, m;
 
        System.out.println("Enter the main String");
        s = in.nextLine();
 
        System.out.println("Enter the match String");
        m = in.nextLine();
 
        int index , count =0;
 
        while((index = s.contain(m)) != -1){
            count++;
            str = str.substring(index+1);
        }
 
        System.out.println("Count: "+count);
 
    }
}