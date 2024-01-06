https://leetcode.com/problems/range-sum-query-2d-immutable/


class NumMatrix {
int psum[][];
    public NumMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        psum=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(j==0){
                    psum[i][j]=matrix[i][j];
                }
                else{
                    psum[i][j]=matrix[i][j]+psum[i][j-1];
                }
            }
        }
        for(int j=0; j<col; j++){
            for(int i=1; i<row; i++){
                psum[i][j]=psum[i-1][j]+psum[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
            int ans=0;
                ans+=psum[row2][col2];
            if(row1>0){
                ans-=psum[row1-1][col2];
            }
            if(col1>0){
                ans-=psum[row2][col1-1];
            }
            if(row1>0 && col1>0){
                ans+=psum[row1-1][col1-1];
            }
            return ans;
    }
}

