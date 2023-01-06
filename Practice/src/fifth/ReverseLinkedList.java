package fifth;



public class ReverseLinkedList {
	
	/**
	 * Definition for singly-linked list.
	 * public class LinkedList {
	 *     int val;
	 *     LinkedList next;
	 *     LinkedList() {}
	 *     LinkedList(int val) { this.val = val; }
	 *     LinkedList(int val, LinkedList next) { this.val = val; this.next = next; }
	 * }
	 */
	public LinkedList reverse(LinkedList head) {
		if(head==null||head.next==null) {
			return head;
		}
		LinkedList pointer = head;
		LinkedList previous= null,current=null;
		
		while(pointer!=null) {
			current =pointer;
			pointer=pointer.next;
			
			current.next=previous;
			previous = current;
			head = current;
		}
		return previous;
		
	}
}
