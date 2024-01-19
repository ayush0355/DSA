import java.io.*;
import java.util.*;

public class Solution {
    public static void prime(int n,int Q[]){
        int spf[]=new int[n+1];
        for(int i=0; i<=n; i++){
            spf[i]=i;
        }
        for(int i=2; i*i<=n; i++){
            if(spf[i]==i){
                for(int j=i*i; j<=n; j+=i){
                    spf[j]=Math.min(spf[j],i);
                }
            }
        }
        for(int i=0; i<Q.length; i++){
            int x=Q[i];
            while(x>1){
                System.out.print(spf[x]+" ");
                x=x/spf[x];
            }
            System.out.println();
        }
    }
    public static int[] spf(int n){
        int spf[]=new int[n+1];
        for(int i=0; i<=n; i++){
            spf[i]=i;
        }
        for(int i=2; i*i<=n; i++){
            if(spf[i]==i){
                for(int j=i*i; j<=n; j+=i){
                    spf[j]=Math.min(spf[j],i);
                }
            }
        }
        return spf;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int Q[]=new int[q];
        for(int i=0; i<q; i++){
            Q[i]=sc.nextInt();
        }
        prime(n,Q);
    }
}