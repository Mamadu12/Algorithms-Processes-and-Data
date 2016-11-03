package intArrays;

import java.util.Arrays;
import java.util.Random;

import Search.IndexingError;

/*
 * An extension of RandomCount;
 * This class is implements better solution in sorting algorithms.
 * 
 * @author Mamadu Balde
 * @version October 2016
 */

public class CleverRandomListing extends RandomListing {

	public CleverRandomListing(int size) 
	{
		super(size);

	}

	@Override
	protected void randomise() {
		{
			// copy an array of ints into a new array

			int[] copy = new int[getArray().length];

			// check if the int i is equal or less than the array length
			// increment i and copy i
			for(int i = 0; i < getArray().length; i++){
				copy[i] = i;
			}

			// Creating new random Generator
			Random rand = new Random();
			for(int j = getArray().length - 1; j > 0; j--){
				int index = rand.nextInt(j + 1);

				int a = copy[index];
				copy[index] = copy[j];
				copy[j] = a;
			}

			for(int l = 0; l < copy.length; l++){
				getArray()[l] = copy[l];
			}
		}
	}


	public static void main(String[] args) throws IndexingError {

		// values to be displayed in a random order
		RandomListing count = new CleverRandomListing(20);

		// print out the sorted array in a random way
		System.out.println(Arrays.toString(count.getArray()));

		// print the time in microseconds
		System.out.println("It took " + count.time() + " microseconds");
	}
}
