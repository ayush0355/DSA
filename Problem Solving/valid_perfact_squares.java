import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=perfect(n);
        System.out.println(ans);
    }
   public static boolean perfect(int n){
         for(int i=1; i*i<=n; i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
}