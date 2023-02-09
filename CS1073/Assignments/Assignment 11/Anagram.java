import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent; 
import java.util.Arrays;  

/** 
  This is class represent Anagram and check whether two words are anagrams.
  @author Dineth Mithuranga and 3701155
*/


public class Anagram extends Application
{
	private TextField word1;
	private TextField word2;
	private Label fieldLabel3;


	public void start (Stage primaryStage)
	{
		primaryStage.setTitle ("Anagram Tester");

		Label fieldLabel1 = new Label ("1st word:");
		word1 = new TextField ();
		word1.setPrefWidth (100);

		Label fieldLabel2 = new Label ("2nd word:");
		word2 = new TextField ();
		word2.setPrefWidth (100);


		Button anagram = new Button ("Are these anagrams?");
		anagram.setOnAction (this::isAnagram);

		fieldLabel3 = new Label ("Let's test some possible anagrams!");


		FlowPane pane = new FlowPane (fieldLabel1, word1, fieldLabel2, word2, anagram, fieldLabel3);
		
		pane.setAlignment(Pos.CENTER);
		pane.setHgap (80);
		pane.setVgap (20);

		Scene scene = new Scene (pane, 300, 300);

		primaryStage.setScene (scene);
		primaryStage.show();
	} //end start method

	public void isAnagram (ActionEvent event)
	{
		String wor1 = word1.getText();
		String wor2 = word2.getText();		

		String w1 = wor1.replaceAll("\\s", "");
		String w2 = wor2.replaceAll("\\s", "");
		boolean c = true;

		if(w1.length() != w2.length())
		{
			c = false;
		}
		else
		{
			char [] Arrw1 = w1.toLowerCase().toCharArray();
			char [] Arrw2 = w2.toLowerCase().toCharArray();

			int [] positions = new int [26];

			for(int i=0; i < Arrw1.length; i++)
			{
				positions[Arrw1[i] - 'a']++;
				positions[Arrw2[i] - 'a']--;	
 			}
			for(int position : positions)
			{
				if(position != 0)
				{
					c = false;
				}

			}
		}

		if(c)
		{
			fieldLabel3.setText(wor1 + " is an anagram of " + wor2);  
		}
		else
		{
			fieldLabel3.setText(wor1 + " is not an anagram of " + wor2);
		}
	}

} // end Anagram