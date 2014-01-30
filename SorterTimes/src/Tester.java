import java.util.Arrays;

public class Tester {
	public static void main(String args[]){
	
		System.out.println("Size, Bubblesort, Quicksort");
		for (int size=1000; size<=50000; size += 1000){
			System.out.print(""+size+",");
			int[] numbers= new int[size];
			for (int i = 0; i < size; i++){
				numbers[i] =(int)(Math.random()*1000000f);
			}			
			int[] array1 = new int[size];
			array1 = numbers.clone();
			
			long starttime = System.nanoTime();
			Sorters.bubbleSort(numbers);
			long bubbletime = System.nanoTime()-starttime;
	
			starttime = 0;
			starttime = System.nanoTime();
			Sorters.quickSort(array1);
			long quicktime = System.nanoTime()-starttime;
			
			System.out.println(" "+bubbletime/1000000000f+ ", "+quicktime/1000000000f+"");
		}
	}
}