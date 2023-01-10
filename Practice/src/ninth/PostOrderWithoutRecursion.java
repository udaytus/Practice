package ninth;

import java.util.LinkedList;

public class PostOrderWithoutRecursion {
	
	private void postorder(Node head) {
		  if (head == null) {
		    return;
		  }
		  LinkedList<Node> stack = new LinkedList<Node>();
		  stack.push(head);

		  while (!stack.isEmpty()) {
		    Node next = stack.peek();

		    boolean finishedSubtrees = (next.right == head || next.left == head);
		    boolean isLeaf = (next.left == null && next.right == null);
		    if (finishedSubtrees || isLeaf) {
		      stack.pop();
		      System.out.println(next.value);
		      head = next;
		    }
		    else {
		      if (next.right != null) {
		        stack.push(next.right);
		      }
		      if (next.left != null) {
		        stack.push(next.left);
		      }
		    }
		  }
	}
}
