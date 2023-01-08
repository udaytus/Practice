package fifth;

import java.util.HashSet;

import fifth.LinkedList.Node;

public class RemoveDuplicatesLinkedList {
	static void removeDuplicate(Node head)
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            }
            else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

}
