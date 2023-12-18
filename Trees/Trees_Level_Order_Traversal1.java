class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> ls=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(q.size() > 0){
            Node temp=q.remove();
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
            q.add(temp.right);
        }
        ls.add(temp.data);
    }
    return ls;
}
}