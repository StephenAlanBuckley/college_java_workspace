// Stack that can hold any type of object
// William Ames, Spring 2010

// Unfinished!  peek(), isEmpty(), size(), toString()
import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T>
{
    private static final int INITIAL_CAPACITY = 20;
    private Object[] stack; // Java doesn't allow arrays of type T (sigh)
    private int top;
    
    public ArrayStack() {
        stack = new Object[INITIAL_CAPACITY];
        top = 0;
    }
    
    public boolean isEmpty() {
        if (stack[top]==null){
        	return true;
        }else{
        	return false;
        }
    }

    @SuppressWarnings("unchecked")
	public T peek() {
    	if (size() == 0){
            throw new EmptyStackException();
            }
    	T element = (T)stack[top];
    	return element;
    	
    }

    @SuppressWarnings("unchecked")
	public T pop() {
        if (size() == 0)
            throw new EmptyStackException();
        top--;
        T result = (T)stack[top];
        stack[top] = null;
        return result;
    }

    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }
    private void expandCapacity() {
        Object[] larger = new Object[stack.length * 2]; // room for twice as many
        for (int i=0; i<stack.length; ++i)
            larger[i] = stack[i];
        stack = larger;
    }

    public int size() {
        return stack.length;
    }
    
    public String toString() {
        String result = new String();
        result = ""+ stack.length;
    	for(int i=stack.length-1; i==0; i--){
        	result = result + "/n" + stack[i]; 
        }
    	return result;
    }
}