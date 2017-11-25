public class Stack {
	public SNode top;
	public void push(int num){
		SNode ntop = new SNode(num);
		ntop.next = this.top;
		this.top = ntop;
	}
	public void pop() {
		this.top = this.top.next;
	}
	
	public void print_stack() {
		SNode n = this.top;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	/**public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push(3);
		myStack.push(5);
		myStack.push(7);
		myStack.pop();
		myStack.print_stack();
	}**/
}

class SNode{
	public int data;
	public SNode next;
	public SNode(int num) {
		this.data = num;
	}
}