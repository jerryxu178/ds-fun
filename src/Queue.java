public class Queue {
	public QNode front;
	public QNode back;
	public void enQ(int num) {
		QNode add = new QNode(num);
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
	public void print_Q() {
		QNode ptr = this.front;
		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	/**public static void main(String[] args) {
		Queue myQ = new Queue();
		myQ.enQ(3);
		myQ.enQ(1);
		myQ.enQ(7);
		myQ.deQ();
		myQ.print_Q();
		
	}**/
}

class QNode{
	public int data;
	public QNode next;
	public QNode(int num) {
		this.data = num;
	}
}