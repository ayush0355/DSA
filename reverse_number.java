import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}