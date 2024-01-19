import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1){
            System.out.println(-1);
        }
        else{
            int ans=1;
            for(int i=0; i<n/2; i++){
                for(int j=0; j<2; j++){
                    System.out.print(ans+" ");
                    ans++;
                }
                System.out.println();
            }
        }
    }
}