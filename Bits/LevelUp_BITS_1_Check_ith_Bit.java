https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1?utm_source=gfg



class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {   
        int ans=n&(1<<k);
        if(ans==0){
            return false;
        }
        return true;
    }
    
}