https://leetcode.com/problems/first-missing-positive/


class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<1 || nums[i]>nums.length || nums[i]-1==i){
                i++;
            }
            else{
                int idx=nums[i]-1;
                if(nums[i]==nums[idx]){
                    i++;
                }
                else{
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                }
            }
        }
        for(int j=0; j<nums.length; j++){
            if(j != nums[j]-1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}