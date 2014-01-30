
public class ComputerThinker {
	private ArrayStack<Integer> moveStack;
	private PureBoard realBoard = new PureBoard();
	private int myMove;
	
	public int Think(PureBoard current){
		realBoard = current;
		
		C4Node root = new C4Node(0,0);
		
		root.getValue(realBoard);
		
		return root.whereTo();
	}
	//Creating a single Node will create all of the possible nodes for 5 deep from that Node.  
	//There will be a move value for the root node, but it's not important.
	
	//So, here's the idea:
	//1) Make a tree of future boards, based on the 7 possible moves each player can make, with min/max layers
	//2) Make a board analyzer, to determine the value of the end product of branches of the tree.
	//3) Keep track of the moves the opponent takes, and the moves he was expected to take.  Perhaps in a String?
	//4) Assume the player will play at the level of aptitude he's been showing thus far, be that 2 or 6, and play one above that.
	//5) If possible, set up alpha-beta pruning to reduce the amount of leaves which need to be looked at and thus the possible depth.
	
	
	
}
