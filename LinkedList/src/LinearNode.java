// William Ames Spring 2010
// Taken from "Java Software Structures" 3rd ed, Lewis & Chase
// Don't alter this file.

public class LinearNode<T> {
    private LinearNode<T> next;
    private T element;

    public LinearNode() {
        next = null;
        element = null;
    }

    public LinearNode(T element) {
        this.element = element;
        next = null;
    }

    // Getters
    public T getElement() { return element; }
    public LinearNode<T> getNext() { return next; }

    // Setters
    public void setElement(T element) { this.element = element; }
    public void setNext(LinearNode<T> next) { this.next = next; }
}