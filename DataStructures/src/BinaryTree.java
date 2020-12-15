public class BinaryTree {
	
	class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	TreeNode root;
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
	}
	
	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public void levelOrder(TreeNode root) {
		return;
	}
}
