package doubleLinkedList;

import doubleLinkedList.RemoveKthNode.LinkedList;


public class SumLinkedList {
	public static class LinkedList {
		public int value;
		public LinkedList next;

		public LinkedList(int value) {
			this.value = value;
			this.next = null;
		}
	}
	public static LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
		// Write your code here.
		LinkedList finalList = new LinkedList(0);
		LinkedList head = finalList;
		int rem = 0;

		System.out.println("linkedListOne"+ "   "+ linkedListOne);
		System.out.println("linkedListTwo"+ "   "+ linkedListTwo);

		if(linkedListOne.next== null && linkedListTwo.next== null) {
			if((linkedListOne.value + linkedListTwo.value)>= 10) {
				finalList.next = new LinkedList(((linkedListOne.value + linkedListTwo.value)%10));
				finalList.next.next = new LinkedList(1);
			}else {
				finalList.next = new LinkedList(((linkedListOne.value + linkedListTwo.value)));
			}
		}else {
			while(linkedListOne != null || linkedListTwo != null) {			

				if(linkedListOne == null && linkedListTwo != null) {
					System.out.println("exp value linkedListTwo rem --> "+ rem);
					System.out.println("exp value linkedListTwo --> "+ ((linkedListTwo.value)+rem));
					finalList.next = new LinkedList(linkedListTwo.value + rem );
					//					finalList.value = linkedListTwo.value;
					linkedListTwo = linkedListTwo.next;
					rem = 0;
				}else if(linkedListOne != null && linkedListTwo == null) {
					System.out.println("exp value linkedListOne rem --> "+ rem);
					System.out.println("exp value linkedListOne --> "+ ((linkedListOne.value )+rem));
					finalList.next = new LinkedList(linkedListOne.value + rem );
					//					finalList.value = linkedListOne.value;
					linkedListOne = linkedListOne.next;
					rem = 0;
				}else {
					System.out.println("mod --> "+ (linkedListOne.value + linkedListTwo.value)%10);
					System.out.println("quotent --> "+ (linkedListOne.value + linkedListTwo.value)/10);

					if((linkedListOne.value + linkedListTwo.value+rem)==10) {

						System.out.println("exp value add is 10  --> "+ 0);
						if(linkedListOne.next == null && linkedListTwo.next == null && (linkedListOne.value + linkedListTwo.value+rem)>=10) {
							finalList.next = new LinkedList((linkedListOne.value + linkedListTwo.value)%10);
							finalList.next.next = new LinkedList((linkedListOne.value + linkedListTwo.value)/10);
						}else {
							finalList.next = new LinkedList((linkedListOne.value + linkedListTwo.value+rem)%10);
							rem = (linkedListOne.value + linkedListTwo.value+rem)/10;	
						}

					}else if((linkedListOne.value + linkedListTwo.value+rem)>10) {
						System.out.println("exp gret value --> "+ ((linkedListOne.value + linkedListTwo.value+rem)%10));
						if(linkedListOne.next == null && linkedListTwo.next == null && (linkedListOne.value + linkedListTwo.value+rem)>=10) {
							finalList.next = new LinkedList((linkedListOne.value + linkedListTwo.value+rem)%10);
							finalList.next.next = new LinkedList((linkedListOne.value + linkedListTwo.value+rem)/10);
						}else {
							finalList.next = new LinkedList((linkedListOne.value + linkedListTwo.value+rem)%10);
							rem = (linkedListOne.value + linkedListTwo.value+rem)/10;	
						}
					}else {
						//						System.out.println("exp value rem --> "+ rem);
						System.out.println("exp value --> "+ ((linkedListOne.value + linkedListTwo.value)+rem));
						finalList.next = new LinkedList(((linkedListOne.value + linkedListTwo.value)+rem));
						rem =0;
					}
					//					finalList.next = new LinkedList(linkedListOne.value + linkedListTwo.value);
					//					rem = (linkedListOne.value + linkedListTwo.value)/10;
					//					finalList.value = linkedListOne.value + linkedListTwo.value;
					linkedListOne = linkedListOne.next;
					linkedListTwo = linkedListTwo.next;
				}
								finalList = finalList.next;	
/*
				if(linkedListOne == null && linkedListTwo == null) {
					if(rem==1) {

					}
					finalList.next = new LinkedList(0);
					finalList.next.next = new LinkedList(1);
				}else {
					finalList = finalList.next;	
				}
*/
				System.out.println("fv--> "+ finalList.value);
			}


		}

		finalList = head.next;
		return finalList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList lst = new LinkedList(1);
		LinkedList lst1 = new LinkedList(2);
		LinkedList lst2= new LinkedList(3);
		//		LinkedList lst3 = new LinkedList(5);
		//		LinkedList lst4 = new LinkedList(4);
		//		LinkedList lst5 = new LinkedList(5);
		//		LinkedList lst6 = new LinkedList(6);
		//		LinkedList lst7 = new LinkedList(7);
		//		LinkedList lst8 = new LinkedList(8);
		//		LinkedList lst9 = new LinkedList(9);
		lst.next = lst1;
		lst1.next = lst2;
		//		lst2.next = lst3;
		//		lst3.next = lst4;
		//		lst4.next = lst5;
		//		lst5.next = lst6;
		//		lst6.next = lst7;
		//		lst7.next = lst8;
		//		lst8.next = lst9;
		//		LinkedList lstLstHead2 = null;
		LinkedList lstLstHead2 = new LinkedList(6);
		LinkedList lstL1 = new LinkedList(7);
		LinkedList lstL2= new LinkedList(9);
		LinkedList lstL3 = new LinkedList(1);
		LinkedList lstL4 = new LinkedList(8);

		lstLstHead2.next = lstL1;
		lstL1.next = lstL2;
		lstL2.next = lstL3;
		lstL3.next = lstL4;


		/*
		while(lst != null) {
			System.out.println("list1 -->  "+ lst.value + "  "+ lst);
			lst = lst.next;
		}

		while(lstLstHead2 != null) {
			System.out.println("list2 -->  "+ lstLstHead2.value + "  "+ lstLstHead2);
			lstLstHead2 = lstLstHead2.next;
		}
		 */

		LinkedList sumList = sumOfLinkedLists(lst, lstLstHead2 );
		while(sumList != null) {
			System.out.println("sumList -->  "+ sumList.value + "  "+ sumList);
			sumList = sumList.next;
		}
	}
}
