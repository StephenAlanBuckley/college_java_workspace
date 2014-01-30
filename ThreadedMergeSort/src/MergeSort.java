/**
* MergeSort
* from Wikipedia
* Originally written by John von Neumann, 1945
* Implemented by William Ames and Stephen Buckley
*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class MergeSort
{
	private static int maxThreads= 20;
	
	private static Thread[] threadList;
	
	private static int latestThread = -1;
	
	
	// Print the list, but to a maximum of 20 elements
    
	public static void printList(List<Integer> list) {
        for (int i=0; i<Math.min(20, list.size()); ++i)// why doesn't this constantly check "list.size?" I don't mean for efficiency, that's just what I expect it to do, but it apparently doesn't.
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

    public static void mergeSort(List<Integer> data) {
       if (data.size() <= 1) // recursive base case
    	   return; // 0 or 1 elements, already sorted!
       // split arrays in half
       int middle = data.size()/2;
       final List<Integer> left  = new ArrayList<Integer>(middle);
       List<Integer> right = new ArrayList<Integer>(data.size()-middle); // works for both odd and even sizes
       for (int i=0; i<middle; ++i)
    	   left.add(data.get(i));
       for (int i=middle; i<data.size(); ++i)
    	   right.add(data.get(i));
       
       if(latestThread<maxThreads-1){
    	   latestThread ++;
    	   threadList[latestThread] = new Thread() {
				public void run() {
					mergeSort(left);
				}
       };
       threadList[latestThread].run();
       }else{
    	  mergeSort(left);
       }
       mergeSort(right); // recurse
       for(int i =1; i==latestThread; i++){
    	   try {
			threadList[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       merge(left, right, data);
    }
    
    // Don't use ArrayList 'remove()' method!  It's order N!
   
    private static void merge(List<Integer> left, List<Integer> right, List<Integer>result) {
    	result.clear();
    	int leftNext=0, rightNext=0;
    	while (leftNext<left.size() && rightNext<right.size())
    		if (left.get(leftNext) <= right.get(rightNext))
    			result.add(left.get(leftNext++));
    		else
    			result.add(right.get(rightNext++));
    	// Put any remaining items from left or right onto result.
    	// Only one of left or right might have some.
    	while (leftNext<left.size())
    		result.add(left.get(leftNext++));
    	while (rightNext<right.size())
    		result.add(right.get(rightNext++));
    }
    
    // For debugging only, make sure the sort worked!
    public static void checkSort(List<Integer> list) {
        for (int i=0; i<list.size()-1; ++i)
            if (list.get(i) > list.get(i+1)) {
                System.out.println("List unsorted at index " + i);
                System.exit(1);
            }
    }

    // test the mergeSort method
    
    public static void main(String args[])
    {
    	if(Runtime.getRuntime().availableProcessors()>20){
    		maxThreads = Runtime.getRuntime().availableProcessors()-1;
    	}else{
    		maxThreads =20;
    	}
    	
    	threadList = new Thread[maxThreads];
    	
    	int size = 1000000;
    	List<Integer> list = new ArrayList<Integer>(size); // ArrayList so get() is fast
        for (int i=0; i<size; ++i)
            list.add((int)(Math.random()*size));

        System.out.println("Unsorted:");
        printList(list);

        long starttime = System.nanoTime();
        mergeSort(list);
        long endtime = System.nanoTime();
        float elapsed = (endtime-starttime)/1e9f; // convert nanoseconds to seconds
        checkSort(list);
        
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        System.out.println("Sort time: " + formatter.format(elapsed) + " seconds");

        System.out.println("\nSorted:");
        printList(list);
    }
}