import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int firstIdx(int []arr, int m,int idx){
        
        if (idx ==arr.length){
            return -1;
        }
        if(arr[idx]==m){return idx;}
        
        int temp=firstIdx(arr,m,idx+1);
        return temp;
        }
        
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(firstIdx(arr,m,0));
    }
}