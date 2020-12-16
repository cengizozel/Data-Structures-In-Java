public class BinaryTree {
	
	class BTreeNode {
		BTreeNode left;
		BTreeNode right;
		int data;
		
		public BTreeNode(int data) {
			this.data = data;
		}
	}
	
	BTreeNode root;
	
	public void createBinaryTree() {
		BTreeNode first = new BTreeNode(1);
		BTreeNode second = new BTreeNode(2);
		BTreeNode third = new BTreeNode(3);
		BTreeNode fourth = new BTreeNode(4);
		BTreeNode fifth = new BTreeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
	}
	
	public void preOrder(BTreeNode root) {
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void inOrder(BTreeNode root) {
		if(root == null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public void postOrder(BTreeNode root) {
		if(root == null) {
			return;
		}
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}	
	
	void levelOrder(BTreeNode root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);
        }
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(BTreeNode root)
    {
        if (root == null)
           return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left); // The method for counting: Once false is return, it keeps incrementing until we get back to the root.
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight) {
                return(lheight+1);
            }
            else {
            	return(rheight+1); 
            }
        }
    }
    
    void printGivenLevel (BTreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        }
        else if (level > 1) {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    
}
