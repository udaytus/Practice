package sixth;

public class BinaryPreOrder {
//	class BinaryTree {
//		  static class TreeNode {
//		    String data;
//		    TreeNode left, right;
//
//		    TreeNode(String value) {
//		      this.data = value;
//		      left = right = null;
//		    }
//
//		    boolean isLeaf() {
//		      return left == null ? right == null : false;
//		    }
//
//		  }	

	
	//root-left-right
	public void Preoder(Treenode node) {
		Stack<TreeNode> nodes = new Stack<>();
	    nodes.push(root);

	    while (!nodes.isEmpty()) {
	      TreeNode current = nodes.pop();
	      System.out.printf("%s ", current.data);

	      if (current.right != null) {
	        nodes.push(current.right);
	      }
	      if (current.left != null) {
	        nodes.push(current.left);
	      }
	    }
	}
}	
