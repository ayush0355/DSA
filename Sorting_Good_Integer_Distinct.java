import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int goodIntegerDistinct(int arr[],int n){
        Arrays.sort(arr);
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]==i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(goodIntegerDistinct(arr,n));
        
        }
}