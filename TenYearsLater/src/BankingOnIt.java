/*
 * Stephen Buckley
 * 9/30/09
 * Bank Balance and Interest, Programming Project #10 in 5th Edition
 */

import java.util.Scanner;


public class BankingOnIt {
	public static final int YEARS = 10;
	public static void main(String[] args){
		String answer;
		do
		{
		System.out.println("Enter your bank account's current balance in dollars. (Don't be embarrassed– it's a recession for all of us.)");
		Scanner keyboard = new Scanner(System.in);
		
		double balance = keyboard.nextDouble();
		int i =0;
		
		System.out.println("Now enter the present interest rate of interest for that bank account. If it is 5%, enter 5, 10%, 10 and so forth.");
		double interest = keyboard.nextDouble();
		
		System.out.println("How is your interest compounded?  Annually, Monthly, or Daily?");
		String compound;
		compound = keyboard.next();
		if (compound.equalsIgnoreCase("Annually"))
		{
			for(i=0; i<10;i++)
			{
				balance = balance + balance*(interest/100);
			}
			System.out.println("Your balance will be $" +balance+ " in 10 years, calculated annually.");
			System.out.println("Do you want me to calculate the balance of another account?");
			answer = keyboard.next();
		}else
		{
			if (compound.equalsIgnoreCase("Monthly"))
			{
				for(i=0; i<120;i++)
				{
					balance = balance + balance*(interest/1200);
				}
				System.out.println("Your balance will be $" +balance+ " in 10 years, calculated monthly.");
				System.out.println("Do you want me to calculate the balance of another account?");
				answer = keyboard.next();
			}else
			{
				if (compound.equalsIgnoreCase("Daily"))
				{
				for(i=0; i<3650;i++)
				{
					balance = balance + balance*(interest/36500);
				}
				System.out.println("Your balance will be $" +balance+ " in 10 years, calculated daily.");
				System.out.println("Do you want me to calculate the balance of another account?");
				answer = keyboard.next();
				}else
				{
					System.out.println("Not a valid input for the period of compounding.");
					answer = "yes";
				}
			}
				
		}
		
		} while (answer.equalsIgnoreCase("yes"));
		
	}

}
