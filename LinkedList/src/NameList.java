/**
* Linked List Homework, #4
* William Ames
* Spring 2010
*/

public class NameList
{
	//head will be the "front" of the list, from which everything can be "nexted"
	private LinearNode<String> head = new LinearNode<String>("");
	
	//this is the node which is currently being considered
	private LinearNode<String> current = head;
	
	//this is the node which has a next of current
	private LinearNode<String> last =null;
	
	public NameList() {
		
	}
	
	public void add(String name) {
		
		
		LinearNode<String> newNode = new LinearNode<String>("empty!");
		newNode.setElement(name);
		current =head;
		last = head;
		
		String nextElement = head.getElement();
		
		if(head.getElement().equalsIgnoreCase("")){
			head = newNode;
		}else{
		while(newNode.getElement().compareTo(nextElement)>0){
			last = current;
			current = current.getNext();
			
			if(current ==null){
			  String foolProof = "";
				for(int i =0; i< name.length()+1; i++){
					foolProof = foolProof +"z";
				}
				nextElement = foolProof;
			}else{
				nextElement = current.getElement();
			}
			
				
			
		}
		
		if(current!= head){
			last.setNext(newNode);
		}
		newNode.setNext(current);
		if(current ==head){
			head = newNode;
		}
		}
		
		/* Steps to this part:
		 * DONE WITH THIS: 1) Create a node with next == null and element ==name
		 * DONE WITH THIS: 2) Step through the list until compareTo (see the API) returns >0 (keep track of last)
		 * 		*I am actually not sure if the > is correct, but if the list comes out backwards, then I know where to look
		 * DONE WITH THIS: 3) Make the current node in the step the "next" of the node being added
		 * DONE WITH THIS: 4) Make the node that previously had the next of the current node (last) have a next of the added node
		 */
		
		// Problem: Infinite loop:  this will constantly set the next of Ricardo to whomever was previous.  Obviously, when we get past Anna (to me) there's a problem.
		
	}
	
	
	public void delete(String name) {
		int currLength = length();
		Boolean removed = false;
		
		last = head;
		current = last;
		
		for(int i =0; i<=currLength; i++){
			if(current.getElement().equalsIgnoreCase(name)){
				if(removed == false){
					if(current==head){
						head = current.getNext();
					}else{
					last.setNext(current.getNext());
					removed = true;
					}
				}
			}
			
			last = current;
			current = current.getNext();
		}
		
		/* Steps to this part
		 * DONE WITH THIS: 1) Step through the list until the element of the stepped on node equals name
		 * DONE WITH THIS: 2) Set last.next == current.next, essentially eliminating current from the list
		 * 
		 * 
		 * CHECK If the name isn't in the list, then do nothing.
		 * CHECK If the name has been removed, then kill the method
		 */
	}
	
	public int length() {
		current = head;
		int i=0;
		while(current.getNext() !=null){
			current = current.getNext();
			i++;
		}
		return i;
	}
	
	
	//not printed in order.  Find out why.
	public String toString() {
		String list= "";
		current = head;
		
		while(current!=null){
			list = list + current.getElement() + "\n";
			current = current.getNext();
		}
		
		return list;
	}
	
	// Don't change main() unless you check with Prof Ames first.
    public static void main(String args[])
    {
    	NameList names = new NameList();
        names.add("Ricardo");
        names.add("Dario");
        names.add("Matthew");
        names.add("Anna");
        names.add("Stephen");
        names.add("Barnaby");
        names.add("Jonathan");
        names.add("Declan");
        names.add("Vivian");
        names.add("Chelsea");
        names.add("William");
        names.add("Spencer");
        names.add("Lea");
        names.add("Matthew");
        names.add("Brendan");
        names.add("Michael");
        names.add("Douglas");
        names.add("Helen");
        names.add("Youngmoon");
        names.add("Matthew");
        names.add("Alexander");
        names.add("Jinho");
        names.add("Matthew");
        names.add("Joseph");
        names.add("Denis");
        names.add("Michael");
        names.add("Joseph");
        names.add("Chi");
        names.add("Raoul-Edgar");
        names.add("Matthew");
        names.add("Brennan");
        names.add("Glen");
        names.add("Toan");
        names.add("Ali");
        names.add("Michael");
        names.add("Paul");
        names.add("Melvin");
        names.add("Daniel");
        names.add("Xavier");
        names.add("Peter");
        names.add("Thomas");
        names.add("Daniel");
        names.add("Krystal");

        System.out.println("List size is " + names.length() + " before removals");
        System.out.println(names); // prints whatever toString() returns
        System.out.println(); // skip a line

        names.delete("Toan");      // ordinary delete, somewhere in middle of list
        names.delete("Matthew");   // should only delete one of them
        names.delete("Youngmoon"); // this happens to be the last element
        names.delete("Alexander"); // this happens to be the first element
        names.delete("NonExistantPerson"); // should quietly do nothing
        names.delete("Anna");       // (new) second element on list

        System.out.println("List size is " + names.length() + " after removals");
        System.out.println(names);
    }
}