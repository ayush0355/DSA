import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        long p=1000000007;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        long ans=0;
        long mul=1;
        for(int i=n-1; i>=0; i--){
            ans=((ans%p)+((arr[i]%p)*(mul%p)))%p;
            mul=(mul*10)%p;
        }
            System.out.println(ans);
    }
}