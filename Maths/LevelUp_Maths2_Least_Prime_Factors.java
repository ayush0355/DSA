https://www.geeksforgeeks.org/problems/least-prime-factor5216/1?utm_source=gfg




class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        int spf[]=new int[n+1];
        for(int i=0; i<=n; i++){
            spf[i]=i;
        }
        for(int i=2; i*i<=n; i++){
            if(spf[i]==i){
                
                for(int j=i*i; j<=n; j+=i){
                    spf[j]=Math.min(spf[j],i);
                }
            }
        }
        return spf;
    }    
}