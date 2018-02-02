package EasyQuestions;

public class ReverseLinkedList {
	 public class ListNode {
	      int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
	 
	 public ListNode reverseList(ListNode head) {
		 ListNode prev= null;
		 while(head!=null){
			 ListNode next= head.next;
			 head.next=prev;
			 prev=head;
			 head=next;		 
		 }
		return prev;
	        
	    }
}
