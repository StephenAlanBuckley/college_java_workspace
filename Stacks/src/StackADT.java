// William Ames, Spring 2010
// Stack that can hold any type of object (but not mixed types)

public interface StackADT<T> {
    public void push(T element);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
}