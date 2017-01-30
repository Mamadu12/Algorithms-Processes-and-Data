package binaryTree;

public class BinaryTreeTest{

	public static void main(String[] args){
		BinaryTree<Integer> bTree = new BinaryTree<Integer>(1);	
		bTree.insert(5); //inserting nodes
		bTree.insert(9);
		bTree.insert(4);
		bTree.insert(25);
		bTree.insert(1);
		bTree.insert(0);
		bTree.preOrder();

	}
		
}