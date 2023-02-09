import java.text.NumberFormat;
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
  This is the driver program for Restaurant Class, Server Class and Chef Class; its purpose is 
  to "try out" the RestaurantWorker, Server and Chef class.
  @author Dineth Mithuranga and 3701155
*/


public class TicketCalculator extends Application
{
	private TextField name;
	private TextField bags;
	private TextField drinks;
	private Label fieldLabel4;
	private Label fieldLabel5;

	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public void start (Stage primaryStage)
	{
		primaryStage.setTitle ("Ticket Calculator");

		Label fieldLabel1 = new Label ("Passenger Name:");
		name = new TextField ();
		name.setPrefWidth (100);

		Label fieldLabel2 = new Label ("Number of Checked Bags:");
		bags = new TextField ();
		bags.setPrefWidth (50);

		Label fieldLabel3 = new Label ("Number of In-flight Drinks:");
		drinks = new TextField ();
		drinks.setPrefWidth (50);

		Button economy = new Button ("Economy");
		economy.setOnAction (this::economyCalculate);

		Button firstclass = new Button ("First Class");
		firstclass.setOnAction (this::firstclassCalculate);


		Button resetButton = new Button ("Reset");
		resetButton.setOnAction (this::processReset);

		fieldLabel4 = new Label ("Welcome to Flights R Us!");


		fieldLabel5 = new Label ("Enter your ticket information.");

		FlowPane pane = new FlowPane (fieldLabel1, name, fieldLabel2, bags,fieldLabel3, drinks, economy, firstclass, resetButton, fieldLabel4, fieldLabel5);
		
		pane.setAlignment(Pos.CENTER);
		pane.setHgap (50);
		pane.setVgap (20);

		Scene scene = new Scene (pane, 300, 320);

		primaryStage.setScene (scene);
		primaryStage.show();
	} //end start method

	public void economyCalculate (ActionEvent event)
	{
		String name1 = name.getText();
		int bag = Integer.parseInt(bags.getText());
		int drink = Integer.parseInt(drinks.getText());
		EconomyTicket ticket = new EconomyTicket(name1, bag, drink);
		fieldLabel4.setText("Boarding Group Number: " + ticket.getBoardingNumber());
		fieldLabel5.setText("Total cost of flight: " + formatter.format(ticket.calculateTotal()));
	}
	public void firstclassCalculate (ActionEvent event)
	{
		String name2 = name.getText();
		int bag1 = Integer.parseInt(bags.getText());
		int drink1 = Integer.parseInt(drinks.getText());
		FirstClassTicket ticket1 = new FirstClassTicket(name2, bag1, drink1);
		fieldLabel4.setText("Boarding Group Number: " + ticket1.getBoardingNumber());
		fieldLabel5.setText("Total cost of flight: " + formatter.format(ticket1.calculateTotal()));	
	}
	public void processReset (ActionEvent event)
	{
		name.setText("");
		bags.setText("");
		drinks.setText("");

		fieldLabel4.setText("Welcome to Flights R Us!");
		fieldLabel5.setText("Enter your ticket information.");
	}
} // end TicketCalculator