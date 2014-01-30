
public class Factorial {

	public static void main (String[] args){
		
		double i, sofar =1;
		
		i=1;
		
		for(i=1; i<20;++i)
		{
			sofar=sofar*i;
		}
		System.out.println(sofar);
	}
}
