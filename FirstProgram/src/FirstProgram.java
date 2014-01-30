/*
 * HW#1 A
 * Stephen Buckley
 * 9/9/09
 */

import java.util.*;
public class FirstProgram {

	public static void main(String[] args)
	{
		
		System.out.println("Hello out there.");
		System.out.println("I will add two numbers for you.");
		System.out.println("Please enter two whole numbers.");
		
		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		System.out.print("The sum of these two numbers is ");
		System.out.println(powers(n1,n2));
	}
	
	
	public static int powers(int base, int power){
		int total=1;
		for(int i=0; i<power; i++){
			total = total *base;
		}
		return total;
	}
}
