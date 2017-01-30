package graph;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class DepthFirstTraversalTest {

	private DepthFirstTraversal <Integer>traversal;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		traversal = new DepthFirstTraversal<Integer>();

		traversal.add(0); //add node
		traversal.add(1); //add node
		traversal.add(2); //add node
		traversal.add(3); //add node
		traversal.add(4); //add node
		traversal.add(5); //add node

		//nodes with connected path to another nodes
		traversal.add(0,1);
		traversal.add(0,3);
		traversal.add(1,2);
		traversal.add(2,1);
		traversal.add(2,4);
		traversal.add(2,5);
		traversal.add(3,0);
		traversal.add(4,5);
		traversal.add(5,4);

	}

	@Test
	public void test() {

		String traverseStr = null;
		try{
			traverseStr = traversal.traverse().toString();
		}catch(GraphError e){
			e.printStackTrace();
			fail(e.toString());
		}

		System.out.println("Your graph is: " + traverseStr);
	}
}

//	@SuppressWarnings("unchecked")
//	public void outputExpected() throws GraphError{
//		ArrayList tvr = new ArrayList();
//		
//		traversal.add(0);
//		traversal.add(1);
//		traversal.add(2);
//		traversal.add(3);
//		traversal.add(4); 
//		traversal.add(5);
//		
//		traversal.add(0,1);
//		traversal.add(0,3);
//		traversal.add(1,2);
//		traversal.add(2,1);
//		traversal.add(2,4);
//		traversal.add(2,5);
//		traversal.add(3,0);
//		traversal.add(4,5);
//		traversal.add(5,4);
//		
//		traversal.add(0);
//		traversal.add(1);
//		traversal.add(2);
//		traversal.add(4);
//		traversal.add(5); 
//		traversal.add(3);	
//		
//		assertEquals(traversal,((Traversal<Integer>) tvr).traverse());
//	}


