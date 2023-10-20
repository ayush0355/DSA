import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static void frequency(int arr[],int que[]){
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0; i<arr.length; i++){
                    if(hm.containsKey(arr[i])==true){
                   int temp=hm.get(arr[i]);
                    hm.put(arr[i],temp+1);
                }
                else{
                  hm.put(arr[i],1);  
                }
            }
            for(int i=0; i<que.length; i++){
                if(hm.containsKey(que[i])==true){
                    System.out.println(hm.get(que[i]));
                }
                else{
                    System.out.println("0");
                }
            }
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int que[]=new int[m];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            que[i]=sc.nextInt();
        }
        frequency(arr,que);
    }
}