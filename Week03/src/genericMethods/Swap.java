package genericMethods;

import java.util.Arrays;

/*
 *This is a generic method to exchange two elements of an array. The method
 *takes an array, and two integer indices into the array, and swap the
 *two entries in the array at those indices.
 * 
 * @author Mamadu Balde
 * @version October 2016
 */

public class Swap {

	public <S> void swap(S[] a, int i, int b){

		// get the value i from s
		// assign the value i to value b
		// store both value in s
		S s = a[i];
		a[i] = a[b];
		a[b] = s;
	}

	public static void main(String[] args){

		// values of the array 
		Integer[] ints = {0,1,2,3,4,5,6};

		// Creating new Swap
		// calling the two integers to be swapped 
		// print out the array after the swap has been made 
		Swap s = new Swap();				
		System.out.println("Array is: " + Arrays.toString(ints));
		s.swap(ints, 2, 5);
		System.out.println("Array is: " + Arrays.toString(ints));
	}

}

			




