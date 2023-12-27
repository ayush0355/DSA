https://leetcode.com/problems/perfect-squares/description/



class Solution {
    public int numSquares(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=PS(n,dp);
        return ans;
    }
    public int PS(int n,int dp[]){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int small=Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++){
            int temp=PS(n-i*i,dp);
            small=Math.min(small,temp);
        }
        dp[n]=small+1;
        return small+1;
    }
}