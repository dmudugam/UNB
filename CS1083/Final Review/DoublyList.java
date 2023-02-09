public class DoublyList
{
	private Node end;
	private Node front;
	private int size;

	public DoublyList()
	{
		front = null;
		end = null;
		size = 0;
	}
	
	public String toString()
	{
		String result = "";
		Node current = front;
		
		while(current != null)
		{
			result += current.data + "\n";
			current = current.next;
		}
		return result;
	}
	
	public void add(int nodeIn)
	{
		Node addNode = new Node(nodeIn);
		
		if(size == 0)
		{
			front = addNode;
			end = addNode;
			front.prev = null;
			end.next = null;
		}
		else
		{
			Node current = front;
			while(current.next != null)
			{	
				current = current.next;
			}
			addNode.prev = current;
			addNode.next = current.next;
			current.next = addNode;
		}
		size++;
	}
	
	public void removePos(int index)
	{
		if(front == null) 
		{  
            return;  
        }  
        else 
		{  
            Node current = front;  
  
              int pos = index;  
  
            for(int i = 0; i < pos; i++)
			{  
                current = current.next;  
            }  
            if(current == front) 
			{  
                front = current.next;  
            }  
            else if(current == end) 
			{  
                end = end.prev;  
            } 			
            else 
			{  
                current.prev.next = current.next;  
                current.next.prev = current.prev;  
            }  
             current = null;  
        }  
	}
	
	private class Node 
	{
		public int data;
		public Node next;
		public Node prev;

		public Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
}