import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int orderOfRemoval(int arr[]){
        Arrays.sort(arr);
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans=ans+arr[i]*(arr.length-i);
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
        System.out.println(orderOfRemoval(arr));
    }
}