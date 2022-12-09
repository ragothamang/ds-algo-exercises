package doubleLinkedList;



class Node{
	int value;
	Node prev;
	Node next;
}

public class DoubleLinkedListBasic {
	public Node head;
	public Node tail;

	public void setHead(Node node) {
		// Write your code here.
		if(head != null) {			
			head.prev = node;
			node.next = head;
			node.prev = null;
		}else {
			head = node;		
		}		
	}

	public void setTail(Node node) {
		// Write your code here.
		if(tail != null) {
			node.prev = tail;
			tail.next = node;							
		}else {			
			head.next = node;
			node.prev = head;
			tail = node;
		}		
	}

	public void insertBefore(Node node, Node nodeToInsert) {
		// Write your code here.
		System.out.println("node value-> "+ node.value);
		System.out.println("node -> "+ node);
		//		System.out.println("node prev.next -> "+ node.prev.next);
		Node pointerNode = tail;
		Node tempNode = head;
		System.out.println("node  -> "+ node);
		System.out.println("tail -> "+ tail);
		//		System.out.println("pointerNode nex -> "+ pointerNode.next);

		while(pointerNode.prev != null) {
			if(node == head) {
				nodeToInsert.next = head;
				head.prev = nodeToInsert;
				head = nodeToInsert;
				head.prev = null;
				break;
			}
			else if(node == tail){
				tail.next = nodeToInsert;
				nodeToInsert.prev = tail;
				tail = nodeToInsert;
				tail.next = null;
				break;
			}else if(pointerNode == node){
				node.prev.next = nodeToInsert;
				nodeToInsert.prev = node.prev;
				nodeToInsert.next = node;
				node.prev = nodeToInsert;			
				break;
			}else {
				pointerNode = pointerNode.prev;
			}		
		}
		Node forwardNode = head;
		System.out.println("******  Double Linked list Head to Tail insertBefore****** ");
		while(forwardNode!= null) {
			System.out.println(forwardNode.value);
			forwardNode = forwardNode.next;
			}
		System.out.println("************ ");
	}

	public void insertAfter(Node node, Node nodeToInsert) {
		// Write your code here.
		System.out.println("Insert After ****");
		//		Node pointerNode = tail;
		Node tempNode = head;
		while(tempNode.next != null) {
			if(node == head) {				
				head.next.prev = nodeToInsert;
				nodeToInsert.prev = head;
				nodeToInsert.next = head.next;
				head.next = nodeToInsert;				
				head.prev = null;				
				break;
			}
			else if(node == tail) {
				System.out.println("inserted after tail  -->  "+ node);
				nodeToInsert.prev = tail;			
				tail.next = nodeToInsert;
				tail = nodeToInsert;
				//				tail.next = null;
				break;
			}				
			else if(tempNode.value == node.value) {
				tempNode.next.prev = nodeToInsert;
				nodeToInsert.prev = tempNode;
				nodeToInsert.next = tempNode.next;
				tempNode.next = nodeToInsert;			
				break;
			}else {
				tempNode = tempNode.next;
			}
		}
		System.out.println("head next    >> "+ head.next);
		System.out.println("nodeToInsert >> "+ nodeToInsert);
		System.out.println("node.prev >> "+ nodeToInsert.prev);
		System.out.println("node.value >> "+ nodeToInsert.value);
		System.out.println("node.next >> "+ nodeToInsert.next);
		Node backwardNode = tail;
		
		System.out.println("******  Double Linked list Tail to Head  inside insertafter ****** ");
		while(backwardNode!= null) {
			System.out.println(backwardNode.value);
			backwardNode = backwardNode.prev;

		}
		System.out.println("************ ");
	}

	public void insertAtPosition(int position, Node nodeToInsert) {
		// Write your code here.
		Node tempNode = head;
		int listPosition = 1;
		while(tempNode != null) {
			System.out.println(tempNode.value);
			if(listPosition == position) {				
				if(tempNode.prev == null) {
					nodeToInsert.next = head;
					head.prev = nodeToInsert;
					head = nodeToInsert;
					break;
				}
				else if(tempNode.next == null){
					nodeToInsert.prev = tail.prev;
					nodeToInsert.next = tail;
					tail.prev.next = nodeToInsert;
					break;
				}
				else{
					nodeToInsert.prev = tempNode.prev;
					nodeToInsert.next = tempNode;
					tempNode.prev.next = nodeToInsert;
					break;
				}

			}else {
				tempNode = tempNode.next;			
			}
			listPosition++;
		}
		System.out.println("curr pos  >  "+listPosition);
	}

	public void removeNodesWithValue(int value) {
		// Write your code here.
		Node temp = head;
		boolean ispresent = false;
		while(temp != null) {
			if(value == head.value) {
				head = temp.next;
				temp = null;
				head.prev = null;
				temp = head;
			}else if(value == tail.value) {
				tail = temp.prev;
				temp = null;
				tail.next = null;
				break;
			}
			else if(temp.value == value) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				break;
			}	
			else {
				temp = temp.next;	
			}

		}
	}

	public void remove(Node node) {
		// Write your code here.
		Node temp = head;
		boolean ispresent = false;
		while(temp.next != null) {
			if(node == head) {
				head = node.next;
				node = null;
				head.prev = null;
				break;
			}else if(node == tail) {
				tail = node.prev;
				node = null;
				tail.next = null;
				break;
			}
			else if(temp.value == node.value) {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				break;
			}	
			else {
				temp = temp.next;	
			}

		}

	}

	public boolean containsNodeWithValue(int value) {
		// Write your code here.
		Node temp = head;
		boolean ispresent = false;
		while(temp.next != null) {
			if(temp.value == value) {
				ispresent = true;
				break;
			}else {
				temp = temp.next;	
			}			
		}
		return ispresent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedListBasic ddList = new DoubleLinkedListBasic();
		Node n1 = new Node();
		n1.value = 1;
		Node n3 = new Node();
		n3.value = 3;
		Node n4 = new Node();
		n4.value = 4;
		Node n2 = new Node();
		n2.value = 2;
		Node n5 = new Node();
		n5.value = 5;
		Node n6 = new Node();
		n6.value = 6;
		Node n6d1 = new Node();
		n6d1.value = 6;
		Node n6d2 = new Node();
		n6d2.value = 6;
		Node n0 = new Node();
		n0.value = 0;
		
		ddList.setHead(n1);
		ddList.setTail(n4);

//		ddList.insertAfter(n1, n3);
//		ddList.insertAfter(n3, n5);
//		ddList.insertAfter(n1, n6);
		
		ddList.insertBefore(n1, n3);
		ddList.insertBefore(n3, n5);
		ddList.insertBefore(n5, n6);
		ddList.insertBefore(n5, n6d1);
		ddList.insertBefore(n3, n6d2);
		


//						ddList.insertBefore(n4, n3);
//						ddList.insertBefore(n3, n2);
		//		ddList.insertBefore(n3, n0);
		//		ddList.insertBefore(n3, n22);
		//		ddList.insertBefore(n2, n22);
		//		ddList.insertBefore(n1, n22);

		//		
		//		ddList.insertBefore(n2, n22);
		//		ddList.insertBefore(n1, n22);
		//		

		//		ddList.insertAtPosition(1, n22);
		//
		//		ddList.insertAtPosition(2, n23);
		//		ddList.insertAtPosition(2, n5);

				ddList.remove(n3);
//				ddList.removeNodesWithValue(6);
				ddList.insertAtPosition(5, n0);
		//		ddList.insertAtPosition(1, n23);


		//		System.out.println( "contains "  + ddList.containsNodeWithValue(23) );
		System.out.println("Head -> "+ ddList.head);
		System.out.println("Tail -> "+ ddList.tail);


		//		System.out.println(ddList.head.value);
		Node backwardNode = ddList.tail;
		Node forwardNode = ddList.head;
		System.out.println("******  Double Linked list Tail to Head****** ");
		while(backwardNode!= null) {
			System.out.println(backwardNode.value);
			backwardNode = backwardNode.prev;

		}

		System.out.println("******  Double Linked list Head to Tail ****** ");
		while(forwardNode!= null) {
			System.out.println(forwardNode.value);
			forwardNode = forwardNode.next;

		}
	}

}
