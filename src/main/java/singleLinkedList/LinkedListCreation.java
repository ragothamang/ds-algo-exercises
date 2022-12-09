package singleLinkedList;

public class LinkedListCreation {
	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList(1);
		LinkedList node1 = new LinkedList(2);
		LinkedList node2 = new LinkedList(3);
		LinkedList node3 = new LinkedList(4);
		
		list.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		while(list!=null) {
			System.out.println("Node "+ list + " value  "+ list.value+"  next  "+ list.next);
			list = list.next;
		}
	}

}
