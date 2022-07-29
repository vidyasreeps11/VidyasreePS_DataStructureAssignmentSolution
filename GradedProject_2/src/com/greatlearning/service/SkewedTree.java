package com.greatlearning.service;

import com.greatlearning.model.BSTNode;

public class SkewedTree {
	
	BSTNode root;
	public BSTNode RightSkewedTree(BSTNode node)
	{
		BSTNode previousNode=node;
		BSTNode currentNode=node.left;
		
		while(currentNode!=null)
		{
			currentNode.right=previousNode;
			previousNode=currentNode;
			currentNode=currentNode.left;
		}
		root=previousNode;
		
		return root;
	}

}
