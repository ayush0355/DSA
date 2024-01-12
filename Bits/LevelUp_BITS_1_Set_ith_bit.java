https://www.geeksforgeeks.org/problems/set-kth-bit3724/1?utm_source=gfg


class Solution{
     static boolean checkbit(int n,int i){
            int ans=n&(1<<i);
            if(ans==0){
                return false;
            }
            return true;
        }
    static int setKthBit(int N,int K){
        if(checkbit(N,K)==false){
            return N | (1<<K);
        }
        return N;
    }
}