class Tree
{
	public static int getSize(Node root)
	{
    if(root==null){
        return 0;
    }    
	
	int x=getSize(root.left);
	int y=getSize(root.right);
	return x+y+1;
	}
}