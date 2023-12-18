import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isSortace(int arr[],int sp,int ep){
        if(sp==ep){return true;}
        boolean temp=isSortace(arr,sp+1,ep);
        if(arr[sp]<=arr[ep]){
            return temp;
        }
            else{
                return false;
            }
    
       
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isSortace(arr,0,n-1));
        
    }
}