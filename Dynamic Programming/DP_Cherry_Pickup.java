https://leetcode.com/problems/cherry-pickup/description/



class Solution {
    public int cherryPickup(int[][] grid) {
     int dp[][][]=new int[grid.length][grid[0].length][grid.length];
     int ans= helper(grid,dp,0,0,0);
     if(ans==Integer.MIN_VALUE){
         return 0;
     }   
     else {return ans;}
    }
    public static int helper(int mat[][],int dp[][][],int row1,int col1,int row2){
           int col2=row1+col1-row2;
            if(row1>=mat.length || row2>= mat.length || col1 >= mat[0].length|| col2 >= mat[0].length || mat[row1][col1] == -1||mat[row2][col2] == -1){
                return Integer.MIN_VALUE;
            }
            if(row1==mat.length-1&&col1==mat[0].length-1&&row2==mat.length-1&&col2==mat[0].length-1){
                return mat[row1][col1];
            }
            if(dp[row1][col1][row2]!=0){
                return dp[row1][col1][row2];
            }
           


            int temp1=helper(mat,dp,row1,col1+1,row2);
            int temp4=helper(mat,dp,row1+1,col1,row2+1);           
            int temp2=helper(mat,dp,row1,col1+1,row2+1);
            int temp3=helper(mat,dp,row1+1,col1,row2);
            int max=Math.max(Math.max(temp1,temp2),Math.max(temp3,temp4));
            int contri=0;
            if(row1==row2&&col1==col2){
                contri=mat[row1][col1];
            }
            else{
                contri=mat[row1][col1]+mat[row2][col2];
            }
            if(max==Integer.MIN_VALUE){
                dp[row1][col1][row2]=Integer.MIN_VALUE;
                return Integer.MIN_VALUE;
            }
            else{
            dp[row1][col1][row2]=max+contri;
            return max+contri;
            }
    }
}