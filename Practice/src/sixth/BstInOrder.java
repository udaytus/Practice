package sixth;

public class BstInOrder {
//left-root-right
	private void inorder(Treenode node) {
	if (node==null) {
		return;
	}
	inorder(node.left);
	System.out.printf("%s",node.data);
	inorder(node.right);
}
	public void inorder() {
		inorder(root);
	}
}
