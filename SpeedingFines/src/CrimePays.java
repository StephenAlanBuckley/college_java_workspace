/*
 * HW3 Speeding Fines 
 * Stephen Buckley
 * 9/19/09
 */
import java.util.Scanner;

public class CrimePays {
	public static final double FLATRATE = 50;
	public static final double DOLLARSPERMPH = 5;
	public static final double WAYTOOFAST = 100;
	
	public static void main (String [] args){
		
		double driver1, limit1, sub1, fine1;
		
		System.out.println("Please enter the speed limit and the driver's speed on the two consecutive lines below.");
		
		Scanner keyboard = new Scanner(System.in);
		limit1 = keyboard.nextDouble();
		driver1 = keyboard.nextDouble();
		
		sub1 = driver1-limit1;
		
		if(sub1>0)
		{
			fine1 = FLATRATE + (sub1*DOLLARSPERMPH);
			if(driver1>=90)
			{
				fine1=fine1 + WAYTOOFAST;
			}
			System.out.println("The total fine is $" +fine1+ ".");
		}
		
		if(sub1<=0)
		{
			System.out.println("There's no speeding here. It's fine.");
		}
		

		
	}

}
