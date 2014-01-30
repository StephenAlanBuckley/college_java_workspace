// William Ames Spring 2010
// ADT for HW#5, to be implemented as a doubly linked list
public interface OrderedListADT<T> {
	public void addToHead(T element); // Also makes "current" be this new first node
	public void addToTail(T element);  // Also makes "current" be this new last node
	public void delete(); // Deletes the "current" node.  "Current" moved to first element, or null if list is now empty
	
	// The following 4 methods return null when the list is empty
	// or there is no such element.
	public T first(); // Retrieves first element, sets "current" to first
	public T last();  // Retrieves last element, sets "current" to last
	public T next();  // Retrieves next element, moves "current" to right if was not last
	public T prev();  // Retrieves next element, moves "current" to left
	
	public T current(); // Retrieves the element pointed to by "current"
	
	public boolean isEmpty(); // true if the list is completely empty (contains only dummy head/tail nodes)
	public int size();  // number of items on list (dummy first/last nodes don't count)
}