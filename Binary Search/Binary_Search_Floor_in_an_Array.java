import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int floor(int arr[],int k){
        int ans=Integer.MIN_VALUE;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==k){
                return arr[m];
            }
            else if(arr[m]<k && arr[m]>ans){
                ans=arr[m];
                    l=m+1;
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
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(floor(arr,k));
    }
}