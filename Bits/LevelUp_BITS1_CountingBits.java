https://www.geeksforgeeks.org/problems/set-bits0143/1?utm_source=gfg

class Solution {
    static int setBits(int N) {
       int count=0;
       for(int i=0; i<32; i++){
           if((int)(N&(1<<i))!=0){
               count++;
           }
       }
       return count;
    }
}