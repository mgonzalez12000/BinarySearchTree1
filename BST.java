package bst1;

public class BST<T extends Comparable<T>> {
    T element;
    public BST<T> left;
    public BST<T> right;

    public BST(T o){
        this.element = o;
    }
}
