https://leetcode.com/problems/maximum-product-subarray/



class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int pfx1=1;
        for(int i=0; i<nums.length; i++){
            if(pfx1==0){
                pfx1=nums[i];
            }
            else{
                pfx1=pfx1*nums[i];
            }
            max1=Math.max(pfx1,max1);
        }
        int pfx2=1;
        int max2=Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            if(pfx2==0){pfx2=nums[i];}
            else{
                pfx2=pfx2*nums[i];
            }
            max2=Math.max(max2,pfx2);
        }
         return Math.max(max1,max2);
        
        
    }
}