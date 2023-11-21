import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int singleElement(int []arr,int n){
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int l=2;
        int h=arr.length-3;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]!=arr[m-1] && arr[m]!=arr[m+1]){
                return arr[m];
            }
            if(arr[m]==arr[m-1]){
                m--;
            }
            if(m%2==0){
                l=m+2;
            }
            else{
                h=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(singleElement(arr,n));
    }
}