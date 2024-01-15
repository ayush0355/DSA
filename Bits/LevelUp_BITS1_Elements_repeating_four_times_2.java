import java.io.*;
import java.util.*;

public class Solution {
    public static boolean check(int n, int i){
        int ans=(int)(n&(1<<i));
        if(ans==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0; i<32; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(check(arr[j],i)==true){
                    count++;
                }
            }
            if(count%4==2){
                ans+=1<<i;
            }
        }
        System.out.println(ans);
    }
}