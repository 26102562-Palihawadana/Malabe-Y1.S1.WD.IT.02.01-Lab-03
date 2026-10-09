import java.util.Scanner;

public class IT26102562Lab3Q3
{
	public static void main(String [] args)
	{
		int count1,count2,count5,count10,count20,count50,count100,count200,count500,count1000,count5000;
		
		System.out.print("Enter the Rupee amount");
		
		Scanner input = new Scanner(System.in);
		
		int amount= input.nextInt();
		
		count5000 = amount / 5000;
		amount = amount % 5000;
		
		count1000 = amount /1000;
		amount = amount % 1000;
		
		count500 = amount / 500;
		amount = amount % 500;
		
		count200 = amount / 200;
		amount = amount % 200;
		
		count100= amount / 100;
		amount = amount % 100;
		
		count50 = amount / 50;
		amount = amount % 50;
		
		count20 = amount / 20;
		amount = amount % 20;
		
		count10 = amount / 10;
		amount = amount % 10;
		
		count5 = amount / 5;
		amount = amount % 5;
		
		count2 = amount / 2;
		amount = amount % 2;
		
		count1 = amount / 1;
		amount = amount % 1;
		
		System.out.println("5000 notes" + count5000 );
		System.out.println("1000 notes" + count1000);
		System.out.println("500 notes" + count500);
		System.out.println("200 notes" + count200);
		System.out.println("100 notes" + count100);
		System.out.println("50 notes" + count50);
		System.out.println("20 notes" + count20);
		System.out.println("10 notes" + count10);
		System.out.println("5 notes" + count5);
		System.out.println("2 notes" + count2);
		System.out.println("1 note" + count1);
	}
}