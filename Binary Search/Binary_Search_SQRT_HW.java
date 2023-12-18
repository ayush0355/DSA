import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int Sqrt(int n){
        int l=0;
        int h=n;
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(m*m==n){
                return m;
            }
            if(m*m<n && m*m>ans ){
                l=m+1;
                ans=m;
            }
            else{
                h=m-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Sqrt(n));
    }
}