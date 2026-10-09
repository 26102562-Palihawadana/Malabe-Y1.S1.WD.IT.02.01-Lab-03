import java.util.Scanner;

public class IT26102562Lab3Q4
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a fivit digit number: ");
		
		int num = input.nextInt();
		
		int digit1 = num / 10000;
		num = num % 10000;
		
		int digit2 = num / 1000;
		num = num % 1000;
		
		int digit3 = num / 100;
		num = num % 100;
		
		int digit4 = num / 10;
		num = num % 10;
		
		System.out.print(digit1 + " ");
		System.out.print(digit2 + " ");
		System.out.print(digit3 + " ");
		System.out.print(digit4 + " ");
		System.out.print(num + " ");
		
	}
}