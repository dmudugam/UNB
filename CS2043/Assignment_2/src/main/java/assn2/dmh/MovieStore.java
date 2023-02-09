package assn2.dmh;

import java.util.ArrayList;
/* 
 * @author Dineth Mudugamuwa Hewage
 */

import java.util.Collections;

public class MovieStore {
	private ArrayList <Movie> inventory;
	
	public MovieStore() {
		inventory = new ArrayList<Movie>();
	}
	public void addMovie(Movie movieIn) {
		if(inventory.size() < 1) {
			inventory.add(movieIn);
		}
		else {
			boolean duplicate = false;
			for(int i = 0; i < inventory.size() && !duplicate; i++) {
				if((inventory.get(i).equals(movieIn))) {
					duplicate = true;
				}
			}
			if(!duplicate) {
				inventory.add(movieIn);
			}
		}
		
	}
	public ArrayList<Movie> allMovies() {
		ArrayList<Movie> inventoryCopy = new ArrayList<Movie>();
		
		for(Movie movieCopy: inventory) {
			inventoryCopy.add(movieCopy);
		}
		return inventoryCopy;
	}
	public ArrayList<Movie> topRated(int topN) {
		ArrayList<Movie> sorted = new ArrayList<Movie>();
		ArrayList<Movie> sortedN = new ArrayList<Movie>();
		sorted = allMovies();
		Collections.sort(sorted);
		if(topN > sorted.size()) {
			return sorted;
		}
		else {
			for(int i = 0; i < topN; i++) {
				sortedN.add(sorted.get(i));
			}
			return sortedN;
		}
	}
}
