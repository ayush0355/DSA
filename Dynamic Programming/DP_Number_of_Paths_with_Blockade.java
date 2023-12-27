import java.io.*;
import java.util.*;

public class Solution {
    public static int NoOfPaths(int mat[][],int row,int col){
        int dp[][]=new int [row][col];
        for(int i=0; i<row; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(mat,dp,row-1,col-1);
    }
    public static int helper(int mat[][],int dp[][],int row,int col){
        if(row<0||col<0){
            return 0;
        }
        if(row==0&&col==0){
            return 1;
        }
        if(mat[row][col]==0){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int x=helper(mat,dp,row-1,col);
        int y=helper(mat,dp,row,col-1);
        dp[row][col]=x+y;
        return x+y;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(NoOfPaths(mat,row,col));
    }
}