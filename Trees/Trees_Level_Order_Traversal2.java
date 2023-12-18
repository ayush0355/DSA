class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> ans=new ArrayList<>();
     if(root==null){
       return ans;
     }
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      while(q.size()>0){
           List<Integer> ls=new ArrayList<>();
          int n=q.size();
          for(int i=1; i<=n; i++){
          TreeNode temp=q.remove();
          if(temp.left != null){
              q.add(temp.left);
          }
          if(temp.right != null){
              q.add(temp.right);
          }
          ls.add(temp.val);
        }
          ans.add(ls);  
      }
      return ans;  
    }
}