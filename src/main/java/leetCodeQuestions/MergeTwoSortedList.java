package leetCodeQuestions;


//  Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) 
	{ 
		this.val = val; 
		this.next = next; 
	}
}


public class MergeTwoSortedList {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		 ListNode preHead = new ListNode(0);
		    ListNode last = preHead;
		    
		    while(list1 != null && list2 != null) {
		        if(list1.val > list2.val) {
		            last.next = list2;
		            list2 = list2.next;
		        } else {
		            last.next = list1;
		            list1 = list1.next;
		        }
		        last = last.next;
		    }
		    
		    if(list1 == null) {
		        last.next = list2;
		    } else {
		        last.next = list1;
		    }
		    
		    return preHead.next;
		
		
		// Recursive solution
		/*
		ListNode head = new ListNode(0);
        
        if(list1 == null && list2 == null) return null;  //null checking
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        if(list1.val > list2.val) { //comparing and merging
            head = list2;
            list2 = list2.next;
        }
        else {
            head = list1;
            list1 = list1.next;
        }
        
        head.next = mergeTwoLists(list1, list2);
        return head;
        */
		
//		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
