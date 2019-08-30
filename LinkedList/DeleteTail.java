//problem: Given a linked list, write a method to delete its last node and
//return the head of he modified linked list 

//example: input: 1->2->3->4->5->null
//         outout:1->2->3->4->null

public ListNode deleteTail(ListNode head){
	//if the list is empty or there is one item in the list return null 
	if(head == null || head.next == null){
		return null; 
	}

	ListNode current = head; //temp pointer 

	//move to the seconed to last node 
	while(current.next.next != null){
		current = current.next; 
	}

	current.next = null; //set the sconed to last pointer = null, this deletes the last node
	return head; 
}
