import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int count_aaa1(String st,int idx){
            if(idx>=st.length()-2){
                return 0;
            }
        if(st.charAt(idx)=='a' && st.charAt(idx+1)=='a' && st.charAt(idx+2)=='a'){
        int temp=count_aaa1(st,idx+1);
        return temp+1;
        }
        else{
            int temp=count_aaa1(st,idx+1);
            return temp;
        }
    }
    
    public static int count_aaa2(String st, int idx){
        if(idx>=st.length()-2){
            return 0;
        }
        
        if(st.charAt(idx)=='a' && st.charAt(idx+1)=='a' && st.charAt(idx+2)=='a'){
            int temp=count_aaa2(st,idx+3);
            return temp+1;
        }
        else{
            int temp=count_aaa2(st,idx+1);
            return temp;
        }
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(count_aaa1(st,0));
        System.out.println(count_aaa2(st,0));
    }
}