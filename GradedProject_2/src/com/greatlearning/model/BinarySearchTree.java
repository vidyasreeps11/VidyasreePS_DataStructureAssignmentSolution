package com.greatlearning.model;

import com.greatlearning.main.SkewedTreeMain;
import com.greatlearning.service.SkewedTree;

public class BinarySearchTree {
	
	 BSTNode root;
	 BSTNode node1, node2;
	 SkewedTree st=new SkewedTree();

	public void SetValueToNodes()
	{
		root=new BSTNode(50);
		root.left=new BSTNode(30);
		root.right=new BSTNode(60);
		root.left.left=new BSTNode(10);
		root.right.left=new BSTNode(55);
	
		node1=st.RightSkewedTree(root);
		node2=st.RightSkewedTree(root.right);
		root.right=node2;
		BSTTraversal(node1);
	}
	
	public void BSTTraversal(BSTNode node)
	{
		if(node==null)
			return;
		System.out.print(node.value+" ");
		BSTTraversal(node.right);
		
	}
	
	
	
	
}
