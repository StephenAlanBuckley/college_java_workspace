/*
 * Stephen Buckley
 * 9/30/09
 * Grading Made Easy
 * 
 * I know that I'm supposed to pretend that this was all my brilliant logic, 
 * but this (or at least something VERY similar) is in the 5th edition on the book on page 195.
 * I'm assuming you guys know that.
 */

import java.util.Scanner;

public class ExamReader {
	
	public static void main(String[] args)
	{
		System.out.println("Please enter the exam scores followed by a negative number.");
		double numberofgrades = 0, as =0, bs =0, cs =0, ds =0, fs =0, next;
		Scanner keyboard = new Scanner(System.in);
		{
			next = keyboard.nextDouble();
			while (next>=0)
			{
				numberofgrades++;
				if (next<60)
					fs++;
					
				if (next<70 && next>=60)
					ds++;
				
				if (next<80 && next>=70)
					cs++;
				if (next<90 && next>=80)
					bs++;
				if (next>90)
					as++;
				next = keyboard.nextDouble();
			}
			System.out.println("There are " + numberofgrades+ " grades.");
			System.out.println("There are " +as+ " A's in the class.");
			System.out.println("There are " +bs+ " B's in the class.");
			System.out.println("There are " +cs+ " C's in the class.");
			System.out.println("There are " +ds+ " D's in the class.");
			System.out.println("There are " +fs+ " F's in the class.");
		}
		
	}

}
