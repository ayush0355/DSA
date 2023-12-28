https://leetcode.com/problems/rotting-oranges/description/




class Solution {
    class pair{
        int i,j,t;
        pair(int row,int col,int time){
            i=row;
            j=col;
            t=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        int count1=0;
        int count2=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    count1++;
                }
                else if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    count2++;
                }
            }
        }
        if(count1==0){
            return 0;
        }
        else if(count2==0){
            return -1;
        }
        int ans=-1;
        while(q.size()>0){
            pair remove=q.remove();
            int row=remove.i;
            int col=remove.j;
            int time=remove.t;
            ans=time;
            if(row+1<m && grid[row+1][col]==1){
                q.add(new pair(row+1,col,time+1));
                grid[row+1][col]=2;
            }
            if(row-1>=0 && grid[row-1][col]==1){
                q.add(new pair(row-1,col,time+1));
                grid[row-1][col]=2;
            }
            if(col+1<n && grid[row][col+1]==1){
                q.add(new pair(row,col+1,time+1));
                grid[row][col+1]=2;
            }
            if(col-1>=0 && grid[row][col-1]==1){
                q.add(new pair(row,col-1,time+1));
                grid[row][col-1]=2;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
}