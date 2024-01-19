https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1?utm_source=gfg



class Solution
{
    public int gcd(int A , int B) 
    { 
        if(A==0){
            return B;
        }
        int temp=gcd(B%A,A);
        return temp;
    } 
}