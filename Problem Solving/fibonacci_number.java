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
if(n==1){
    System.out.println("1");
}
        else{
int ans=0;
int first=0;
int second=1;
    for(int i=1; i<=n-1; i++){
    ans=first+second;
    first=second;
    second=ans;
    }
 
    System.out.println(ans);
    }
    }
}