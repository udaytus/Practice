package fifth;

import fifth.LinkedList.Node;

public class CheckLoopInLinkedList {
//	public static class Node {
//        private Node next;
//        private String data;
//
//        public Node(String data) {
//            this.data = data;
//        }
//
//        public String data() { return data; }
//        public void setData(String data) { this.data = data;}
//
//        public Node next() { return next; }
//        public void setNext(Node next) { this.next = next; }
//
//        @Override
//        public String toString() {
//            return this.data;
//        }
//    }
//	public class LinkedList {
//	    private Node head;
//	    public LinkedList() { this.head = new Node("head"); }   
//	    public Node head() { return head;}
//	   
//	    public void appendIntoTail(Node node) {
//	        Node current = head;
//	       
//	        //find last element of LinkedList i.e. tail
//	        while(current.next() != null){
//	            current = current.next();
//	        }
//	        //appending new node to tail in LinkedList
//	        current.setNext(node);
//	    }
public boolean cyclic(Node head) {
Node fast=head;
Node slow=head;
 while(fast!=null && fast.next!=null) {
	 fast=fast.next.next;
	 slow=slow.next;
	 
	 if(fast==slow) {
		 return true;
	 }
 }
 return false;
}
}