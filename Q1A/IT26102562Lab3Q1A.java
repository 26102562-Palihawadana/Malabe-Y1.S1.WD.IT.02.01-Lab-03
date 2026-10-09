import java.util.Scanner;

public class IT26102562Lab3Q1A
{
	public static void main(String [] args)
	{
		double pricePerKilo,noOfKilos,totalPrice;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the Price Per Kilo: ");
		pricePerKilo = input.nextDouble();
		
		System.out.print("Enter the no of Kilos: ");
		noOfKilos = input.nextDouble();
		
		totalPrice = pricePerKilo * noOfKilos;
		
		System.out.print("Total Amount is "+ totalPrice);
	}
}