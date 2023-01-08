package sixth;

import java.util.Stack;

public class ImplementBinaryTree {
//	getroot()-return root;
//	isempty-check if bst is empty;
//	size()-to number of nodes;
//	clear()-clear the bst;
private static class Node{
	private int data;
	private Node left,right;
	
	public Node(int value) {
		data =value;
		left=right=null;
	}	
}
private Node root;

public ImplementBinaryTree() {
	root=null;
}
public Node getRoot() {
	return root;
}
public boolean isEmpty() {
	return null==root;
}
public int size() {
	Node current=root;
	int size=0;
	Stack<Node> stack = new Stack<>();
	while (!stack.isEmpty()|| current!=null) {
		if(current != null) {
			stack.push(current);
			current=current.left;}
			else size++;
			current=stack.pop();
			current=current.right;
			}
	return size;
		}
public void clear() {
	root=null;
}
	}


