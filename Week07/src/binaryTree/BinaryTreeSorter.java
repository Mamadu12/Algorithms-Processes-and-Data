package binaryTree;

public class BinaryTreeSorter {

	private static synchronized void print(String value) {
		System.out.print(value + ", ");
	}

	public static <T extends Comparable<T>> void preOrder(BTree<T> tree) {
		if (tree.getTreeNode() == null) return;

		preOrder(tree.left());
		preOrder(tree.right());
		print(tree.value().toString());
	}

	public static <T extends Comparable<T>> void postOrder(BTree<T> tree) {
		if (tree.getTreeNode() == null) return;

		postOrder(tree.left());
		postOrder(tree.right());
		print(tree.value().toString());
	}

	public static <T extends Comparable<T>> void inOrder(BTree<T> tree) {
		if (tree.getTreeNode() == null) return;

		inOrder(tree.left());
		inOrder(tree.right());
		print(tree.value().toString());
	}
}