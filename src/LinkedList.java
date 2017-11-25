import java.util.*;
public class LinkedList {
	private Node head;
	public LinkedList() {
		head = null;
	}
	
	public void append_to_tail(int num) {
		Node n = new Node(num);
		Node ptr = this.head;
		if (ptr == null) {
			this.head = n;
		}
		else {
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = n;
		}
	}
	
	public void remove_dups() {
		Node ptr = this.head;
		Node prev = null;
		HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();
		while (ptr != null) {
			if(myHash.containsKey(ptr.data)) {
				prev.next = ptr.next;
			}
			else {
				myHash.put(ptr.data, 1);
				prev = ptr;
			}
			ptr = ptr.next;
		}
	}
	
	public void remove_dups_v2() {
		if (this.head == null) {
			return;
		}
		Node ptr1 = this.head.next;
		while(ptr1 != null) {
			Node ptr2 = this.head;
			Node ptr2_prev = null;
			while(ptr2 != ptr1) {
				if(ptr2.data == ptr1.data) {
					if (ptr2_prev != null) {
						ptr2_prev.next = ptr2.next;
					}
				}
				else {
					ptr2_prev = ptr2;
				}
				ptr2 = ptr2.next;
				
			}
			ptr1 = ptr1.next;
		}
	}
	
	public void remove_n_to_last(int n) {
		Node prev = null;
		Node ptr1 = this.head;
		Node ptr2 = this.head;
		for(int i = 0; i <n; i++) {
			ptr2 = ptr2.next;
		}
		while(ptr2.next != null) {
			prev = ptr1;
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		prev.next = ptr1.next;
	}
	
	public static LinkedList sum(LinkedList L1, LinkedList L2) {
		int carryover = 0;
		Node ptr1 = L1.head;
		Node ptr2 = L2.head;
		while(ptr1 != null && ptr2 != null) {
			int num = ptr1.data + ptr2.data + carryover;
			if (num > 10) {
				carryover = 1;
				num = num%10;
			}
			else {
				carryover = 0;
			}
			ptr1.data = num;
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return L1;
	}
	
	public void print_list() {
		Node ptr1 = this.head;
		while(ptr1 != null) {
			System.out.println(ptr1.data);
			ptr1 = ptr1.next;
		}
	}
	
	/**public static void main(String[] args) {
		LinkedList l = new LinkedList();
		LinkedList m = new LinkedList();
		l.append_to_tail(3);
		l.append_to_tail(1);
		l.append_to_tail(5);
		m.append_to_tail(5);
		m.append_to_tail(9);
		m.append_to_tail(2);
		LinkedList n = sum(m, l);
		n.print_list();
		
	}**/
	
}

class Node{
	public Node next;
	public int data;
	public Node(int data) {
		this.next = null;
		this.data = data;
	}
	
	public void print_list_n() {
		Node p1 = this;
		while (p1 != null) {
			System.out.println(p1.data);
			p1 = p1.next;
		}
		
	}
}