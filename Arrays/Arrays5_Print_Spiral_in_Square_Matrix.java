import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        int steps=n-1;
        while(steps>=1){
            for(int k=0; k<steps;k++){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            for(int k=0; k<steps; k++){
                System.out.print(arr[i][j]+" ");
                i++;
            }
            for(int k=0; k<steps; k++){
                System.out.print(arr[i][j]+" ");
                j--;
            }
            for(int k=0; k<steps; k++){
                System.out.print(arr[i][j]+" ");
                i--;
            }
            i++;
            j++;
            steps=steps-2;
        }
        if(steps==0){
            System.out.print(arr[i][j]);
        }
    }
}