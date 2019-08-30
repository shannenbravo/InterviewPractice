public ListNode deleteHeadCircular(ListNode head){
	//if the list is empty or there is only one node in the list, return null 
	if(head == null || head.next == null){
		return null; 
	}

	ListNode current = head; // a tempt pointer to the head

	//move to the node behinf the head 
	while(current.next != head){
		current = current.next; 
	}

	head = head.next; //move the head up 
	current.next = head; //set the node behind the former head equal to the new head 
	return head; //return the list
}
