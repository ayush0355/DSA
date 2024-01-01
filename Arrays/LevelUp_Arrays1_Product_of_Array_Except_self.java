https://leetcode.com/problems/product-of-array-except-self/description/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pf[]=new int [n];
        pf[0]=nums[0];
        for(int i=1; i<n; i++){
            pf[i]=pf[i-1]*nums[i];
        }
        int sufx=1;
        for(int i=n-1; i>0; i--){
            pf[i]=pf[i-1]*sufx;
            sufx=sufx*nums[i];
        }
        pf[0]=sufx;
        return pf; 
    }
}