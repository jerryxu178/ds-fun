public class Queue {
	public xNode front;
	public xNode back;
	public void enQ(int num) {
		xNode add = new xNode(num);
		if (this.back == null) {
			if(this.front == null) {
				this.front = add;
			}
			else {
				this.front.next = add;
				this.back = add;
			}
		}
		else {
			this.back.next = add;
			this.back = this.back.next;
		}
	}
	public void deQ() {
		if (this.front == null) {
			this.back = null;
		}
		else {
			int old = front.data;
			front = front.next;
			//System.out.println(old);
		}
	}
	
	public void enQx(int num) {
		Stack myS = new Stack();
	}

	
	public void print_Q() {
		xNode ptr = this.front;
		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	public void queue_with_stack(){
		;
	}
	public static void main(String[] args) {
		Queue myQ = new Queue();
		myQ.enQ(3);
		myQ.enQ(1);
		myQ.enQ(7);
		myQ.deQ();
		myQ.print_Q();
		
	}
}

class xNode{
	public int data;
	public xNode next;
	public xNode(int num) {
		this.data = num;
	}
}