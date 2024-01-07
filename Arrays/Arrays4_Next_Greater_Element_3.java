https://leetcode.com/problems/next-greater-element-iii/


class Solution {
    public int nextGreaterElement(int n) {
        char[] number=(n+"").toCharArray();
        int idx=-1;
        for(int i=number.length-2; i>=0; i--){
            if(number[i]<number[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){return -1;}
        int val=number[idx];
        int smallest=idx+1;
        for(int i=idx+1; i<number.length; i++){
            if(number[i]>val && number[i]<=number[smallest]){
                smallest=i;
            }
        }
        char temp=number[idx];
        number[idx]=number[smallest];
        number[smallest]=temp;
        
        int sp=idx+1;
        int ep=number.length-1;
        while(sp<=ep){
            char tem=number[sp];
            number[sp]=number[ep];
            number[ep]=tem;
            sp++;
            ep--;
        }
        long ans=Long.parseLong(new String(number));
        if(ans>Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
    }
}