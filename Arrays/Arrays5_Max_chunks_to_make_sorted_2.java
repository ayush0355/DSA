https://leetcode.com/problems/max-chunks-to-make-sorted-ii/description/

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int pmax[]=new int [n];
        int smin[]=new int [n];
        pmax[0]=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>pmax[i-1]){pmax[i]=arr[i];}
            else{pmax[i]=pmax[i-1];}
        }
        smin[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            if(arr[i]<smin[i+1]){smin[i]=arr[i];}
            else{smin[i]=smin[i+1];}
        }
        int count=0;
        for(int i=0; i<n-1; i++){
            if(pmax[i]<=smin[i+1]){count++;}
        }
        count++;
        return count;
    }
}
