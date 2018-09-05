import java.util.Scanner;
import java.text.DecimalFormat;
public class MainApp
{
	public static void main(String[] args)
	{
		MainApp app = new MainApp();
		app.start();
	}
	public void start()
	{
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
		int counter = 0;
		double price = 0.0f;
		int pay = 0;
		String strPrice = "";
		String workingPrice = "";
		String strPay = "";
		String workingPay = "";
		String cashback ="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a price (double) and a payment (int), separated by a comma. \n"
			+ "Price needs to be a standard decimal number with decimal digits to two places; \n"
				+ " The last digit needs to be 5 or 0 (we don't deal with small copper change)."
					+" Payment needs to exceed price and be a whole number; You're paying in Euro notes/coins, not cents."
						+ "Example: '127.55, 200' or '37.85, 50'"
							+ "Enter price and payment now: ");
		String input = in.nextLine();
		for (String s: input.split(",", 2))
		{
			if (counter == 0)
			{
				strPrice = s;
				counter ++;
			}
			else 
				strPay = s;
		}
		workingPrice = strPrice.replaceAll("[^0-9.]", "");
		workingPay = strPay.replaceAll("[^0-9]","");
		double wPrice = Double.parseDouble(workingPrice);
		price = Math.round(wPrice*100.0)/100.0;
		pay = Integer.parseInt(workingPay);
		//Debug
		System.out.println("Entered Price rounded: " + price);
		//Debug
		System.out.println("Entered Cash: " +pay);
		double wPay = (double) pay;
		double wPay1 = Math.round(wPay*100.0)/100.0;
		//Debug
		System.out.println("Working Pay - pay cast to double and rounded to 2 decimal points: " + wPay);
		double change = wPay - price;
		//Debug
		System.out.println("Change: Double pay - double price: " + change);
		int euros = (int) change;
		//Debug
		System.out.println("Change amount in euros (int): " + euros);
		double workingEuros = (double) euros;
		System.out.println("Let's try this: " + workingEuros);
		double workingCents = change - workingEuros;
		workingCents = Math.round(workingCents*100.0)/100.0;
		System.out.println("Rounded change in cents: " + workingCents);
		double wCents = workingCents * 100;
		System.out.println("working cents = change - euro amount cast to double to give cent value, *100 to make whole #: " + wCents);
		int cents = (int) wCents;
		//Debug
		System.out.println("Cast working cents to Int: " + cents);
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