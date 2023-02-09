/* 
 * @author Dineth Mudugamuwa Hewage
 */

package assn2.dmh;

import java.util.ArrayList;



public class Movie implements Comparable<Movie> {
	private final String name;
	private ArrayList <Double> rating;
	
	public Movie(String nameIn) {
		name = nameIn;
		rating = new ArrayList<Double>();
	}

	@Override
	public int compareTo(Movie o) {
		if(this.getAverageRating() - o.getAverageRating() < 0) {
			return 1;
		}
		else if(this.getAverageRating() - o.getAverageRating() > 0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public double getAverageRating() {
		double ratings = 0;
		if(rating.isEmpty()) {
			return 0;
		}
		else {
			for(int i = 0; i < rating.size(); i++) {
				ratings = ratings + rating.get(i);
			}
			
			return ratings/rating.size();
		}
	}
	public String getName() {
		return name;
	}
	public void addRating(double ratingIn) {
		if(ratingIn >= 0 && 5 >= ratingIn) {
			rating.add(ratingIn);
		}
	}
	public void clearRating() {
		rating.removeAll(rating);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movie))
			return false;
		Movie other = (Movie) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String movie;
		if(!rating.isEmpty()) {
			movie = name + ", Ave Rating: " + (String.format("%,.1f", getAverageRating()));
		}
		else {
			movie = name;
		}
		return movie;
	}
}
