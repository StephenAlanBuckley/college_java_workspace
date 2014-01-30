/*
 * Stephen Buckley
 * 9/30/09
 * How Much Pi Do You Want?
 */

public class HowMuchPiDoYouWant {
	public static void main(String[] args)
	{
		System.out.println("Approximations of pi:");
		double i =1;
		double circa=1;
		
		/*
		 * Why aren't we setting the end point to the maximum in order to achieve the most accuracy in pi?
		 * It's pretty much what this is made for.  100,000 barely gets the tip of the proverbial iceberg.
		 * 1 billion makes it go for a VERY long time.  But you get accuracy out to...
		 * Well, mine's not done.  But so far about 6 decimals.  And it's practically got the 7th!
		 * 
		 * ... Okay, now this is me about 5 minutes after that last comment.  Just got the 7th.  Beginning to see
		 * why no one would want to sit through 1 billion approximations.
		 * 
		 * ... Stopped it.  That was just way too many numbers.
		 */
		for (i=1; i<10000000;i++)
		{
			circa = circa + (Math.pow(-1, i)/(2*i+1));
			System.out.println(4*circa);
		}
	}

}
