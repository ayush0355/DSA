https://leetcode.com/problems/rotate-image/



class Solution {
   public void transpose(int arr[][]){
       if(arr.length==1){
           return;
       }
       for(int i=1; i<arr.length; i++){
           for(int j=0; j<i; j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       }
   }
    public void rotate(int[][] arr) {
        transpose(arr);
        for(int i=0; i<arr.length; i++){
            int st=0;
            int e=arr.length-1;
            while(st<=e){
                int temp=arr[i][st];
                arr[i][st]=arr[i][e];
                arr[i][e]=temp;
                st++;
                e--;
            }
        }

    }
}