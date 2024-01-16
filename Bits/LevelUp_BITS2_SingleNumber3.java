https://leetcode.com/problems/single-number-iii/


class Solution {
    public boolean check(int n, int i){
        if((int)(n&(1<<i))==0){return false;}
        else{return true;}
    }
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        int v=0;
        for(int i=0; i<nums.length; i++){
            v=v^nums[i];
        }
        int idx=-1;
        for(int i=0; i<32; i++){
            if(check(v,i)==true){idx=i;
                                break;
            }
        }
        int set1=0;
        int set2=0;
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            if(check(num,idx)==true){set1=set1^num;}
            else{set2=set2^num;}
        }
        ans[0]=set1;
        ans[1]=set2;
        return ans;
    }
}