package fifth;

public class LinkedList {
	 int val;
	 private Node head;
	 private Node tail;
	      LinkedList next;
	      
	      LinkedList(int val) { this.val = val; }
	      LinkedList(int val, LinkedList next) { this.val = val; this.next = next; }

	      public LinkedList(){
	          this.head = new Node("head");
	          tail = head;
	      }
	  
	      public Node head(){
	          return head;
	      }
	  
	      public void add(Node node){
	          tail.next = node;
	          tail = node;
	      }	  
	  public static class Node{
	        Node next;
	        String data;

	        public Node(String data){
	            this.data = data;
	        }
	     
	        public String data() {
	            return data;
	        }

	        public void setData(String data) {
	            this.data = data;
	        }

	        public Node next() {
	            return next;
	        }

	        public void setNext(Node next) {
	            this.next = next;
	        }
	     
	        public String toString(){
	            return this.data;
	        }
	    }
}

