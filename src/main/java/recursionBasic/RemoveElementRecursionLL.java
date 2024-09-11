package recursionBasic;

  class NodeLink {
	int val;
	NodeLink next;

	NodeLink(int val) {
		this.val = val;
	};

	NodeLink(int val, NodeLink next) {
		this.val = val;
		this.next = next;
	};
}

public class RemoveElementRecursionLL {

	public NodeLink removeElements(NodeLink head, int val) {
		
		 if (head == null) {
	            return null;
	        }

	        // Once removeElements call is done, right side of the list is solved.
		 NodeLink rightSideHead = removeElements(head.next, val);
	        if (head.val == val) {
	            return rightSideHead;
	        }
	        head.next = rightSideHead;
	        return head;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveElementRecursionLL ll = new RemoveElementRecursionLL();
		NodeLink head = new NodeLink(1);
		NodeLink link1 = new NodeLink(2);
		NodeLink link2 = new NodeLink(6);
		NodeLink link3 = new NodeLink(3);
		NodeLink link4 = new NodeLink(4);
		NodeLink link5 = new NodeLink(5);
		NodeLink link6 = new NodeLink(6);
		
		head.next = link1;
		link1.next = link2;
		link2.next = link3;
		link3.next = link4;
		link4.next = link5;
		link5.next = link6;
		
		System.out.println(link1.next);
		while(head!=null) {
			  System.out.print(head.val+","); 
			  head = head.next; 
			  }

		NodeLink head1 = ll.removeElements(head, 6);

		System.out.println("--------------------------");
		  while(head1!=null) {
			  System.out.print(head1.val+","); 
			  head1 = head1.next; 
			  }
		 
	}

}
