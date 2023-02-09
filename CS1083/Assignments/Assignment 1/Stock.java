import java.text.NumberFormat; 

/**
	This class represents Stock of inventory system.
	@author Dineth Mithuranga and 3701155.
*/

public class Stock
{

 	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	/**
	Products
	*/

	private Product[] prod;

	/**
	Array Size
	*/

	private int arraysize;

	/**
	Companion variable
	*/

	private int count;

	/**
	This method constructs a Stock with specified array size. 
	@param arraysizeIn.
	*/

	public Stock (int arraysizeIn)
	{
		arraysize = arraysizeIn;
		prod = new Product[arraysize];
		count = 0;
	}

	/**
	This method is called to retrieve whether product has been added to the stock.
	@return status.
	@param add.
	*/

	public boolean addProduct(Product add)
	{
		boolean status = true;

		if(count == arraysize)
		{
			status = false;
		}

		for(int i = 0; i < count; i++)
		{
			if(prod[i].getUid() == add.getUid())
			{
				status = false;
			}
		}
		if(status)
		{
			prod[count] = add;
			count++;
		}

		return status;
	}

	/**
	This method is called to retrieve whether product has been sold.
	@return status.
	@param sell.
	*/

	public boolean sellProd(Product sell)
	{
		boolean status = false;

			if(sell.sellProduct())
			{
				status = true;
			}

		return status;
	}

	/**
	This method is called to retrieve whether product has been removed.
	@return status.
	@param remove.
	*/

	public boolean removeProduct(Product remove)
	{
		boolean status = false;

		for(int i = 0; i < count; i++)
		{
			if(prod[i].getUid() == remove.getUid())
			{
				prod[i] = prod[count-1];
				status = true;
				count--;
			}
		}

		return status;
	}

	/**
	This method is called to retrieve the list of the products.
	@return products.
	*/

	public String getProducts()
	{
		String products = "\n";
		double total = 0;
		for(int i = 0; i < count; i++)
		{

			total += prod[i].getTotalValue();
			products += 
			
			prod[i].getPname() + " \t (id:" + prod[i].getUid() + ")" +
			"\t" + "qty: " + prod[i].getAvailable_qauntity() + " " + 
			prod[i].getOrdered_qauntity() + " ordered\t\t" + 
			formatter.format(prod[i].getPrice()) + "\t" + formatter.format(prod[i].getTotalValue()) +
			"\n\n";
		}
		products += "Total\t\t\t\t\t\t\t\t" + formatter.format(total);
		return products;
	}

	/**
	This method is called to retrieve the total value of products in the stock.
	@return total.
	*/

	public double getTotal()
	{
		double total = 0;

		for(int i = 0; i < count; i++)
		{
			total = total + prod[i].getPrice();
		}

		return total;
	}

	/**
	This method is called to retrieve the availale qauntity and order more items.
	*/

	public void OrderProducts()
	{
		for(int i = 0; i < count; i++)
		{
			if(prod[i].getAvailable_qauntity() < 5)
			{
				prod[i].setOrdered_qauntity(10);
			}
		}
	}
}