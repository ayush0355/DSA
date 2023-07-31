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
        int r=sc.nextInt();
        int nfact=fact(n);
        int rfact=fact(r);
        int nmrfact=(n-r);
        int ncr=nfact/(rfact*nmrfact);
        int npr=nfact/nmrfact;
        System.out.println(nfact);
        System.out.println(npr);
        System.out.println(ncr);
         
        
    }
    public static int fact(int n){
            int ans=1;
            for(int i=1; i<=n; i++){
                ans=ans*i;
            }
            return ans;
        }
}