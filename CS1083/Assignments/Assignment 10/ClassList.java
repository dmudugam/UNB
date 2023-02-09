import java.util.NoSuchElementException;

/**
Represents a ClassList.
@author Dineth Mithuranga and 3701155
*/

public class ClassList
{
	/**
	Last node in the list
	*/
	private StudentNode end;
	
	/**
	First node in the list
	*/
	private StudentNode front;
	
	/**
	Number of Nodes in the list
	*/
	private int size;
	
	/**
	Constructs a list.  Initially the list is empty.
	*/
	public ClassList()
	{
		front = null;
		end = null;
		size = 0;
	}
	
	/**
	Retrieve the size of the list.
	@return size of the list.
	*/
	public int getNumStudents()
	{
		return size;
	}
	
	/**
	Add element to a sorted list after comparing.
	@param studentIn Student to add to the sorted list.
	*/
	public void add(Student studentIn)
	{
		StudentNode addStudent = new StudentNode(studentIn);
		
		if(size == 0)
		{
			front = addStudent;
			end = addStudent;
			front.prev = null;
			end.next = null;
		}
		else
		{
				StudentNode current = front, temp = null;
				boolean found = true;
				while(current != null && found)
				{	
					int i = current.data.compareTo(addStudent.data);
					if(i < 0)
					{
						if(current == end)
						{
							addStudent.prev = current;
							current.next = addStudent;
							end = addStudent;
							found = false;
						}
						else
						{
							current = current.next;
						}
						
					}
					else if(i > 0)
					{
						if(current == front)
						{
							addStudent.next = current;
							current.prev = addStudent;
							front = addStudent;
							found = false;
						}
						else
						{
							addStudent.next = current;
							current.prev.next = addStudent;
							addStudent.prev = current.prev;
							current.prev = addStudent;
							found = false; 
						}
					}
					else
					{
						current = current.next;
					}
				}
		}
		size++;
	}
	
	/**
	Prints all the information about the student list.
	@return The all the student's information.
	*/
	public String toString()
	{
		String result = "";
		StudentNode current = front;
		
		while(current != null)
		{
			result += current.data + "\n";
			current = current.next;
		}
		return result;
	}
	
	/**
	Copy the list and array in reverse.
	@return the list in reverse.
	*/
	public Student[] getReversedList()
	{
		Student[] array = new Student[size];
		StudentNode current = end;
		int i = 0;
		while(i < size)
		{
			array[i] = current.data;
			current = current.prev;
			i++;
		}
		return array;
	}
	
	/**
	Remove a student from the list.
	@param studentOut The student need to be removed.
	*/
	public void remove(Student studentOut) throws NoSuchElementException
	{
		StudentNode current = front;
		boolean done = true;
		if(front == null)
		{
			throw new NoSuchElementException();
		}
		else if(front.data.compareTo(studentOut) == 0)
		{
			front = front.next;
		}
		else if(end.data.compareTo(studentOut) == 0)
		{
			end = end.prev;
			end.next = null;
		}
		else
		{
			while(current != null && done)
			{
				if(current.data.compareTo(studentOut) == 0)
				{
					current.prev.next = current.next;
					current.next.prev = current.prev;
					done = false;
				}
				else
				{
					current = current.next;
				}
			}
			if(done)
			{
				throw new NoSuchElementException();
			}
		}
		size--;
	}
	
	/**
	An inner class that represents a node in the classlist.
	The public variables are accessed by the ClassList class.
	*/
	private class StudentNode
	{
		/**
		data stored in node.
		*/
		public Student data;
		
		/**
		Link to next node and previous node in list.
		*/
		public StudentNode next, prev;
		
		/**
		Constructor; sets up the node given a student and ClassList reference
		@param dataIn the student to store in the node
		*/
		public StudentNode(Student dataIn)
		{
			data = dataIn;
			next = null;
			prev = null;
		}
	}
}