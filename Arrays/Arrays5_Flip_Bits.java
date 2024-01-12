https://www.geeksforgeeks.org/problems/flip-bits0240/1


class Solution {

    public static int maxOnes(int a[], int n) {
        int osum=Integer.MIN_VALUE;
        int count=0;
        int csum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0){a[i]=1;}
            else{a[i]=-1;
                count++;}
        }
        for(int i=0; i<a.length; i++){
            if(csum>=0){csum+=a[i];}
            else{csum=a[i];}
            osum=Math.max(osum,csum);    
        }
        if(osum>=0){return osum+count;}
        return count;
        
    }
}