/*
 * Stephen Buckley
 * 2/22/2010
 * Simulation1 class
 */

public class Simulation2 {
	
	public CashRegister Register1 = new CashRegister();
	
	public CashRegister Register2 = new CashRegister();
	
	public Customer newCustomer(){
		Customer newbie = new Customer();
		return newbie;
	}
	
	public void chooseQ(Customer maria){
		if(maria.items <=5){
			Register2.addCustomer(maria);
		}else{
			Register1.addCustomer(maria);
		}
		
	}
	
	public static void main(String args[]){
		Simulation2 secondSimulation = new Simulation2();
	}
	
	public Simulation2(){
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