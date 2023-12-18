import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void uppercase(char ch[]){
        for(int i=0; i<ch.length; i++){
            if(ch[i]>=97 && ch[i]<=122){
                ch[i]=(char)(ch[i]-32);
            }
        }
    }
        public static boolean isPalindrome(char ch[]){
            boolean ans=true;
            int sp=0;
           int  ep=ch.length-1;
            while(sp<ep){
                if(ch[sp] != ch[ep]){
                    ans=false;
                    return ans;
                }
                sp++;
                ep--;
            }
            return ans;
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char ch[]=new char[st.length()];
        for(int i=0; i<st.length(); i++){
            ch[i]=st.charAt(i);
        }
        uppercase(ch);
        System.out.println(isPalindrome(ch));
        
    }
}