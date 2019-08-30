//problem: given a linked list, check if the length of the list is even or odd
//		   an empty list has 0 nodes whixh makws its even 

public boolean evenOrOdd(Listnode head){
	
	//set a boolean = to ture, beacsue as it states in the problem if we have 0 nodes, 
	//we consider it even 
	boolean iseven = true; 
	
	//got thru the enrite list 
	While(head != null){
		iseven = !iseven; //when we encounter a new node negate the current value of or boolean.
						  // this way it will be ture on the even number and false on odd
		
		head= head.next;  //increment pointer 
	}

	return iseven; 
}
