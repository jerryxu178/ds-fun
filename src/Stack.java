public class Stack {
	public xNode top;
	public void spush(int num){
		xNode ntop = new xNode(num);
		ntop.next = this.top;
		this.top = ntop;
	}
	public void spop() {
		this.top = this.top.next;
	}
	
	public void print_stack() {
		xNode n = this.top;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void stack_with_queue() {
		;
	}
	/**public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.spush(3);
		myStack.spush(5);
		myStack.spush(7);
		myStack.spop();
		myStack.print_stack();
	}**/
}

/**class xNode{
	public int data;
	public xNode next;
	public xNode(int num) {
		this.data = num;
	}
}**/