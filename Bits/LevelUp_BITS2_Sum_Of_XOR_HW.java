https://www.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1?utm_source=gfg

class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        long ans=0;
        for(int i=31; i>=0; i--){
            long zcount=0;
            long ocount=0;
            for(long j:arr){
                if((long)((j)&(1<<i))!=0){
                    ocount++;
                }
                else{
                    zcount++;
                }
            }
            ans+=(((long)(1<<i))*(ocount*zcount));
        }
        return ans;
    }
    
    
}