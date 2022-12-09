package doubleLinkedList;

import doubleLinkedList.RemoveKthNode.LinkedList;

public class RemoveNthNodeSinglePass {
	
	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}
	}
	 public static void  removeNthFromEnd(LinkedList head, int n) {
		 LinkedList fast = head, slow = head, temp = head;
	        for (int i = 0; i < n; i++) {
	        	fast = fast.next;
	        }
	        System.out.println("fast @ end of for loop "+ fast);
	        if (fast == null) {	        	
	        	head = head.next;	        	
	        	System.out.println("head>> "+ head);
	        	
	        }
	        
	        if(fast != null) {
	        	while (fast.next != null) {
		            fast = fast.next;
		            slow = slow.next;
		        }
	        	slow.next = slow.next.next;
	        }else {
	        	head.value = slow.next.value;
	        	head.next = slow.next.next;
	        	slow = null;	
	        	return;
	        }
	        System.out.println("slow>> "+ slow);
	        
	        return ;
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

		removeNthFromEnd(lst, 10);
		
		while(lst != null) {
			System.out.println(lst.value+"        "+lst);
			lst = lst.next;
		}
	}

}
