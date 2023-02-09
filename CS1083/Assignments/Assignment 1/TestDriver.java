/** 
  This is the driver program for Product Class, Stock Class. its purpose is 
  to "try out" the Product, and Stock class.
  @author Dineth Mithuranga and 3701155
*/


public class TestDriver
{
	public static void main (String[] args) 
	{
		Product scissors = new Product("Scissors", 5.25, 20);
		Product pencil = new Product("Pencil", 0.25, 40);
		Product eraser = new Product("Eraser", 0.65, 30);
		Product pen = new Product("Pen", 0.65, 4);
		Product ball = new Product("Ball", 1.00, 0);
		Product shirt = new Product("Shirt", 12.99, 40);
		Product book = new Product("Book", 2.99, 35);

		Stock test = new Stock (5);

		System.out.println("***********************************ADD PRODUCTS*********************************");
		System.out.println("");

		test.addProduct(scissors);
		test.addProduct(pencil);
		test.addProduct(eraser);
		test.addProduct(pen);
		test.addProduct(ball);

		System.out.println(test.getProducts());

		System.out.println("*****************************ADD TOO MANY PRODUCTS*****************************");
		System.out.println("");

		test.addProduct(shirt);
		test.addProduct(book);

		System.out.println(test.getProducts());

		System.out.println("********************************REMOVE PRODUCT*********************************");
		System.out.println("");

		test.removeProduct(pencil);

		System.out.println(test.getProducts());

		System.out.println("******************************ADD ANOTHER PRODUCT******************************");
		System.out.println("");

		test.addProduct(book);

		System.out.println(test.getProducts());
	
		
		System.out.println("***********************REMOVE PRODUCT NOT IN THE LIST**************************");
		System.out.println("");

		test.removeProduct(shirt);

		System.out.println(test.getProducts());
		
		System.out.println("********************************SELL A PRODUCT*********************************");
		System.out.println("");

		test.sellProd(pen);

		System.out.println(test.getProducts());

		System.out.println("**********************SELL A PRODUCT THAT HAS NO STOCK*************************");
		System.out.println("");

		test.sellProd(ball);

		System.out.println(test.getProducts());

		System.out.println("*****************************ORDER PRODUCTS************************************");
		System.out.println("");

		test.OrderProducts();

		System.out.println(test.getProducts());
	}
} // end TestDriver