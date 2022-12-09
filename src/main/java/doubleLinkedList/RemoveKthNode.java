package doubleLinkedList;

public class RemoveKthNode {

	public static void removeKthNodeFromEnd(LinkedList head, int k) {
		if(k ==1 ){
			LinkedList temp = head;
			LinkedList previous = head;

			while(temp.next != null){
				previous = temp;
				temp = temp.next;
			}
			previous.next = null;
			return;
		}

		int count = 1;
		LinkedList slow = head;
		LinkedList fast = head;
		while (count < k){
			count++;
			fast = fast.next;
			System.out.println("fast value "+ fast.value);
		}
		while(fast.next != null){
			slow = slow.next;
			fast = fast.next;
		}
		while(slow != fast){
			slow.value = slow.next.value;
//			slow.next = slow.next.next;
			if(slow.next == fast){
				slow.next = null;
				break;
			}
			slow = slow.next;
		}
		return;
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
		LinkedList lst = new LinkedList(0);
		LinkedList lst1 = new LinkedList(1);
		LinkedList lst2= new LinkedList(2);
		LinkedList lst3 = new LinkedList(3);
		LinkedList lst4 = new LinkedList(4);
		LinkedList lst5 = new LinkedList(5);
		LinkedList lst6 = new LinkedList(6);
		LinkedList lst7 = new LinkedList(7);
		LinkedList lst8 = new LinkedList(8);
		LinkedList lst9 = new LinkedList(9);
		lst.next = lst1;
		lst1.next = lst2;
		lst2.next = lst3;
		lst3.next = lst4;
		lst4.next = lst5;
		lst5.next = lst6;
		lst6.next = lst7;
		lst7.next = lst8;
		lst8.next = lst9;

		removeKthNodeFromEnd(lst, 1);
		//				removeKthNodeFromEnd(lst, 10);
		//		removeKthNodeFromEnd(lst, 7);

		//		removeKthNodeFromEnd(lst, 10);
		//		removeKthNodeFromEnd(lst, 1);


		System.out.println("list 1st node   "+ lst);
		while(lst != null) {
			System.out.println(lst.value+"        "+lst);
			lst = lst.next;
		}
	}

}
