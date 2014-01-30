/* Stephen Buckley
 * 2/17/2010
 * Hw #5
 */

import java.io.Serializable;



//So, Professor Ames and I had a brief discussion about doing this as a "Circular" DoublyLinkedList, which means that 
//head has a next and prev of itself to start.  The nice thing about this is that it's impossible for next, prev, first, 
//or last to return null, and the programming of those methods is drastically simplified.
public class DoublyLinkedList<T> implements OrderedListADT<T>, Serializable{ 

	private Node<T> head = new Node<T>();
	private Node<T> current = new Node<T>();
	private int size =0;
	
	private class Node<T> implements Serializable { 
	        private static final long serialVersionUID = 1L; 
	        private Node<T> prev, next; 
	        private T element; 
	         
	        public Node() { 
	            prev = next = null; 
	            element = null; 
	        } 
	         
	        public Node(T element) { 
	            prev = next = null; 
	            this.element = element; 
	        } 
	         
	        // getters 
	        public T getElement() { return element; } 
	        public Node<T> getPrev() { return prev; } 
	        public Node<T> getNext() { return next; } 
	         
	        // setters 
	        public void setElement(T element) { this.element = element; } 
	        public void setNext(Node<T> next) { this.next= next; } 
	        public void setPrev(Node<T> before)  {this.prev = before;  } 
	}
	

	public DoublyLinkedList(){
		head.setNext(head);
		head.setPrev(head);
		current = head;
	}
	
	public void addToHead(T newElement){
		if(head.getElement() == null){
			head.setElement(newElement);
		}else{
		Node<T> newHead = new Node<T>();
		newHead.setElement(newElement);
		head.prev.setNext(newHead);
		newHead.setNext(head);
		newHead.setPrev(head.prev);
		head.setPrev(newHead);
		head = newHead;
		}
		size++;
	}
	
	public void addToTail(T newElement){
		if(head.getElement() == null){
			head.setElement(newElement);
		}else{
			Node<T> newTail = new Node<T>();
			newTail.setElement(newElement);
			newTail.setNext(head);
			newTail.setPrev(head.prev);
			head.prev.setNext(newTail);
			head.setPrev(newTail);
		}
		size++;
	}
	
	public void delete(){
		current.prev.setNext(current.getNext());
		current.next.setPrev(current.getPrev());
		current = head;
		size--;
	}

	public T first(){
		if(head.getElement() == null){
			return null;
		}
		current = head;
		return current.getElement();
	}
	
	public T last(){
		if(head.prev.getElement() == null){
			return null;
		}
		current = head.getPrev();
		return current.getElement();
	}
	
	public T next(){
		current = current.getNext();
		return current.getElement();
	}
	
	public T prev(){
		current = current.getPrev();
		return current.getElement();
	}
	
	public T current(){
		return current.getElement();
	}
	
	public boolean isEmpty(){
		if(head == head.getPrev()){
			if(head.getElement() == null){
				return true;
			}
		}
		return false;
	}
	
	public int size(){
		
		return size;
	}

}

