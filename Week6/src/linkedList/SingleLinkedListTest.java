package linkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingleLinkedListTest {

	public static void main (String [] args){

		SingleLinkedList<Integer> linkList = new SingleLinkedList<>();
		try {
			linkList.add(0, 11);
			linkList.add(1, 50);
			linkList.add(2, 7);

			System.out.println("Your list is: " + linkList.get(4));
		} catch (ListAccessError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
