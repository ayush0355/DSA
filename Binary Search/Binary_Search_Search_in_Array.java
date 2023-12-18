import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean BinarySearch(int arr[], int k){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[mid]>k){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
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
        System.out.println(BinarySearch(arr,k));
    }
}