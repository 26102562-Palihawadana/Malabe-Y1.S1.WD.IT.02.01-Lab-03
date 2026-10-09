import java.util.Scanner;

public class IT26102562Lab3Q1B
{
	public static void main(String [] args)
	{
		double pricePerKilo,noOfKilos,totalPrice,discountedPrice;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the Price Per Kilo: ");
		pricePerKilo = input.nextDouble();
		
		System.out.print("Enter the no of Kilos: ");
		noOfKilos = input.nextDouble();
		
		totalPrice = pricePerKilo * noOfKilos;
		discountedPrice = totalPrice * 0.9;
		
		System.out.print("The total amount with 10% is " + discountedPrice);
	}
}