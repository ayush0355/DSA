https://leetcode.com/problems/single-number-ii/



class Solution {
    public int singleNumber(int[] nums) {
     int ans=0;
     for(int i=0; i<32; i++){
         int count=0;
         for(int j=0; j<nums.length; j++){
             if((int)(nums[j]&(1<<i))!=0){
                 count++;
             }
         }
         if(count%3==1){
             ans+=(int)(1<<i);
         }
     }
     return ans;   
    }
}