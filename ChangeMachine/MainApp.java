/* Return change App in Java V2. User inputs price and payment, change is given,
uses similar algorithm to Roman; Functions, but sometimes misses final 5 cent cash back...*/
import java.util.Scanner;
public class MainApp
{
	public static void main(String[] args)
	{
		MainApp theApp = new MainApp();
		theApp.start();
	}
	public void start()
	{
		boolean appRun = true;
		while (appRun)
		{
			String cashback = "";
			int euros = 0;
			int twoHundred = 0; 
			int oneHundred = 0;
			int fifty = 0;
			int twenty = 0;
			int ten = 0;
			int five = 0;
			int two = 0;
			int one = 0;
			int fiftyCent = 0;
			int twentyCent = 0;
			int tenCent = 0;
			int fiveCent = 0;
			float cents1 = 0.0f;
			int cents = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("Welcome to the change machine. \n");
			System.out.println("Please enter the purchase price of Widget X, not to exceed 500 Euro. \n"
				+"Price in cents should end in .05 - We don't deal in small copper coins. \n"
					+ "Examples: '32.95', '14.00', 103.05 \n"
						+"Enter '0' to Quit.");
			System.out.println("Purchase Price: \n");
			float price = in.nextFloat();
			if(price == 0)
				appRun = false;
			System.out.println("You entered: " +price);
			System.out.println("Please enter payment in Euro bills or whole denomination coins \n"
				+ "Change machine can only take a single bill or coin in payment \n"
					+ "Example: 500, 200, 100, 50, 20, 10, 5, 2 , 1"
						+"Enter '0' to Quit");
			System.out.println("Enter Payment Amount: \n");
			int bills = in.nextInt();
			if(bills == 0)
				appRun = false;
			/*if ((bills != 500) || (bills != 200) || (bills != 100) || (bills != 50) || (bills != 20) || (bills != 10) || (bills != 5) || (bills != 2)|| (bills  != 1))
			{
				System.out.println("You have input an incorrect amount, try again!");
			}*/
			float pay = bills;
			float change = pay - price;
			if (change < 0)
				System.out.println("You haven't input enough money! Try again.");
			else
				euros = (int) change;
				cents1 = (change % euros) *100;
				cents = (int) cents1;
			while (euros >= 200)
			{
				twoHundred++;
				euros -= 200;
			}
			if (twoHundred > 0)
				cashback = cashback +twoHundred+ " Two Hundred Euro note \n";
			while (euros >= 100)
			{
				oneHundred++;
				euros -= 100;
			}
			if (oneHundred > 0)
				cashback = cashback +oneHundred+ " One Hundred Euro note \n";
			while (euros >= 50)
			{
				fifty++;
				euros -= 50;
			}
			if (fifty > 0)
				cashback = cashback +fifty+ " Fifty Euro note \n";
			while (euros >= 20)
			{
				twenty++;
				euros -= 20;
			}
			if (twenty > 0)
				cashback = cashback +twenty+ " Twenty Euro note \n";
			while (euros >= 10)
			{
				ten++;
				euros -= 10;
			}
			if (ten > 0)
				cashback = cashback +ten+ " Ten Euro note \n";
			while (euros >= 5)
			{
				five++;
				euros -= 5;
			}
			if (five > 0)
				cashback = cashback +five+ " Five Euro note \n";
			while (euros >= 2)
			{
				two++;
				euros -= 2;
			}
			if (two > 0)
				cashback = cashback +two+ " Two Euro coin \n";
			while (euros >= 1)
			{
				one++;
				euros -= 1;
			}
			if (one > 0)
				cashback = cashback +one+ " One Euro coin \n";
			while (cents >= 50)
			{
				fiftyCent++;
				cents -= 50;
			}
			if (fiftyCent > 0)
				cashback = cashback +fiftyCent+ " Fifty Cent Coin \n";
			while (cents >= 20)
			{
				twentyCent++;
				cents -= 20;
			}
			if (twentyCent > 0)
				cashback = cashback +twentyCent+ " Twenty Cent Coin \n";
			while (cents >= 10)
			{
				tenCent++;
				cents -= 10;
			}
			if (tenCent > 0)
				cashback = cashback +tenCent+ " Ten Cent Coin \n";
			while (cents >= 5)
			{
				fiveCent++;
				cents -= 5;
			}
			if (fiveCent > 0)
				cashback = cashback +fiveCent+ " Five Cent Coin \n";
			//if (euros == 0 && cents == 0.0f)
			System.out.println("Here is your change: \n" + cashback);
		}
	}	
}