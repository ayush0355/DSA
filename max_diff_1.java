import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static int max(int arr[]){
    int max=Integer.MIN_VALUE ;   
    for(int i=0; i<arr.length; i++){
            if(arr[i]>max){max=arr[i];}
        }
    return max;
}
  public static int min(int arr[]){
    int min=Integer.MAX_VALUE;    
    for(int i=0; i<arr.length; i++){
            if(arr[i]<min){min=arr[i];}
        }
    return min;
}  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       int diff=max(arr)-min(arr);
        System.out.println(diff);
    }
}