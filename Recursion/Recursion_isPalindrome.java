import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
            public static boolean isPalindrome(char ch[],int sp,int ep){
                if(sp>=ep){return true;}
                    if(ch[sp]==ch[ep]){
                    boolean temp=isPalindrome(ch,sp+1,ep-1);
                return temp;
                }
                else{return false;}
            }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char ch[]=new char[st.length()];
        for(int i=0;i<ch.length; i++){
            ch[i]=st.charAt(i);
        }
        for(int i=0; i<ch.length; i++){
            if(ch[i]>=97 && ch[i]<=122){
                ch[i]=(char)(ch[i]-32);
            }
        }
        System.out.println(isPalindrome(ch,0,st.length()-1));
    }
}