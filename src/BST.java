public class BST {
	public static TNode root;
	public BST() {
		this.root = null;
	}
	
	
	public static void main(String[] args) {
		TNode n = new TNode(3);
		System.out.println(n);
	}
	
	
}

class TNode{
	int data;
	TNode left;
	TNode right;
	public TNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}