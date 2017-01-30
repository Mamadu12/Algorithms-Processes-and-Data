package binaryTree;

public class BinaryTree<T extends Comparable<T>> implements BTree<T> {
	TreeNode<T> root;

	public BinaryTree(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(T value) {
		if(root ==null){
			root = new TreeNode<T>(value);
		}else if(value.compareTo(value()) < 0){ //compare inserted 
			//numbers to current top node value
			//the side of the tree that the node is placed
			System.out.println("left tree");
			//move to the left side of the tree
			root.left().insert(value);
		}else{ //mode to right side 
			root.right().insert(value);
			//show the side of tree the node is placed
			System.out.println("right tree");
		}

	}

	@Override
	public T value() {
		System.out.println("Root is: " + root.value());
		return root.value();

	}

	@Override
	public BTree<T> left() {
		//return value going to the left
		return root.left();
	}

	@Override
	public BTree<T> right() {
		//return value going to the right
		return root.right();
	}
	public void preOrder(){
		if(root!=null){
			left().preOrder();
			right().preOrder();			
		}
	}

	public void postOrder() {
		if(root!=null){
			left().postOrder();
			right().postOrder();
		}

	}

	public void inOrder() {
		if(root!=null){
			left().inOrder();
			right().inOrder();
		}

	}

	@Override
	public T getTreeNode() {

		return null;
	}
}