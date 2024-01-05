https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/


class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans=0;
        int lgei=0;
        int prevalidcount=0;
        for(int ep=0; ep<nums.length; ep++){
            if(nums[ep]>right){
                ans+=0;
                lgei=ep+1;
                prevalidcount=0;
            }
            else if(nums[ep]<=right && nums[ep]>=left){
                ans+=ep-lgei+1;
                prevalidcount=ep-lgei+1;
            }
            else{
                ans+=prevalidcount;
            }
        }
        return ans;
    }
}