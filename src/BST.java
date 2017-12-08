import java.util.*;

public class BST {
	public static TreeNode root;
	public BST() {
		this.root = null;
	}
	
	public ArrayList<Integer> inorder_traversal() {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<TreeNode> myQ = new ArrayList<TreeNode>();
		if (this.root == null) {
			return ans;
		}
		myQ.add(this.root);
		while(myQ.size() != 0) {
			;
		}
		
		
		
		return mylist;
		
		
		
	}
	/*public static void main(String[] args) {
		TNode n = new TNode(3);
		System.out.println(n);
	}*/
	
	
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		this.val = data;
		this.left = null;
		this.right = null;
	}
}