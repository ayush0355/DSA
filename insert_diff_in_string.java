import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static String Stringdiff(String st){
            int n=st.length();
            String ans="";
            for(int i=0; i<n-1; i++){
                ans=ans+st.charAt(i);
                int temp=st.charAt(i+1)-st.charAt(i);
                ans=ans+temp;
            }
            ans=ans+st.charAt(n-1);
            return ans;
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(Stringdiff(st));
        
    }
}