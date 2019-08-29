//problem: Given the root of a Binary Tree, determine if it is a Binary Search Tree 

public boolean validateBST(TreeNode root){
	//call our recusive helper function 
	return helper(root, Integer.MIN_VALUE, Integer.MIN_VALUE); 
}


//a helper function so we can use recursion 
pubic boolean helper(TreeNode root, int min, int max){

	//if we have gotten to the the end of the tree without returning false return true 
	if(root == null){
		return true;
	}
	//if this left node is bigger than the privous left node 
	//or this right node is smaller than the privous right node 
	//it is not a BST so return false 
	if(root.data <= min || root.data >= max){
		return false; 
	}

	return helper(root.left, min, root.data) //the next left node cannto be bigger than the previous node
		   && helper(root.right, min, root.right); // the right node cannot be small than the previous node


}
