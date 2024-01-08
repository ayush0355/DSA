import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
                arr[a][b]=sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        for(int a=0; a<n-1; a++){
            System.out.print(arr[i][j]+" ");
            j++;
        }
        for(int a=0; a<n-1; a++){
            System.out.print(arr[i][j]+" ");
            i++;
        }
        for(int a=0; a<n-1; a++){
            System.out.print(arr[i][j]+" ");
            j--;
        }
        for(int a=0; a<n-1; a++){
            System.out.print(arr[i][j]+" ");
                i--;
        }
        
    }
}