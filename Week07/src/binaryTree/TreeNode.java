package binaryTree;

public class TreeNode<T extends Comparable<T>> {
	T value;
	BTree<T> left, right;

	public TreeNode(T value) {
		this.value = value;
		System.out.println(value());
		left = new BinaryTree<T>(0);
		right = new BinaryTree<T>(0);

	}

	public T value() {
		return value;
	}

	public BTree<T> left() {
		return left;
	}

	public BTree<T> right() {
		return right;
	}

}
