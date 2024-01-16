import java.io.*;
import java.util.*;

public class Solution {
    public static boolean check(int n, int i){
        if((int)(n&(1<<i))==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int maxAnd(int arr[]){
        for(int i=31; i>=0; i--){
            int c=0;
            for(int j=0; j<arr.length; j++){
                if(check(arr[j],i)==true){
                    c++;
                }
            }
        if(c>=2){
            for(int k=0; k<arr.length; k++){
                if(check(arr[k],i)==false){
                    arr[k]=0;
                }
            }
        }
        }
        int idx1=-1;
        int idx2=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0 && idx1==-1){
                idx1=i;
            }
            else if(arr[i]>0 && idx2==-1){
                idx2=i;
                break;
            }
        }
        return (int)arr[idx1]&arr[idx2];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxAnd(arr));
    }
}