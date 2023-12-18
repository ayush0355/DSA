import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void toggle(char ch[],int n){
        int sp=0;
        int ep=n-1;
        while(sp<ep){
            char temp=ch[sp];
            ch[sp]=ch[ep];
            ch[ep]=temp;
            sp++;
            ep--;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char []ch=new char[n];
        for(int i=0; i<n; i++){
            ch[i]=str.charAt(i);
        }
        
                toggle(ch,n);
        for(int i=0; i<n; i++){
            System.out.print(ch[i]);
        }
            }
        }
     
