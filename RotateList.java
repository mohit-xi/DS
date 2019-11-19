import java.util.*;
public class RotateList{
    Node head;
	class Node{
	    int data;
		Node next;
    }
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void rotate(int k){
		Node n=head;
		int i=0;
		Node prev=null;
		while(i<k)
			while(n.next!=null){
				prev=n;
				n=n.next;
			}
			prev.next=null;
			n.next=head.next;
			head=n;
	}
	public void show() {
		Node a=head;
		while(a.next!=null) {
			System.out.println(a.data);
			a=a.next;
		}
		System.out.println(a.data);
		
	}
	public static void main(String args[]) {
		RotateList l=new RotateList();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.insert(8);
		l.rotate(4);
		l.show();
	}
}
