
public class Tree {
	
	public Node root;
	public int size;
	
    public Tree(Node root) {
    	this.root = root;
    	this.size = 0;
    }
    
    public Node getRoot() {
    	return this.root;
    }
    
    public void setRoot(Node root) {
    	this.root = root;
    	return;
    }
    
    public int getSize() {
    	return this.size;
    }
    	
    public void add(Node root, Node newNode)
    {	
    	if(newNode.count > root.count)
    	{
    		if(root.right() == null)
    		{
    			if(root.left() == null)
    			{
    			//	incHeight(root);
    			}
    			else
    			{
    			//	root.incHeight();
    			}
    			
    			root.setRight(newNode);
    			newNode.setParent(root);
    			this.size++;
    			return;
    		}
    		else
    		{
    			add(root.right(), newNode);
    		}
    	}
    	else
    	{
    		if(root.left() == null)
    		{
    			if(root.right() == null)
    			{
    			//	decHeight(root);
    			}
    			else
    			{
    			//	root.decHeight();
    			}
    			
    			root.setLeft(newNode);
    			newNode.setParent(root);
    			this.size++;
    			return;
    		}
    		else
    		{
    			add(root.left(), newNode);
    		}
    	}
    }
    
    public static void incHeight(Node n)
	{
		n.incHeight();
		
		if(n.parent() != null)
		{
			if(n.parent().left() == n)
			{
				decHeight(n.parent());
			}
			else
			{
				incHeight(n.parent());	
			}	
		}
	}
	
	public static void decHeight(Node n)
	{
		n.decHeight();
		
		if(n.parent() != null)
		{
			if(n.parent().left() == n)
			{
				incHeight(n.parent());
			}
			else
			{
				decHeight(n.parent());	
			}	
		}
		
	}
}
