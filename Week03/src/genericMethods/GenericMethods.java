package genericMethods;

public class GenericMethods {	
	/**
	 * Check if two objects are equal
	 * @param object1 the first object
	 * @param object2 the second object
	 * @return true if the objects are equal (according to the equals() method)
	 */
	public <T> boolean equals(T object1,T object2) {
		return object1.equals(object2);
	}
}
