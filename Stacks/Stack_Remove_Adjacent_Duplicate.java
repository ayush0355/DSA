import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static String duplicate(String s){
            Stack<Character> st=new Stack<>();
            for(int i=0; i<s.length(); i++){
                if(st.size()==0){
                    st.push(s.charAt(i));
                    continue;
                }
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            char arr[]=new char[st.size()];
            for(int i=st.size()-1; i>=0; i--){
                arr[i]=st.pop();
            }
            String str="";
            for(int i=0; i<arr.length; i++){
                str=str+arr[i];
            }
            return str;
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(duplicate(s));
    }
}