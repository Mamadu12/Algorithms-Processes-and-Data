package genericMethods;
import static org.junit.Assert.*;
import org.junit.Test;
public class SwapTest{
	@Test
	public  void test()  {
		// creating new swap
		Swap tester = new Swap();
		// actual array 
		Integer [] ar = {0,1,2,3,4,5,6};
		// creating the test
		tester.swap(ar,1,4);
		// expected array
		// in order to create a negative test 
		// change the position of the numbers you are willing to test
		Integer [] ar2 = {0,4,2,3,1,5,6};
		// asserting that the int arrays are equal
		assertArrayEquals(ar2,ar);
	}
}


