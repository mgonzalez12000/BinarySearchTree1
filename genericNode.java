package bst1;

//Create the generic Node < T extends Comparable <T>> class, an add() method that takes a T as its parameter
public class genericNode <T extends Comparable <T>> {
	//Create root
	public BST<T> root;
	
	//add() that takes a T as it's parameter, creates a node, and adds it to the tree in the correct position
	public void add (T element) {
		//Create new node and initialize
		BST<T> newNode = new BST<T>(element);
		if(root == null) {
			root = newNode;
		}
		//Else if it is not, create another node
		else {
			//set root as this node because we will start with root as we traverse
			BST<T> Node = root; 
			BST<T> parent; 
			
			while (true) {
				//set parent to our focus node
				parent = Node;
				//Check if new node should go on the left side or right side of parent
				if(element.compareTo(parent.element)<0) {
					//change focusNode to the left child
					Node = Node.left;
					//if the left child has no children
					if(Node == null) {
						//place new node on the left of it
						parent.left = newNode;
						return;
					}
				} else {
					//put node on the right
					Node = Node.right;
					//if the right child has no children
					if (Node == null) {
						//place new node on the right of it
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	/* get(T element) method that takes a data value and, 
	 * if the data value is found in the tree, returns a 
	 * reference to a Node, else returns null, */

	public BST<T> get(T element) {
		BST<T> otherNode = root;

		while (otherNode.element != element) {
			if (element.compareTo(otherNode.element)<0){
				otherNode = otherNode.left;
			}
			else {
				otherNode = otherNode.right;
			}
		}
		return null;
	}
	
	//inOrder traversal
	public void inOrder() {
		showAll(root);
	}

	/* showAll(), which should use inorder traversal to print 
	 * the toString() of each data value in the tree (note 
	 * that this will print the data values in order from least 
	 * to greatest.) */
	
	public void showAll(BST<T> node) {

		if (node == null) {
			return;
		}
		
		showAll(node.left);
		System.out.print(node.element + " ");
		showAll(node.right);

	}
}