import java.util.*;
class checkBST{
	static int i=0;
	//int k=0;
	static int tempArr[]=new int[1000];
	static class Node{
		 int key;
		 Node left,right;
		 Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	static Node root;
	/*checkBST(){
		root=null;
	}*/
	/*void printA(){
		inorder();
		for (int j=0;j<i;j++) {
			System.out.println(tempArr[j]);
		}
	}*/
	/*void inorder() {
		inorderRec(root);
	}*/
	void inorder(Node root) {
		if(root==null){
			return;
		}
		//if(root!=null) {
			inorder(root.left);
			tempArr[i]=root.key;
			i++;
			//System.out.println(root.key);
			inorder(root.right);
		//}
	}
	boolean BST(){
		inorder(root);
		int k=1;
		for(int j=0;j<i;j++){
			if(tempArr[j]<tempArr[j+1])
				k++;
		}
		//System.out.println(k+" "+i);
		if(k==i)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		checkBST tree=new checkBST();
		tree.root=new Node(5);
		tree.root.left=new Node(2);
		tree.root.right=new Node(50);
		tree.root.left.left=new Node(1);
		tree.root.right.right=new Node(60);
		//tree.printA();
		if(tree.BST())
			System.out.println("This binary tree is a BST");
		else
			System.out.println("This binary tree is not a BST");
	}
}