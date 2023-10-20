import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        System.out.println(twosum(arr,k));
        
        
        
    }
    
    public static boolean twosum(int[] arr, int k){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        
        return false;
    }
}
