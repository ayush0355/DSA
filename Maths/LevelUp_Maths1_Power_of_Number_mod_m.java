import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        long p=1000000007;
        long ans=1;
        for(int i=1; i<=n; i++){
            ans=((ans%p)*(a%p))%p;
        }
        System.out.println(ans);
    }
}