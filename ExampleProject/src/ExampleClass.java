import java.util.Scanner;

public class ExampleClass {

	public static void main(String[] args){
		System.out.println("Input Time.");
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		double speed = (36*time) + (5*time*time);
		System.out.println("Speed is: " + speed);
	}
}