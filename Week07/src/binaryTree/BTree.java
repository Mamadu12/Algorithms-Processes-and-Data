package binaryTree;

public interface BTree<T extends Comparable<T>> {
	
	public void insert(T value);
	
	public T value();
	
	public BTree<T> left();
	
	public BTree<T> right();

	public void preOrder();
	
	public void postOrder();
	
	public void inOrder();
	
	public T getTreeNode();

}
