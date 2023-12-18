https://leetcode.com/problems/climbing-stairs/description/


class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=stairs(n,dp);
        return ans;
    }
    public int stairs(int n,int dp[]){
        if(n==1||n==2){
            return n;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }

        int x=stairs(n-1,dp);
        int y=stairs(n-2,dp);
        int ans=x*1+y*1;
        dp[n]=ans;
        return ans;
    }
}