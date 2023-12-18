import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static void bits_is_even(int n){
            if((n&1)==1){
                System.out.println("odd");
            }
            else{
                System.out.println("even");
            }
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        bits_is_even(n);
    }
}