package EasyQuestions;

public class DeleteNodeInLinkedlist {
	
	 public void deleteNode(ListNode node) {
	        if (node!=null && node.next!=null){
	            node.val=node.next.val;
	            node.next=node.next.next;
	        }
	        else{
	            node=null;
	        }
	        
	    }
	public class ListNode {
	      int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
	
}
