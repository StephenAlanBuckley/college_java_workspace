import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Infixings implements ActionListener{
	
	JFrame mainWin = new JFrame("Do equations.");
	
	JTextField equation = new JTextField(15);
	JTextField infixResult = new JTextField(15);
	JTextField postfixResult = new JTextField(15);
	JTextField derResult = new JTextField(15);
	JLabel input = new JLabel("Equation");
	JLabel outin = new JLabel("Infix Result");
	JLabel outpost = new JLabel("Postfix Result");
	JLabel derLabel = new JLabel("Derivative");
	
	Stack<Node> valueStack = new Stack<Node>();
	Stack<String> operatorStack = new Stack<String>();
	
	public static void main(String args[]){
		Infixings startup = new Infixings();
	}
	
	public void evaluate(String initial){// note that this doesn't work with the node system.  It should't try to call this (I don't think).  It should try to call a print, not this)
		
		initial = "(" + initial + ")";
		StringTokenizer tokenmaker = new StringTokenizer(initial, "+-*/^()", true);
		
		while(tokenmaker.hasMoreTokens()) {
			String token = tokenmaker.nextToken();
			
			addNumber(token);
			addVariable(token);
			addLeftParen(token);
			addRightParen(token);
			addOperator(token);
			
		}
		if(operatorStack.isEmpty()){
			
		}else{
			throw new ArithmeticException("You have more operators than operands!");
		}
	}
	
	public String postfixPrint(Node current){
		if(current == null){
			return "";
		}else{
		if( current.getType() <=1){
			return "" + current.getElementAsString() + " ";
		}else{
			return postfixPrint(current.left) + postfixPrint(current.right) + current.getNaN();
		}
		}
	}
	
	public String infixPrint(Node current){
		if(current ==null){
			return "";
		}else{
		
		if( current.type <=1){
			return "" + current.getElementAsString() + " ";
		}else{
			double myPrec, leftPrec, rightPrec;
			String finalReturn = "";
			
			myPrec = precedence(current.getElementAsString());
			if(current.left == null){
				leftPrec = 0;
			}else{
				leftPrec = precedence(current.left.getElementAsString());
			}
			
			if(current.right == null){
				rightPrec = 0;
			}else{
				rightPrec = precedence(current.right.getElementAsString());
			}
			
			if(myPrec<=leftPrec){
				finalReturn = finalReturn+ infixPrint(current.left);
			}else{
				finalReturn= finalReturn+  "(" + infixPrint(current.left) + ")";
			}
			
			finalReturn = finalReturn + current.getElementAsString();
			
			if(myPrec<rightPrec){
				finalReturn = finalReturn + infixPrint(current.right);
			}
			if (myPrec>rightPrec){
				finalReturn = finalReturn + "(" + infixPrint(current.right) + ")";
			}
			if(myPrec == rightPrec){
				if("-/".contains(current.getElementAsString())){
					finalReturn = finalReturn + "(" + infixPrint(current.right) + ")";
				}else{
					finalReturn = finalReturn + infixPrint(current.right);
				}
			}
			
			return finalReturn;
		}

		}
	}
	
 	public double precedence(String op){
		if(op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-")){
			return 1;
		}
		
		if(op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/")){
			return 2;
		}
		
		if(op.equalsIgnoreCase("^")){
			return 3;
		}
		if(op.equalsIgnoreCase("(")){
			return 0;
		}
		
		if(op.equalsIgnoreCase(")")){
			return 4;
		}
		
		if(op.compareTo(":")<0 && op.compareTo("/")>0){
			return 6;
		}
		
		if("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(op)){
			return 7;
		}
		
		return 0;
	}

	public double performOp(double a, String op, double b){

		if(op.equalsIgnoreCase("+")){
			return a+b;
		}
		if(op.equalsIgnoreCase("-")){
			return b-a;
		}
		if(op.equalsIgnoreCase("*")){
			return a*b;
		}
		if(op.equalsIgnoreCase("/")){
			return b/a;
		}
		if(op.equalsIgnoreCase("^")){
			return Math.pow(b, a);
		}
		return 0;
	}
	
	public Infixings(){
		mainWin.setLayout(new GridLayout(4,2));
		mainWin.setLocation(500, 300);
		
		infixResult.setEditable(false);
		equation.addActionListener(this);
		
		mainWin.getContentPane().add(input);
		mainWin.getContentPane().add(equation);
		mainWin.getContentPane().add(outin);
		mainWin.getContentPane().add(infixResult);
		mainWin.getContentPane().add(outpost);
		mainWin.getContentPane().add(postfixResult);
		mainWin.getContentPane().add(derLabel);
		mainWin.getContentPane().add(derResult);
		mainWin.pack();
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == equation){
			
			evaluate(equation.getText());
			Node result = valueStack.pop();
			String answer = infixPrint(result);
			infixResult.setText(answer);
			
			while(valueStack.isEmpty() == false){
				valueStack.pop();
			}
			
			evaluate(equation.getText());
			answer = postfixPrint(valueStack.pop());
			postfixResult.setText(answer);
			
			while(valueStack.isEmpty() == false){
				valueStack.pop();
			}
			
			evaluate(equation.getText());
			Node deriv = valueStack.pop().derivative();
			deriv = deriv.simplify();
			answer = infixPrint(deriv);
			derResult.setText(answer);
		}
		
	}

	public void addNumber(String currentToken){
		
		try
		{
			Node integer = new Node(0, currentToken);
			valueStack.push(integer);
		}
		catch(NumberFormatException exception)
		{	
		}
		
	}

	public void addLeftParen(String currentToken){
		
		if(currentToken.equalsIgnoreCase("(")){
			operatorStack.push(currentToken);
		}
	}
	
	public void addVariable(String currentToken){
		if("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(currentToken)){
			Node variable = new Node(1, currentToken);
			valueStack.push(variable);
		}
	}

	public void addRightParen(String currentToken){
		
		if(currentToken.equalsIgnoreCase(")")){
			String opTop = operatorStack.pop();
			if(operatorStack.size()>0){
				if(opTop.equalsIgnoreCase("(")){
					return;
				}else{
				Node first, second, finalint;
				first = valueStack.pop();
				second = valueStack.pop();
				finalint = new Node(2, opTop);
				finalint.setLeft(second);
				finalint.setRight(first);
				valueStack.push(finalint);
				addRightParen(currentToken);
					}
				}
			}
	}

	public void addOperator(String currentToken){
		if("+-*/^".contains(currentToken)){
			String thisOp =currentToken;
			String currentOperator = new String("");
			if(operatorStack.size()>0)
				
				while(precedence(operatorStack.peek()) >= precedence(thisOp)){
				Node first, second, finalint;
				if(valueStack.isEmpty()){
					
				}else{
					first = valueStack.pop();
					second = valueStack.pop();
					currentOperator =operatorStack.pop();
					finalint = new Node(2, currentOperator);
					finalint.setLeft(second);
					finalint.setRight(first);
					valueStack.push(finalint);
					
					}
				}
			operatorStack.push(thisOp);
		}
	}

}