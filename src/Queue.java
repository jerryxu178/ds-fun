public class Queue {
	public qNode front;
	public qNode back;
	public void enQ(int num) {
		qNode add = new qNode(num);
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
	
	public void qPush(int num) {
		;
	}
	
	public void qPop() {
		;
	}

	
	public void print_Q() {
		qNode ptr = this.front;
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
		myQ.deQ();
		myQ.print_Q();
		
	}
}

class qNode{
	public int data;
	public qNode next;
	public qNode(int num) {
		this.data = num;
	}
}