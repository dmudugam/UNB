import java.util.Scanner;

/**
	This class WishList.
	@author Dineth Mithuranga and 3701155.
*/

public class WishList {
	/**
	 The items on the customer's wish list, sorted by sku.
	*/
	private Item[] list;

	/**
	 Constructs a new WishList given a sorted array of Items.
	 @param listIn The list of items.
	*/
	public WishList (Item[] listIn) {
		list = listIn;
	}
	
	/**
	 Constructs a new WishList by reading the number of items and then 
	 the sorted list of item information using a Scanner; input format 
	 consists of a line with the number of items, followed by a line for 
	 each item containing values separated by commas
	 @param scin The Scanner reading input.
	*/
	public WishList (Scanner scin) {
		int count = scin.nextInt();
		scin.nextLine(); //read newline following the first int
		list = new Item[count];
		for(int i=0; i < count; i++){
			String s = scin.nextLine();
			Scanner scline = new Scanner(s);
			scline.useDelimiter(",");
			long sku = scline.nextLong();
			String name = scline.next();
			int priority = scline.nextInt();
			list[i] = new Item(name, sku, priority);
		}
	}

	/**
	 Returns the number of items that appear in only one of the two
	 wish lists (this one and the other one that is passed in as a
	 parameter). 
	 @param other The other wish list.
	 @return The number of items that appear in only one of the two lists.
	*/
	public int findUnique (WishList other){
		int counter = 0;
		int unique = 0;
		
		for(int i = 0; i < other.list.length; i++){
			
			for(int j = 0; j < list.length; j++){
				
				if(other.list[i].getSKU() == list[j].getSKU()){
					counter++;
				}
			}
		}
		unique = (other.list.length + list.length) - (2*counter);
		return unique;
	}

	/**
	 Merges this wish list with another one (passed in as a parameter),
	 producing a new sorted wish list.
	 @param other The wish list to be merged with this wish list.
	 @return The merged wish list.
	*/ 
	public WishList merge (WishList other){
		
		int length = list.length + other.list.length;
		
			Item [] mergedArray = new Item [length];
			int pos1 = 0, pos2 = 0;
			for(int i = 0; i < mergedArray.length; i++){
				
		
				if(list[pos1].getSKU() < other.list[pos2].getSKU()){
					mergedArray[i] = list[pos1];
					pos1++;
					
				}
				else if(list[pos1].getSKU() > other.list[pos2].getSKU()){
					mergedArray[i] = other.list[pos2];
					pos2++;
			
				}
				else if(list[pos1].getSKU() == other.list[pos2].getSKU()){
					mergedArray[i] = other.list[pos2];
					i++;
					mergedArray[i] = list[pos1];
					pos1++;
					pos2++;
				
				}
				if(pos1 >= list.length || pos2 >= other.list.length){
					break;
				}
				
			}
			if(pos1 != list.length){
				for(int i = pos1; i < list.length; i++){
					
			
					mergedArray[i+pos2] = list[i];
					
				
					
				}
			}
				if(pos2 != other.list.length){
				for(int i = pos2; i < other.list.length; i++){
						
					mergedArray[i+pos1] = other.list[i];
					
						
					
					
				}
			}
			WishList marg = new WishList (mergedArray);
			return marg;
	}

	/**
	Updates the wish list by adding the item passed in as a parameter to 
	the wish list in the correct order if the item is not already in the list. 
	@param newItem The item to be added to this wish list.
	@return If item was added successfully or not.
	*/
	public boolean addItem (Item newItem){
		int i;
		boolean status = false;
		for(int j = 0; j < list.length; j++){
				
			if(newItem.getSKU() == list[j].getSKU()){
				return status;
			}
		}
				Item [] updateArray = new Item [list.length + 1];
				for(i = 0; i < list.length; i++){
				
					if(newItem.getSKU() > list[i].getSKU()){
						updateArray[i] = list[i];
						
					}
					else{
						break;
					}
				}
				
				updateArray[i] = newItem;
				for(int k = i+1; k < updateArray.length; k++){
					updateArray[k] = list[k-1]; 
				}
				list = updateArray;
				status = true;
				
			
		
		
		return status;
	}
	
	public String toString(){
		String s = "";
		for(int i=0; i < list.length; i++){
			s += list[i].getSKU() + "\t" + list[i].getName() + "\t" 
				+ list[i].getPriority() + "\n";
		}
		return s;
	}

}
