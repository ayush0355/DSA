import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkbit(int n, int i){
        int ans=(int)(n&(1<<i));
        if(ans==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int findElement(int arr[]){
        int ans=0;
        for(int i=0; i<32; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(checkbit(arr[j],i)==true){
                    count++;
                }
            }
            if(count%3==2){
                ans+=1<<i;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
        int ans=findElement(arr);
        System.out.println(ans);
    }
}