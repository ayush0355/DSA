import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static void zigzag(int arr[][],int m,int n){
            for(int i=0; i<m; i++){
                if(i%2==0){
                    for(int j=0; j<n; j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
                else{
                    for(int j=n-1; j>=0; j--){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        zigzag(arr,m,n);
    }
}