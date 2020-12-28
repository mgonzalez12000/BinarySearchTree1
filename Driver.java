package bst1;

public class Driver {

	/* Write a driver class with a main() that adds some values 
	 * to the BST and then uses the showAll() to print out the 
	 * values from the tree, and calls the inorder() method.*/
	
	public static void main(String[] args) {
		genericNode <Integer>tree = new genericNode<>();
		tree.add(24);
		tree.add(99);
		tree.add(12);
		tree.add(54);
		tree.add(100);
		tree.add(78);

		//calls the inorder()
		System.out.println("In Order traversal: ");
		tree.inOrder();
	}

}