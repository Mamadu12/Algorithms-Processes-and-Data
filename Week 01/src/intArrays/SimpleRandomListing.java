package intArrays;

import java.util.Arrays; // in order to be able to use the fill(...) method

import Search.IndexingError;
/**
 * An extension of RandomCount
 * 
 * @author Hugh Osborne
 * @version September 2016
 */
public class SimpleRandomListing extends RandomListing
{
    /**
     * Constructor
     */
    public SimpleRandomListing(int size) {
        super(size);
    }
    
    /**
     * Randomise the array
     */
    protected void randomise() {
        int[] copy = new int[getArray().length];
        
        // used to indicate if elements have been used
        boolean[] used = new boolean[getArray().length];
        Arrays.fill(used,false);
        
        //while the index is equal to 0 or less than the size of the array 
        //copy the random value to the randomIndex
        
        for (int index = 0; index < getArray().length; index++) {
        	int randomIndex;
        	do {
                randomIndex = getRandomIndex();
            } while (used[randomIndex]);
            copy[index] = getArray()[randomIndex];
            used[randomIndex] = true;
        }
        
        for (int index = 0; index < getArray().length; index++) {
            getArray()[index] = copy[index];
        }
    }
    
    
    
    public static void main(String[] args) throws IndexingError {
    	RandomListing count = new SimpleRandomListing(20);
    	
    	System.out.println(Arrays.toString(count.getArray()));
    	System.out.println("It took " + count.time() + " microseconds");
    }

} // End of class SimpleRandomCount