public class List
{
	private Node head;
	
	public List()
	{
		head = null;
	}
	
	//Service Methods
	
	//print List
	
	public String toString()
	{
		String statement = "";
		
		Node current = head;
		
		while(current != null)
		{
			statement += current.data + "\n";
			current = current.next;
		}
		return statement;
	}
	
	//add nodes to end
	public boolean addEnd(int toAdd)
	{
		Node addNode = new Node(toAdd);
		boolean success = false;
		
		if(head == null)
		{
			head = addNode;
			success = true;
		}
		else
		{
			Node current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = addNode;
			success = true;
		}
		return success;
	}
	
	//check for Duplicates
	
	public boolean hasDuplicate()
	{		
			boolean found = false;
			Node current = head.next;
			Node temp = head;
			
			while(temp != null && !found)
			{
				current = temp.next;
				while(current != null && !found)
				{
					if(temp.data == current.data)
					{
						found = true;
					}
					else
					{
						current = current.next;
					}
				}
				temp = temp.next;
			}
			return found;
	}
	
	
	
	private class Node
	{
		public int data;
		public Node next;
		
		public Node(int dataIn)
		{
			data = dataIn;
			next = null;
		}
	}
}