import java.util.LinkedList;


public class StarList {

	LinkedList<Star> theList = new LinkedList<Star>();
	double gravity;
	double xDist, yDist, force, firstX, secondX, firstY, secondY;
	
	public void updateList(double grav){
		gravity = grav;
		Star starI = new Star(0,0);
		Star starJ = new Star(0,0);
		
		for(int n=0;n<theList.size();n++){
			starI = theList.get(n);
			starI.update();
		}
		
		for(int i=0;i<theList.size();i++){
			starI = theList.get(i);
			firstX = starI.getX();
			firstY = starI.getY();
			
			for(int j=0;j<theList.size();j++){
				if(i!=j){
				starJ = theList.get(j);
				secondX = starJ.getX();
				secondY = starJ.getY();
				
				xDist = firstX-secondX;
				yDist = firstY-secondY;
				force = gravity/(xDist*xDist + yDist*yDist);
				starI.setXSpeed(starI.dx - xDist *force);
				starI.setYSpeed(starI.dy - yDist *force);
				}
			}
		}
	}

	public StarList(){
		
	}
	
	public void add(Star newStar){
		theList.add(newStar);
	}
	
	public LinkedList<Star> getList(){
		return theList;
	}
	
	public void remove(int n){
		if(n<theList.size()){
			theList.remove(n);	
		}else{
			System.out.println("The list is smaller than the index you tried to remove!  Dummy.");
		}
	}
	
	public int getSize(){
		return theList.size();
	}
	
	public Star getIndex(int index){
		return theList.get(index);
	}
}
