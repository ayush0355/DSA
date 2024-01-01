https://leetcode.com/problems/range-sum-query-immutable/



class NumArray {
 int arr[];
    public NumArray(int[] nums) {
        arr=new int[nums.length];
     arr[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            arr[i]=arr[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return arr[right];
        }
        else{
            return arr[right]-arr[left-1];
        }
    }
}

