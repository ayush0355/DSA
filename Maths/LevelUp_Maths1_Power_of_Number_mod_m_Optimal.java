import java.io.*;
import java.util.*;

public class Solution {
    public static long pow(long a, long n, long m){
        if(n==0){return 1;}
        long temp=pow(a,n/2,m);
        if(n%2==0){
            return ((temp%m)*(temp%m))%m;
        }
        else{
            long x=((temp%m)*(temp%m))%m;
            return (x*a)%m;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long n=sc.nextInt();
        long m=1000000007;
        System.out.println(pow(a,n,m));
    }
}