
public class Node {

	public int type; // if type = 0, it's a number.  if type =1, it's a variable, if type =2, it's an operator
	
	public double number;// the "empty" number node, unchanged
	
	public String varop = new String(""); //the empty String node, unchanged
	
	public Node left;
	
	public Node right;
	
	public Node(int setType, String substance){
		type= setType;
		
		if(type ==0){
			number = new Double(substance);
		}else{
			varop= substance;
		}
	}
	
	public int getType(){
		return type;
	}
	
	public double getNumber(){
		return number;
	}
	
	public String getNaN(){
		return varop;
	}

	public String getElementAsString(){
		if(type ==0){
			return "" + number + "";
		}else{
			return varop;
		}
	}
	
	public void setLeft(Node nLeft){
		left = nLeft;
	}
	
	public void setRight(Node nRight){
		right = nRight;
	}
	
	public Node simplify(){
		if(type<2){
			return this;
		}else{
			Node newLeft = left.simplify();
			Node newRight = right.simplify();
			
			if(varop.contains("+")){
				
				if(newLeft.type == 0){
					if(newLeft.number ==0){
						return newRight;
					}
					
				}
				
				if(newRight.type == 0 && newRight.number == 0){
					return newLeft;
				}
				
				if(newLeft.type ==0 && newRight.type ==0){
					return new Node(0, ""+ (newLeft.number + newRight.number) +"");
				}
				
				Node ends = new Node(2, "+");
				ends.left = newLeft;
				ends.right = newRight;
				return ends;
			}
			
			if(varop.contains("-")){
				if(newRight.type == 0 && newRight.number == 0){
					return newLeft;
				}
				
				if(newLeft.type ==0 && newRight.type ==0){
					return new Node(0, ""+ (newLeft.number - newRight.number) +"");
				}
				
				Node ends = new Node(2, "-");
				ends.left = newLeft;
				ends.right = newRight;
				return ends;
			}
			
			if(varop.contains("*")){
				if((newLeft.type==0 && newLeft.number == 0) || (newRight.type ==0 && newRight.number ==0)){
					return new Node(0, "0");
				}
				
				if(newLeft.type == 0 && newLeft.number == 1){
					return newRight;
				}
				
				if(newRight.type == 0 && newRight.number == 1){
					return newLeft;
				}
				
				if(newLeft.type ==0 && newRight.type ==0){
					return new Node(0, ""+ (newLeft.number * newRight.number) +"");
				}
				
				Node ends = new Node(2, "*");
				ends.left = newLeft;
				ends.right = newRight;
				return ends;
			}
			
			if(varop.contains("/")){
				if(newLeft.type == 0 && newLeft.number == 0){
					return new Node(0, "0");
				}
				if(newRight.type == 0 && newRight.number == 1){
					return newLeft;
				}
				
				if(newLeft.type ==0 && newRight.type ==0){
					return new Node(0, ""+ (newLeft.number / newRight.number) +"");
				}
				
				Node ends = new Node(2, "/");
				ends.left = newLeft;
				ends.right = newRight;
				return ends;
				
			}
			
			if(varop.contains("^")){
				if(newRight.type == 0 && newRight.number == 1){
					return newLeft;
				}
				
				if(newRight.type == 0 && newRight.number == 0){
					return new Node(0, "1");
				}
				
				if(newLeft.type ==0 && newRight.type ==0){
					return new Node(0, ""+ (Math.pow(newLeft.number, newRight.number)) +"");
				}
				
				Node ends = new Node(2, "^");
				ends.left = newLeft;
				ends.right = newRight;
				return ends;
				
			}
		}
		
		return this;
	}
	
	public Node derivative(){
		
		if(varop.equalsIgnoreCase("x")){
			Node onesies = new Node(0, "1");
			return onesies;
		}
		if(number>0){
			Node empty = new Node(0, "0");
			return empty;
		}
		if("+-*/^".contains(varop)){
			if(varop.contains("+") || varop.contains("-")){
				Node plus = new Node(2, varop);
				plus.left = left.derivative();
				plus.right = right.derivative();
				return plus;
			}
			
			if(varop.contains("*")){
				Node plus = new Node(2, "+");
				Node mult1 = new Node(2, "*");
				Node mult2 = new Node(2, "*");
				
				mult1.left = left;
				mult1.right = right.derivative();
				
				mult2.left = left.derivative();
				mult2.right = right;
				
				plus.left = mult1;
				plus.right = mult2;
				return plus;
			}
			
			if(varop.contains("/")){
				Node minus = new Node(2, "-");
				Node mult1 = new Node(2, "*");
				Node mult2 = new Node(2, "*");
				Node divi = new Node(2, "/");
				Node expo = new Node(2, "^");
				
				expo.left = right;
				expo.right = new Node(0, "2");
				
				divi.left = left.derivative();
				divi.right = expo;
				
				mult2.right = divi;
				mult2.left = right;
				
				mult1.left = left;
				mult1.right = right.derivative();
				
				minus.left = mult2;
				minus.right = mult1;
				
				return minus;
			}
			
			if(varop.contains("^")){
				Node mult1 = new Node(2, "*");
				Node mult2 = new Node(2, "*");
				Node expo = new Node(2, "^");
				Node minus = new Node(2, "-");
				
				
				minus.left = right;
				minus.right = new Node(0, "1");
				
				expo.left = left;
				expo.right = minus;
				
				mult2.left = right;
				mult2.right = left.derivative();
				
				mult1.left = mult2;
				mult1.right = expo;
				
				return mult1;
			}
		}
		
		return new Node(0, "0");
	}
}
