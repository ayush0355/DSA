https://leetcode.com/problems/minimum-path-sum/description/


class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int dp[][]=new int[row][col];
        for(int i=0; i<row; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return helper(grid,dp,row-1,col-1);
    }
    public static int helper(int mat[][],int dp[][],int row,int col){
        if(row<0||col<0){
            return Integer.MAX_VALUE;
        }
        if(row==0&&col==0){
            return mat[row][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int temp1=helper(mat,dp,row-1,col);
        int temp2=helper(mat,dp,row,col-1);
        int ans=Math.min(temp1,temp2)+mat[row][col];
        dp[row][col]=ans;
        return ans;
    }
}