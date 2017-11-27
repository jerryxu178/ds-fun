public class Stack {
	public sNode top;
	public void spush(int num){
		sNode ntop = new sNode(num);
		ntop.next = this.top;
		this.top = ntop;
	}
	public void spop() {
		this.top = this.top.next;
	}
	
	public void print_stack() {
		sNode n = this.top;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void enQ(int num) {
		;
	}
	
	public void deQ() {
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

class sNode{
	public int data;
	public sNode next;
	public sNode(int num) {
		this.data = num;
	}
}