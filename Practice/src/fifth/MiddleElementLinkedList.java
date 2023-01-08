package fifth;



public class MiddleElementLinkedList {
	public void middle(Node head) {
		LinkedList.Node current = head;
	      int length = 0;
	      LinkedList.Node middle = head;
  
     while(current.next() != null){
         length++;
         if(length%2 ==0){
             middle = middle.next();
         }
         current = current.next();
     }
   
     if(length%2 == 1){
         middle = middle.next();
     }


}
}
