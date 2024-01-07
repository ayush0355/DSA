https://leetcode.com/problems/maximize-distance-to-closest-person/description/


class Solution {
    public int maxDistToClosest(int[] seats) {
        int i=-1;
        int dist=Integer.MIN_VALUE;
        for(int j=0; j<seats.length; j++){
            if(seats[j]==1){
                if(i== -1){
                    dist=Math.max(dist,j);
                    i=j;
                }
                else{
                    dist=Math.max(dist,(j-i)/2);
                    i=j;
                }
            }
        }
        dist=Math.max(dist,seats.length-1-i);
        return dist;
    }
}