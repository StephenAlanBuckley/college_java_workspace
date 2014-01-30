/**
 * @author Stephen Buckley
 * 9/16/09
 * HW2 Converter
 */

import java.util.Scanner;
public class Converter {
	public static void main (String [] args){
		
		System.out.println("Please insert your degrees in Fahrenheit.");
		
		double t1, c1;
		
		Scanner keyboard = new Scanner(System.in);
		t1 = keyboard.nextDouble();
		
		c1 = (t1-32)*5/9;
		
		System.out.println("In Celsius that is " + c1 + " degrees.");
	}

}
