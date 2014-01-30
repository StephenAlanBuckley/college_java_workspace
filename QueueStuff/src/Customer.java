/*
 * Stephen Buckley
 * 2/22/2010
 * Customer Class
 */


public class Customer {
	
	int items;
	int timeIn;
	int timeServed;
	
	public Customer(){
		
		items = (int)((Math.random()+.1)*10);
		if(items ==0){
			items = 1;
		}
		
		timeIn = 0;
		timeServed = 0;
	}
	
	public void setTimeIn(int time){
		timeIn = time;
	}

}
