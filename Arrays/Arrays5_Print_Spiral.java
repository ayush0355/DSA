https://leetcode.com/problems/spiral-matrix/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int rowsteps=m-1;
        int colsteps=n-1;
        while(rowsteps>=1 && colsteps>=1){
            for(int k=0; k<rowsteps; k++){
                ans.add(matrix[i][j]);
                j++;
            }
            for(int k=0; k<colsteps; k++){
                ans.add(matrix[i][j]);
                i++;
            }
            for(int k=0; k<rowsteps; k++){
                ans.add(matrix[i][j]);
                j--;
            }
            for(int k=0; k<colsteps; k++){
                ans.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            rowsteps=rowsteps-2;
            colsteps=colsteps-2;
        }
            if(rowsteps==0){
                for(int k=0; k<colsteps+1; k++){
                    ans.add(matrix[i][j]);
                    i++;
                }
            }
            else if(colsteps==0){
                for(int k=0; k<rowsteps+1; k++){
                    ans.add(matrix[i][j]);
                    j++;
                }
            }
            return ans;
    }
}