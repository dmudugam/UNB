/* 
 * @author Dineth Mudugamuwa Hewage
 */

package assn2.dmh;


public class MovieStoreDriver {

	public static void main(String[] args) {
		
		MovieStore movieStore = new MovieStore();
		
		Movie starWars = new Movie("Star Wars");
		
		movieStore.addMovie(starWars);
		
		starWars.addRating(4);
		starWars.addRating(4);
		starWars.addRating(5);
		
		Movie starTrek = new Movie("Star Trek");
		movieStore.addMovie(starTrek);
		starTrek.addRating(2);
		
		movieStore.addMovie(new Movie("A Few Good Men"));
		
		Movie endersGame = new Movie("Enders Game");
		endersGame.addRating(5);
		movieStore.addMovie(endersGame);
		
		movieStore.addMovie(new Movie("Star Trek"));
		
	 
		System.out.println("All Movies - " + movieStore.allMovies().size() + " in total");
		for(Movie Movies : movieStore.allMovies()) {
			System.out.println(Movies);
		}
		
		System.out.println("");
		
		System.out.println("Top " + movieStore.topRated(2).size() + " Movies");
		for(Movie Movies : movieStore.topRated(2)) {
			System.out.println(Movies);
		}
	}

}
