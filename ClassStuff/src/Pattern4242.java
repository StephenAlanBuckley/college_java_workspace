
public class Pattern4242 {

	public static void main(String args[]){
		pattern(80);
	}
	
	public static void pattern(int n){
		System.out.println(n);
		if(n>4242){		
		}else{
		pattern(2*n);
		}
		System.out.println(n);
	}
}
