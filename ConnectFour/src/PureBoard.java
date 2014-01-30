
public class PureBoard {
	int[][] board = new int[7][6];
	private static int EMPTY =0;
	private static int COMP =1;
	private static int OPPONENT =2;
	private int[] maxHeights = new int[7];
	private int value=0;
	
	public PureBoard(){
		for(int i=0; i<7; i++){
			maxHeights[i] = 0;
		}
	}
	
	public boolean makeAMove(int col, int who){
		int i = 0;
		
		while(board[col][i] != EMPTY){
			i += 1;
			if(i>=6){
				return false;
			}
		}
		
		board[col][i] = who;
		maxHeights[col] = maxHeights[col]+1;
		return true;
		
	}
	
	public int returnPlace(int col, int row){
		return board[col][row];
	}
	
	private int highestPoint(){
		int top = 0;
		for(int i=0; i<maxHeights.length; i++){
			if(maxHeights[i]>top){
				top = maxHeights[i];
			}
		}
		return top;
	}
	
	public int StringEval(String checks){
		if(checks.contains("1") && checks.contains("2")){
			return 0;
		}
		
		if(checks.charAt(0) == checks.charAt(1) && checks.charAt(1) ==checks.charAt(2) && checks.charAt(2) == checks.charAt(3)){
			if(checks.contains("1")){
				return 10000;
			}else{
			if(checks.contains("2")){
				return -10000;
			}else{
				return 0;
			}
			}
		}
		
		
		int value =0;
		for(int i =0; i<checks.length(); i++){
			if(checks.charAt(i) ==1){
				value = value+1;
			}
			if(checks.charAt(i)==2){
				value = value -1;
			}
		}
		
		return value;
	}
	
	public int analyze(){
		int top = highestPoint();
		int value =0;
		
		//The horizontals... and verticals, and diagonals, as it turns out.
		for(int i=0; i<7; i++){
			for(int j =0; j<=top; j++){
				String checker = new String();
				for(int l =0; l<4; l++){
					int totx = i+l;
					while(totx>=7){ totx=6;}
					checker = checker + board[totx][j];
				}
				value = value + StringEval(checker);
				
				checker = "";
				
				for(int l =0; l<4; l++){
					int toty = j+l;
					while(toty>=6){ toty=5;}
					checker = checker + board[i][toty];
				}
				value = value + StringEval(checker);
				
				checker = "";
				
				for(int l =0; l<4; l++){
					int totx = i+l;
					while(totx>=7){ totx=6;}
					int toty = j+l;
					while(toty>=6){ toty=5;}
					checker = checker + board[totx][toty];
				}
				value = value + StringEval(checker);
				

				checker = "";
				
				for(int l =0; l<4; l++){
					int totx = i+l;
					while(totx>=7){ totx=6;}
					int toty = j+l;
					while(toty>=6){ toty=5;}
					checker = checker + board[totx][toty];
				}
				value = value + StringEval(checker);
			}
		}
		
		return value;
	}
	
}
