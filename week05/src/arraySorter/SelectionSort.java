package arraySorter;

public class SelectionSort<T extends Comparable<T>> extends ArraySortTool<T> {

	@Override
	public void sort(T[] doSelectionSort) {
		// the whole list is unsorted
		for (int lastUnsorted = 0;  
				// stop when the whole list is sorted
				lastUnsorted < doSelectionSort.length; 
				lastUnsorted++) {
			// the largest element is the last unsorted element
			int indexOfLargest = lastUnsorted;
			// start comparing the first two elements
			for (int nextToCompare = lastUnsorted+1; 
					// stop at the end of the unsorted portion
					nextToCompare < doSelectionSort.length; 
					nextToCompare++) {
				if (doSelectionSort[nextToCompare].compareTo(doSelectionSort[indexOfLargest]) > 0) 
				{
					// the largest element is the element to be compared
					indexOfLargest = nextToCompare;
				}
			}

			// Creating a swap 
			// the biggest number is the index of the largest value
			T biggestNumber = doSelectionSort[indexOfLargest];
			//the largest value is the last value to be sorted
			doSelectionSort[indexOfLargest] = doSelectionSort[lastUnsorted];
			//the last value to be sorted is the biggest value
			doSelectionSort[lastUnsorted] = biggestNumber;

		}

	}
}



