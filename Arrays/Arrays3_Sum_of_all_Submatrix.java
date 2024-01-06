import java.io.*;
import java.util.*;

public class Solution {
 public static int sum_of_submatrices(int arr[][]){
     int ans=0;   
     for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                int occ=(i+1)*(j+1)*(arr.length-i)*(arr[0].length-j);
                    ans+=occ*arr[i][j];
            }
        }
     return ans;
 }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(sum_of_submatrices(arr));
    }
}