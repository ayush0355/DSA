import java.io.*;
import java.util.*;

public class Solution {
    public static int sum(int arr[],int n){
       int ans=0;
        for(int i=0; i<n; i++){
            int occ=(i+1)*(n-i);
            ans+=occ*arr[i];
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
        System.out.println(sum(arr,n));
    }
}