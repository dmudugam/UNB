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


public class Calculator extends Application
{
	private TextField unitPrice;
	private TextField qauntity;
	private Text total;
	private Label fieldLabel3;
	private Label fieldLabel4;
	private Label fieldLabel5;
	private Label fieldLabel6;
	private double total1;
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public void start (Stage primaryStage) 
	{

		

		primaryStage.setTitle ("Purchase Calculator");

		Label fieldLabel1 = new Label ("Unit Price:");
		unitPrice = new TextField ();
		unitPrice.setPrefWidth (50);

		Label fieldLabel2 = new Label ("Qauntity:");
		qauntity = new TextField ();
		qauntity.setPrefWidth (50);

		Button calculateButton = new Button ("Calculate");
		calculateButton.setOnAction (this::processCalculate);


		Button clearButton = new Button ("Clear");
		clearButton.setOnAction (this::processClear);

		fieldLabel3 = new Label ("Enter the purchase information.");

		fieldLabel4 = new Label ("Subtotal for this Item:");

		fieldLabel5 = new Label ("NB Sales Tax for this Item");

		fieldLabel6 = new Label ("Total for this Item:");

		total = new Text ("Order Total (All Items):");

		FlowPane pane = new FlowPane (fieldLabel1, unitPrice, fieldLabel2, qauntity, calculateButton, clearButton, fieldLabel3, fieldLabel4, fieldLabel5, fieldLabel6, total);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap (90);
		pane.setVgap (20);

		Scene scene = new Scene (pane, 300, 320);

		primaryStage.setScene (scene);
		primaryStage.show();

	} //end start method

	public void processCalculate (ActionEvent event)
	{
		double itemprice = Double.parseDouble(unitPrice.getText());
		double qaunt = Double.parseDouble(qauntity.getText());
		
		
		double subtotal = itemprice *qaunt;
		double tax = subtotal * 0.15;
		double subtotalitem = subtotal + tax;
		total1 = total1 + subtotalitem;
		

		fieldLabel3.setText("Purchase Cost Breakdown");
		fieldLabel4.setText("Subtotal for this Item: " + formatter.format(subtotal));
		fieldLabel5.setText("NB Sales Tax for this Item: " + formatter.format(tax));
		fieldLabel6.setText("Total for this Item: " + formatter.format(subtotalitem));
		total.setText("Order Total (All Items): " + formatter.format(total1));
	}

	public void processClear (ActionEvent event)
	{
		unitPrice.setText("");
		qauntity.setText("");
		fieldLabel3.setText("Enter the purchase information.");
		fieldLabel4.setText("Subtotal for this Item:");
		fieldLabel5.setText("NB Sales Tax for this Item:");
		fieldLabel6.setText("Total for this Item:");
		total.setText("Order Total (All Items):");
		total1 = 0;
	}
} // end Calculator