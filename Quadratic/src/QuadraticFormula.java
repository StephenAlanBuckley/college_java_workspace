/* 
 * HW3 Quadratic Formula Technical Remix
 * Stephen Buckley
 * 9/19/09
 */

import java.util.Scanner;
public class QuadraticFormula {
	public static void main (String [] args){
	
		double a1, b1, c1, v1, w1, x1, x2, d1;
		
		System.out.println("Enter the a, b and c values of your quadratic equation on the lines below.");
		System.out.println("Be sure that a is on the first line, b is on the second line and c is on the third line!");
		
		Scanner keyboard = new Scanner(System.in);
		a1 = keyboard.nextDouble();
		b1 = keyboard.nextDouble();
		c1 = keyboard.nextDouble();
		
		if(b1*b1-4*a1*c1<0)
		{
				System.out.println("There are no real solutions for x because your discriminant (b squared minus 4ac) is negative. In order to take its root you would have to do your calculations with the imaginary number 'i.'");
		}
		else
		{
		d1 = Math.sqrt(b1*b1 - 4 * a1 * c1);
			
		v1 = -1*(b1) + d1;
		w1 = -1*(b1) - d1;
		x1 = v1 / (2 * a1);
		x2 = w1 / (2 * a1);
		
		
		
		if(a1==0)
		{
			if(b1==0)
			{	
				System.out.println("There are no possible solutions to a quadratic in which a and b are zero because you are declaring a constant, c equal to zero, which is not the case."); 
			}
			if(b1>0 || b1<0)
			{
				x1= (-1)*(c1/b1);
				System.out.println("There is one possible solution, but seriously, you can do this algebra by yourself.  Just set bx + c equal to zero and solve for x. It's pretty basic.");
				System.out.println("The answer in this case is " + x1 + ". Don't ask me again when you could do this in your head.");
			}
		}
		if(a1>0||a1<0)
		{
			
			if(d1>0)
			{
			System.out.println("There are two possible values for x that will yield a solution.");
			System.out.print("Your first value is ");
			System.out.println(x1);
			System.out.print("Your second value is ");
			System.out.println(x2);
			}
			
			if(d1==0)
			{
				System.out.println("There is only one possible value for x which will yield a solution.");
				System.out.println("That value is " +x1+ ".");
			}
		}
		}	
	}
	
}
