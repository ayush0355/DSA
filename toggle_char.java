import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void toggle(char ch[],int n){
        for(int i=0; i<n; i++){
            if(ch[i]>64 && ch[i]<91){
                ch[i]=(char)(ch[i]+32);
            }
            else if(ch[i]>96 && ch[i]<123){
                ch[i]=(char)(ch[i]-32);
            }
        }    
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char ch[]=new char[n];
        for(int i=0; i<n; i++){
            ch[i]=str.charAt(i);
        }
        toggle(ch,n);
        for(int i=0; i<n; i++){
            System.out.print(ch[i]);
        }
        
        
            }
        }
     
