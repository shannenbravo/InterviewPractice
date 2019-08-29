//problem: preform a pre order traversal (Root,Left,Right) of a bianry tree without using recursion

// example: 
//             1
//           /  \
//          2    3   
//         / \  / \
//        4  5 6   7       
//  output -> 145367

public ArrayList<Integer> preorderItr(TreeNode root){
	//if the root is equal to null return an empty arrayList because there is nothing to process
	if(root == null){
		return new ArrayList<>(); 
	}
	//an arraylist for the results 
	ArrayList<Integer> results = new ArrayList<>(); 
	//a stack to keep the nodes we need to process 
	Stack<TreeNode> stack = new Stack<>(); 
	
	//push the root onto the stack so that we can process that node 
	stack.push(root); 
	
	//while we still have nodes to process 
	while(!stack.isEmpty()){ 
		TreeNode parent = stack.pop(); 
		//add the value of the root into the arrayList
		results.add(parent.data); 

		//push the right child so we can process this node. we push it on frist beaucause we want to prcess that
		//node AFTER the left child, remember that a stack if F.I.L.O
		if(parent.right != null){
			stack.push(parent.right); 
		}

		//then we can push the left child onto the stack so we can process that node first 
		if(parent.left != null){
			stack.push(parent.left); 
		}
	}

	//return the result array
	return results; 


}
