package sixth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ClosestNodeToGiven {

	
	public Node findNext(Node root,int key)
	{
		Queue queue = new LinkedList();
		ArrayList list = new ArrayList();
		int i =0;
	    if(root == null)
	        return null;

	    queue.clear();
	    queue.add(root);

	    while(!queue.isEmpty() )
	    {
	        Node node = (Node)queue.remove();
	        System.out.print(node.data + " ");
	        list.add(node);
	        if(node.left != null) queue.add(node.left);
	        if(node.right !=null) queue.add(node.right);            
	    }

	    Iterator iter = list.iterator();
	    while(iter.hasNext())
	        {
	            if(((Node)iter.next()).data == key)
	            {
	                return ((Node)iter.next());
	            }               
	        }

	    return null;
	}
}
