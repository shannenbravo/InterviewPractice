//problem: given the head of a linked list, reverse the lonked list and return its new head 

public ListNode reverseList(ListNode head){

	//if head equals null or there is one item this means that there is nothing to reerse,
	//so retuen the head as is
	if(head.next = null || head == null){
		return head; 
	}

	ListNode tail = null; //a ponter to the behind the Node we are currently processing
	ListNode curr = head; //a pointer to the node we are currenty processing 
	ListNode lead = null; //a ppointer the the node in front of the current node 

	while(curr != null){
		lead = curr.next; //set the lead in to current next so we dont lose the node in front 
		curr.next = tail; // set the current node to the node behing us
		tail = curr; // move to the tail up to curr
		curr = lead; // set curr to the node that in "front"
	}

	head = tail; //now set head to the tail 
	return head; 
}
