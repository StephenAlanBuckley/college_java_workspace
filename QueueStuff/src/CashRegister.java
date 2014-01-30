import java.util.*;

/*
 * Stephen Buckley
 * 2/22/2010
 * CashRegister Class
 */

public class CashRegister {

	private Queue<Customer> queue = new LinkedList<Customer>();//the queue of customers
	
	private Stack<Integer> waits = new Stack<Integer>();//used for the amount of time customers waited, each element is a time waited for 1 customer.
	
	public Stack<Integer> lengths = new Stack<Integer>();//the qlength at each second. 
	
	private Customer current = new Customer();//the customer being served
	
	int processTime;
	
	int currentTime;
	
	double numberOfBryans;
	
	public CashRegister(){
		processTime =0;
		currentTime =0;
	}
	
	public void tick(){
		currentTime++;
		processTime--;
		if(processTime<=0){
			getCustomer();
		}
	}
	
	public void getCustomer(){
		current = queue.poll();
		if(current != null){
			processTime = current.items +5;
			waits.add(currentTime- current.timeIn);
			numberOfBryans++;
		}
	}
	public void getQLength(){
		lengths.add(queue.size());
	}
	
	public double avgWaitTime(){
		double average =0;
		double total =0;
		double divisor = waits.size();
		
		for(int i=0; i<divisor; i++){
			total = total+ waits.pop();
		}
		
		average = total/divisor;
		average = average/60.;
		return average;
	}

	public double avgQLength(){
		double average =0;
		double total =0;
		double divisor = lengths.size();
		
		for(int i=0; i<divisor; i++){
			total = total+ lengths.pop();
		}
		
		average = total/divisor;
		return average;
		
	}

	public void addCustomer(Customer bryan){
		bryan.setTimeIn(currentTime);
		queue.add(bryan);
	}
}
