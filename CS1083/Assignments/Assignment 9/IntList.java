/**
Defines a class that represents a list of integers
@author Dineth Mithuranga and 3701155
*/
public class IntList {

	/**
	First node in the list
	*/
	private IntNode front; 

	/**
	Constructs a list.  Initially the list is empty.
	*/
	public IntList() {
		front = null;
	}

	/**
	Adds given integer to front of list.
	@param val integer to add to the front of the list
	*/
	public void addToFront(int val) {
		front = new IntNode(val, front);
	}

	/**
	Removes the first node from the list.
	If the list is empty, does nothing.
	*/
	public void removeFirst() {
		if (front != null) {
			front = front.next;
		}
	}

	/**
	Prints the list elements from first to last.
	*/
	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}
	/**
	Retrieve the length of the list.
	@return length of the list.
	*/
	public int length() {
		IntNode current = front;
		int count = 0;
		
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	/**
	Add element to the end of the list.
	@param val Integer to add at the end of the list.
	*/
	public void addToEnd(int val) {
		IntNode addIntNode = new IntNode(val, null);
		
		if(front == null) {
			front = addIntNode;
		}
		else {
			IntNode current = front;
			
			while(current.next != null) {
				current = current.next;
			}
			current.next = addIntNode;
		}
	}
	
	/**
	Remove the last element of the list.
	*/
	public void removeLast() {
		if(front != null) {
			IntNode current = front;
			
			while(current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}
	
	/**
	Replace a specific value with a newa value.
	@param oldVal the value needed to be replaced.
	@param newVal the value to be replaced.
	*/
	public void replace(int oldVal, int newVal) {
		if(front != null) {
			IntNode current = front;
				
			while(current != null) {
					
				if(current.val == oldVal) {
					current.val = newVal;
				}
				current = current.next;
			}
		}
	}
	
	/**
	Help the method to print the list.
	@param head first element of the list.
	@return the list.
	*/
	public String printRecHelper(IntNode head) {
		IntNode current = head;
		if(current == null) {
			return "";
		}
		else {
			return current.val + " " + printRecHelper(current.next);
		}
	}
	
	/**
	Print out the list recursively.
	*/
	public void printRec() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		System.out.print(printRecHelper(front));
		System.out.println("\n-----------------------\n");
	}
	
	/**
	Help the method to print the list backwards.
	@param head first element of the list.
	@return the list backward.
	*/
	public String printRecBackwardsHelper(IntNode head) {
		IntNode current = head;
		if(current == null) {
			return "";
		}
		else {
			return printRecBackwardsHelper(current.next) + " " + current.val;
		}
	}
	
	/**
	Print out the list backwards recursively.
	*/
	public void printRecBackwards() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		System.out.print(printRecBackwardsHelper(front));
		System.out.println("\n-----------------------\n");
	}
	
	/**
	An inner class that represents a node in the integer list.
	The public variables are accessed by the IntList class.
	*/
	private class IntNode {
		
		/**
		Value stored in node.
		*/
		public int val; 
		
		/**
		Link to next node in list.
		*/
		public IntNode next; 
		
		/**
		Constructor; sets up the node given a value and IntNode reference
		@param val the value to store in the node
		@param next the link to the next node in the list
		*/
		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		}
	}
}

