package com.crackthatcd.learning.dataStructure;

public class BoundaryTraversalBt {

	
	private static void boundaryTraverse(BtNode head)
	{
		
		if(head!=null)
		{
			BtNode nLeft=head;
			System.out.println(head.data);
			
			//print leftmost tree
			while(nLeft.left!=null)
			{
				if(!isLeafNode(nLeft.left))
					System.out.println(nLeft.left.data);
				nLeft=nLeft.left;
			}
			
			//printing leaf nodes		
			printLeaf(head);			
			
			//printing rightmost tree
			BtNode nRight=head;
			while(nRight.right!=null)
			{
				if(!isLeafNode(nRight.right))
					System.out.println(nRight.right.data);
				nRight=nRight.right;
			}
			
			
		}
		else
			return;
	}
	
	private static boolean isLeafNode(BtNode node)
	{
		return (node.left==null && node.right==null);
		
	}
	
	private static void printLeaf(BtNode head) {
		if(head==null)
		return;
		if(head.left==null && head.right==null)
			System.out.println(head.data);
		else {
			printLeaf(head.left);
			printLeaf(head.right);
			
		}
			
		
	}
	
	
	public static void main(String[] args) {
		
		
		BinaryTree bt= new BinaryTree();
		bt.root= new BtNode(20);
		bt.root.left= new BtNode(8);
		bt.root.right= new BtNode(22);
		bt.root.left.left= new BtNode(4);
		bt.root.left.right= new BtNode(12);
		bt.root.left.right.left= new BtNode(10);
		bt.root.left.right.right= new BtNode(14);
		bt.root.right.right= new BtNode(25);
		
		boundaryTraverse(bt.root);
		
	}


	

}

class BinaryTree{
	
	BtNode root;
	
}


 class BtNode{

	 BtNode left;
	 BtNode right;
	 int data;
	 
	 public BtNode() {
		// TODO Auto-generated constructor stub
	}

	public BtNode( int data) {
		super();
		this.left = null;
		this.right = null;
		this.data = data;
	}
	 	
	 
 }