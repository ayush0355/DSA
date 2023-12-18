class Solution {
   
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> ls=new ArrayList<>(); 
    helper(root,ls);
        return ls;
}
public void helper(TreeNode root, List<Integer> ls){
if(root==null){ return;}
ls.add(root.val);
helper(root.left,ls);
helper(root.right,ls);
}
}