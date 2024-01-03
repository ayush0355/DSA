https://leetcode.com/problems/trapping-rain-water/



class Solution {
    public int trap(int[] height) {
      int n=height.length;
      int pfx[]=pfx(height);
      int sufx[]=sufx(height);
        int amount=0;
        for(int i=1; i<height.length-1; i++){
            int lb=pfx[i-1];
            int rb=sufx[i+1];
            int yb=Math.min(lb,rb);
            int contri=yb-height[i];
            if(contri>0){
                amount=amount+contri;
            }

        }
        return amount;
    }
    public int [] pfx(int arr[]){
        int pfx[]=new int [arr.length];
        pfx[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            pfx[i]=Math.max(pfx[i-1],arr[i]);
        }
        return pfx;
    }
    public int [] sufx(int arr[]){
        int n=arr.length;
        int suf[]=new int [n];
        suf[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            suf[i]=Math.max(suf[i+1],arr[i]);
        }
        return suf;
    }
}