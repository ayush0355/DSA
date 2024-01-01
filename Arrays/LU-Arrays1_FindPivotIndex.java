https://leetcode.com/problems/find-pivot-index/



class Solution {
    public int pivotIndex(int[] nums) {
        int pfx[]=new int[nums.length];
        pfx[0]=nums[0];
        for(int i=1;i<nums.length; i++){
            pfx[i]=pfx[i-1]+nums[i];
        }
        if(pfx[nums.length-1]-nums[0]==0 ){
                return 0;
            }
            
        for(int i=1; i<nums.length-1; i++){
            if(pfx[i-1]==pfx[nums.length-1]-pfx[i]){
                return i;
            }
        }
        if(pfx[nums.length-2]==0){
               return nums.length-1;
            }
        return -1;
    }
}