import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        int arr[]=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
        System.out.println(max(arr));
    }
    public static int max(int arr[]){
        int max=arr[0];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){max=arr[i]; index=i;}
        }
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(i!=index && max>=2*arr[i]){
                count++;
            }
        }
       if(count==arr.length-1){return index;}
        else{return -1;}
    }
}