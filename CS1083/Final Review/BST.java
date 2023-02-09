public class BST
{
	private Node root;
	
	public BST()
	{
		root = null;
	}
	
	public void insert(int input)
	{
		Node nodeIn = new Node(input);
		
		if(root == null)
		{
			root = nodeIn;
		}
		else
		{
				insertR(nodeIn, root);
		}
	}
	
	public void insertR(Node nodeIn, Node curr)
	{
		if(nodeIn.data < curr.data)
		{
			if(curr.left == null)
			{
				curr.left = nodeIn;
			}
			else
			{
				insertR(nodeIn, curr.left);
			}
		}
		else if(nodeIn.data > curr.data)
		{
			if(curr.right == null)
			{
				curr.right = nodeIn;
			}
			else
			{
				insertR(nodeIn, curr.right);
			}
		}
		else
		{
			System.out.println("Data " + nodeIn.data + " already in the tree");
		}
	}
	
	public int mystery()
	{
		int num = 0;
		if(root != null)
		{
			num = mysteryRec(root);
		}
		return num;
	}
	public int mysteryRec(Node current)
	{
		int number = 0;
		if(current.left != null)
		{
			number = 1 + mysteryRec(current.left);
		}
		if(current.right != null)
		{
			System.out.println(current.right.data);
		}
		return number;
	}
	
	public void printInOrder()
	{
		if(root != null)
		{
			printIO(root);
		}
	}
	
	private void printIO(Node curr)
	{
		if(curr.left != null)
		{
			printIO(curr.left);
		}
		System.out.println(curr.data);
		if(curr.right != null)
		{
			printIO(curr.right);
		}
	}
	
	public boolean findStart(int s)
	{
		if(root != null)
		{
			return root.find(s);
		}
		else
		{
			return false;
		}
	}
	
	private class Node
	{
		public int data;
		public Node left;
		public Node right;
		
		public Node(int s)
		{
			this.data = s;
			left = null;
			right = null;
		}
		
		public boolean find(int s)
		{
			if(this.data == s)
			{
				return true;
			}
			if(this.data > s)
			{
				if(this.left != null)
				{
					return left.find(s);
				}
				else
				{
					return false;
				}
			}
			else
			{
				if(this.right != null)
				{
					return right.find(s);
				}
				else
				{
					return false;
				}
			}
		}
	}
}