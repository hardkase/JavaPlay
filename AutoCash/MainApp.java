/*Java Return Change app using products stored in arraylist. 
For some reason, copying objects from arraylist didn't work correctly*/


import java.util.Scanner;
import java.util.ArrayList;

public class MainApp
{
	public static void main(String[] args)
	{
		MainApp theApp = new MainApp();
		theApp.start();
	}
	public void start()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Patrick Collins' Auto Cashier");
		
		//Product cart = new Product();
		boolean appRun = true;
		
		while (appRun != false)
		{
			ArrayList<Product> pList = new ArrayList<Product>();
			pList = setUp();
			int index;
			int tempId;
			float tempPrice;
			String tempName="";
			System.out.println("The following products are available for purchase. \n"
				+ "For simplicity, only one Product can be purchased per session. \n");
			for (Product p: pList)
				p.print();
			Product prod = new Product();
			System.out.println("Please enter the product ID you wish to purchase. Select '0' to Quit Auto Cashier. \n");
			int userSelect = in.nextInt();
			if(userSelect == 0)
				index = 0;
			else
				index = userSelect -1;
			if(userSelect < 0 || userSelect > 5)
				System.out.println("WTF!? DumbAss! \n");
			if (userSelect == 0)
				appRun = false;
			else if(userSelect == 1)
			{
				Product temp = new Product();
				temp.clone(pList, 0);
				prod = temp;
				//Debug
				System.out.println(prod.getName());
			}
			else if(userSelect == 2)
			{
				prod.clone(pList, 1);
				//Debug
				System.out.println(prod.getName());
			}
			else if(userSelect == 3)
			{
				prod.clone(pList, 2);
				//Debug
				System.out.println(prod.getName());
			}
			else if(userSelect == 4)
			{
				prod.clone(pList, 3);
				//Debug
				System.out.println(prod.getName());
			}
			else if(userSelect == 5)
			{
				prod.clone(pList, 4);
				System.out.println(prod.getName());
			}
			else
				System.out.println("There's something wrong with your input - try again!");
			//DEBUG 
			prod.print();
		}
	}
	public ArrayList<Product> setUp()
	{
		ArrayList<Product> other = new ArrayList<Product>();
		other.add(new Product(1, "Film DVD", 13.15f));
		other.add(new Product(2, "Graphic Novel", 9.95f));
		other.add(new Product(3, "PC Game", 39.45f));
		other.add(new Product(4, "Pokemon Card Pack", 4.65f));
		other.add(new Product (5, "Japanese Robot Toy", 42.30f));
		return other;
	}
}
