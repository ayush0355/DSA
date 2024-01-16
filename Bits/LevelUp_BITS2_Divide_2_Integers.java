https://leetcode.com/problems/divide-two-integers/


class Solution {
    public int divide(int dividend, int divisor) {
       
        long a=dividend;
        long b=divisor;
        int sign=1;
        if(dividend<0){sign=sign*-1;}
        if(divisor<0){sign=sign*-1;}
        a=Math.abs(a);
        b=Math.abs(b);
        long num=0;
        long temp=0;
        for(int i=31; i>=0; i--){
            if(temp+(b<<i)<=a){
                num+=((long)1<<i);
                temp+=(b<<i);
            }
        }
        if(sign<0){
            num= -num;
        }
        if(num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        else {return (int)num;
    }
    }
}