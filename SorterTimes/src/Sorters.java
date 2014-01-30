// William Ames Spring 2010
// A couple of methods for sorting integer arrays

public class Sorters {

	// BubbleSort
	public static void bubbleSort(int[] array) {
		boolean exchanged = true;

		while (exchanged) { // First pass, or we made changes previous pass
			exchanged = false;
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i+1]) {
					swap(array, i, i+1);
					exchanged  = true; //exchange was made
				}
			}
		}
	}
	
	// Quicksort.  This is the public method you'll call to do sorting.
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
	}
	
	// Handy method for printing the content of an array
	public static void printArray(int[] array) {
		for (int i:array)
			System.out.print(i + " ");
		System.out.println();
	}
	
	// QuickSort algorithm itself, called by the public method
	private static void quickSort(int array[], int left, int right) {
		int pivot;  // the final location of the leftmost value
		if (left >= right) return;
		pivot = partition(array, left, right);
		quickSort(array, left, pivot-1);
		quickSort(array, pivot+1, right);
	}

	// Helper method, used by both Bubblesort and Quicksort
	// Swap the data at indices i and j of the data array
	private static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	// Helper method used by Quicksort
	private static int partition(int array[], int left, int right) {
		while (true) {
			// move right index toward left
			while (left<right && array[left]<array[right])
				right--;
			if (left<right)
				swap(array, left++, right);
			else
				return left;

			// move left index toward right
			while (left<right && array[left]<array[right])
				left++;
			if (left<right)
				swap(array, left, right--);
			else return right;
		}
	}
}