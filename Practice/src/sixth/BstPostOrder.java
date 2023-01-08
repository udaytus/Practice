package sixth;

public class BstPostOrder {
//left-right-root
	private void postorder(TreeNode node) {
	if(node==null) {
		return;
	}
	postorder(node.left);
	postorder(node.right);
	System.out.printf("%s",node.data);
	}
	public void postorder() {
		postorder(root);
	}
}
