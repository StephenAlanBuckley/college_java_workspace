
public class Fibs {
	
	public int fibonacci(int which){
		if(which<2){
			return (int)1;
		}
		else{
			return(fibonacci(which-1)+ fibonacci(which-2));
		}
	}

}
