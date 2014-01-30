import java.util.LinkedList;


public class C4Node {
	public int value =0;
	public int move =0;
	public LinkedList<C4Node> children = new LinkedList<C4Node>();
	public C4Node parent = null;
	private static int DEPTH =5;
	private int myDepth =0;
	
	
	public C4Node(int deep, int col){
		move = col;
		myDepth = deep;
		if(deep< DEPTH){
			for(int i=1; i<8; i++){ //1 or 0??
				C4Node child = new C4Node(deep+1, i);
				children.add(child);
			}
		}
	}
	
	public int getValue(PureBoard current){
		int which =myDepth%2;
		if((myDepth&2)==0){
			which =2; 
		}
		
		if(children.isEmpty()){
			ArrayStack<Integer> myMoves = getMoves();
			while(myMoves.isEmpty()== false){
				current.makeAMove(myMoves.pop(), which);
			}
			value = current.analyze();
			return value;
		}else{
			if(myDepth % 2 ==0){
				for(int i=0; i<children.size(); i++){
					if(children.get(i).getValue(current)> value){
							value= children.get(i).getValue(current);
							return value;
					}
				}
			}
			if((myDepth %2) ==1){
				for(int i=0; i<children.size(); i++){
					if(children.get(i).getValue(current)< value){
							value =children.get(i).getValue(current);
							return value;
							}
				}
			}
		}
		return value;
	}
	
	public int whereTo(){
		int best=0;
		
		for(int i =0; i<children.size(); i++){
			if(children.get(i).value<children.get(best).value){
				best =i;
			}
		}
		
		return best;
	}
	
	public ArrayStack<Integer> getMoves(){
		ArrayStack<Integer> moves = new ArrayStack<Integer>();
		
		if(parent==null){
			return moves;
		}else{
			moves = parent.getMoves();
			moves.push(move);
			return moves;
		}	
	}
	
	public LinkedList<C4Node> getLeaves(){
		LinkedList<C4Node> leaves = new LinkedList<C4Node>();
		if(children.isEmpty()){
			leaves.add(this);
		}else{
		for(int i=0; i<children.size(); i++){
			for(int j=0;j<children.get(i).getLeaves().size(); j++){
				leaves.add(children.get(i).getLeaves().get(j));
			}
		}
		}
		return leaves;
	}
}
