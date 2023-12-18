import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b1=true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                b1=false;
                break;
            }
        }
    if(b1){
        System.out.println("Prime");
    }
        else{
            System.out.println("Not Prime");
        }
    }
}