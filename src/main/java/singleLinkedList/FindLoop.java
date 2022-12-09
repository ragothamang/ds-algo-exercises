package singleLinkedList;

public class FindLoop {

	public static LinkedList findLoop(LinkedList head) {
		// Write your code here.
		
		LinkedList fast = head;
		LinkedList slow = head;
		
		do {
			fast = fast.next.next;
			slow = slow.next;
		}while(fast!=slow);
		
		fast = head;
		while(fast!= slow) {
			fast = fast.next;
			slow = slow.next;
		}
		
		return slow;
	}

	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
