/*
 * Stephen Buckley
 * 2/22/2010
 * Simulation1 class
 */

public class Simulation1 {
	
	public CashRegister Register1 = new CashRegister();
	
	public CashRegister Register2 = new CashRegister();
	
	public Customer newCustomer(){
		Customer newbie = new Customer();
		return newbie;
	}
	
	public void chooseQ(Customer maria){
		boolean inALine = false;
		
		if(Register1.lengths.empty()){
			Register1.addCustomer(maria);
			inALine = true;
		}
		
		if(inALine==false){
		if(Register2.lengths.empty()){
			Register2.addCustomer(maria);
			inALine = true;
			}
		}
		
		if(inALine==false){
		if(Register1.lengths.peek() < Register2.lengths.peek()){
			Register1.addCustomer(maria);
			inALine = true;
			}
		}
		
		if(inALine==false){
		if(Register2.lengths.peek() < Register1.lengths.peek()){
			Register2.addCustomer(maria);
			inALine =true;
			}
		}
		
		if(inALine==false){
		if(Register1.lengths.peek() == Register2.lengths.peek()){
			double k= Math.random();
			
			
			if(k<=.5){
				Register1.addCustomer(maria);	
			}else{
				Register2.addCustomer(maria);
			}
		}
	}
		
		
	}
	
	public static void main(String args[]){
		Simulation1 firstSimulation = new Simulation1();
	}
	
	public Simulation1(){
		double i =0;
		
		for(i=0; i<=10000; i++){
			double j= Math.random();
			
			if(j< .21){
				Customer noobs = newCustomer();
				chooseQ(noobs);
			}
			
			
			Register1.tick();
			Register2.tick();
			
			Register1.getQLength();
			Register2.getQLength();
		}
		
	System.out.println("Register 1:");
	System.out.println("Number of Arrivals:    " + Register1.numberOfBryans);
	System.out.println("Average Queue Length:    " + Register1.avgQLength());
	System.out.println("Average Wait Time:    " + Register1.avgWaitTime());
	System.out.println();
	System.out.println();
	System.out.println("Register 2:");
	System.out.println("Number of Arrivals:    " + Register2.numberOfBryans);
	System.out.println("Average Queue Length:    " + Register2.avgQLength());
	System.out.println("Average Wait Time:    " + Register2.avgWaitTime());
	}
}