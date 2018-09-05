import java.util.ArrayList;

public class Product
{
	private String name;
	private int id;
	private float price;
	
	public Product()
	{
		
	}
	public Product(int id, String name, float price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getPrice()
	{
		return this.price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public void print()
	{
		System.out.println("Product ID:\t\t" + this.id);
		System.out.println("Product Name:\t\t" + this.name);
		System.out.println("Product Price:\t\t" + this.price+ " Euros");
	}
	public String toString()
	{
		String out = "Product ID: " + this.id 
			+ ", Product Name: " +this.name
				+ ", Product Price: " +this.price;
		return out;
	}
	public Product clone(ArrayList<Product> pList, int index)
	{
		Product temp = new Product();
		int tempId = pList.get(index).getId();
		String tempName = pList.get(index).getName();
		float tempPrice = pList.get(index).getPrice();
		temp.setId(tempId);
		temp.setName(tempName);
		temp.setPrice(tempPrice);
		return temp;
	}
}