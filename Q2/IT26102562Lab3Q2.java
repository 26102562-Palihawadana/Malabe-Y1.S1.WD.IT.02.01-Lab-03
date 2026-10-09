import java.util.Scanner;

public class IT26102562Lab3Q2
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		double monthlySalary,noOfOTHrs,OTHrlyRate,OTAmount,TotalSalary;
		
		System.out.print("Enter the Monthly Salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the no of Hrs: ");
		noOfOTHrs = input.nextDouble();
		
		System.out.print("Enter the hourly rate: ");
		OTHrlyRate = input.nextDouble();
		
		OTAmount = noOfOTHrs*OTHrlyRate;
		TotalSalary = monthlySalary+OTAmount;
		
		System.out.print("The total salary including OT is "+ TotalSalary);
	}
}
