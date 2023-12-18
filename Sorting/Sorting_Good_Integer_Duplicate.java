import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(GoodIntegers(arr));
    }
    
    public static int GoodIntegers(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int ans =0;
        int lesscount = 0;
        
        if(arr[0] == 0){
            ans++;
        }
        for(int i=1;i<arr.length;i++){
           if(arr[i] != arr[i-1]){
               lesscount = i;
           }
            
            if(arr[i] == lesscount){
                ans++;
            }
        }
        
        return ans;
    }

}
