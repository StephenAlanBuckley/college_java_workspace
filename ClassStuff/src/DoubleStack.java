import java.util.Stack;

public class DoubleStack {
	
	public static Stack<Integer> stackDoubler(Stack<Integer> original){
		Stack<Integer> holderStack = new Stack<Integer>();
		int i = original.size();
		int j=0;
		while(j<i){
			int popped = original.pop();
			popped = popped *2;
			holderStack.push(popped);
			j++;
		}
		while(j>0){
			int popped = holderStack.pop();
			original.push(popped);
			j--;
		}
		return original;
	}
}