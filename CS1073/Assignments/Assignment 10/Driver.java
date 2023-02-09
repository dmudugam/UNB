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

/** 
  This is the driver program for StringGenerator class; its purpose is 
  to "try out" the String Generator class.
  @author Dineth Mithuranga and 3701155
*/


public class Driver extends Application
{
	private TextField phrase;
	private Label fieldLabel1;
	private Label fieldLabel2;


	public void start (Stage primaryStage)
	{
		primaryStage.setTitle ("String Generator");

		Label fieldLabel1 = new Label ("Enter a title or phrase:");
		phrase = new TextField ();
		phrase.setPrefWidth (500);


		Button acronym = new Button ("Generate Acronym");
		acronym.setOnAction (this::generateAcronym);

		Button password = new Button ("Generate Password");
		password.setOnAction (this::generatePassword);


		Button resetButton = new Button ("Reset");
		resetButton.setOnAction (this::processReset);

		fieldLabel2 = new Label ("Let's create an acronym or password!");


		FlowPane pane = new FlowPane (fieldLabel1, phrase, acronym, password, resetButton, fieldLabel2);
		
		pane.setAlignment(Pos.CENTER);
		pane.setHgap (100);
		pane.setVgap (20);

		Scene scene = new Scene (pane, 510, 250);

		primaryStage.setScene (scene);
		primaryStage.show();
	} //end start method

	public void generateAcronym (ActionEvent event)
	{
		String phrases = phrase.getText();
		fieldLabel2.setText(StringGenerator.generateAcronym(phrases));
	}
	public void generatePassword (ActionEvent event)
	{
		String phrases = phrase.getText();
		fieldLabel2.setText(StringGenerator.generatePassword(phrases));
	
	}
	public void processReset (ActionEvent event)
	{
		phrase.setText("");

		fieldLabel2.setText("Let's create an acronym or password!");
	}
} // end Driver