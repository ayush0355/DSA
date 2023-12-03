class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> ls=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(node==null){
            return ls;
        }
        q.add(node);
        while(q.size() > 0){
            Node temp=q.remove();
            if(temp.right != null){
                q.add(temp.right);
            }
            if(temp.left != null){
                q.add(temp.left);
            }
            ls.add(temp.data);
        }
     Collections.reverse(ls);
       return ls;
    }
}