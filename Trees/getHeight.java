//problem: the height of the tree is defined to be the number
//of nodes along the longest path from the root to any leaf node wtite 
// a function to find the height of a binary tree 

public int getHeight(TreeNode root){
	//base case 
	if(root == null){

		return 0; 
	}
	//the recusive case. 
	//it adds the current root, then it adds the max for the left and right subtree
	return 1 + Math.max(getHeight(root.left), getHeight(root.right))
}
