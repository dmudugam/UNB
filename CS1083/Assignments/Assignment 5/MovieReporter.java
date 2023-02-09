import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

/**
* Creates a report on movies.

	This class is to try out the Movie, Genre, and GenreSet classes.
	@author Dineth Mithuranga and 3701155.

*/
public class MovieReporter
{
	public static void main(String[] args)
	{
		//create a set to organize Genres
		GenreSet genres = new GenreSet();
		int i = 0;
		int j = 2;
		
		
		File myFile = new File("genrerating.txt");
		File error = new File("errorLog.txt");
		
		try
		{
			
			PrintWriter pw = new PrintWriter(error);
			Scanner scan = new Scanner(myFile);
			scan.nextLine();
			while(scan.hasNext())
			{
				try
				{
					
					String line = scan.nextLine();
					Scanner s = new Scanner(line);
					s.useDelimiter("~");
					String gen = s.next();
					double points = s.nextDouble();
					int ratings = s.nextInt();
					String title = s.next();
					Movie mov = new Movie(title, points, ratings);
					Genre genr = new Genre (gen);
					try
					{
						genres.addGenre(genr);
						
					}
					catch(DuplicateGenreException e)
					{
						i = genres.genreIndex(genr);
						genr = genres.get(i);
						
					}
					try
					{
						genr.addMovie(mov);
					}
					catch(DuplicateMovieException e)
					{
						pw.println(e.getMessage());
					}	
				}
				
				
				catch(InputMismatchException w)
				{
					pw.println("problem reading line: " + j);
				}
				j++;
			}
			scan.close();
			pw.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		genres.sort();
		System.out.println("TOP MOVIE GENRES");
		System.out.println("=======================");
		int y = 1;
		for(int p = 9; p >= 0; p--)
		{
			System.out.println(y + ". " + genres.get(p).toString());
			y++;
		}
		
	}
}