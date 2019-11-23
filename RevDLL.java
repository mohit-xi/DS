import java.util.*;
class RevDLL{
static Node head;
static class Node{
int data;
Node next;
Node prev;
Node(int data){
this.data=data;
}
}
public static RevDLL insert(RevDLL li,int data){
Node newnode=new Node(data);
newnode.next=null;
if(li.head==null){
li.head=newnode;
newnode.next=null;
newnode.prev=null;
}
else{
Node last=li.head;
while(last.next!=null){
last=last.next;
}
last.next=newnode;
newnode.prev=last;
newnode.next=null;
}
return li;
}
public static void display (RevDLL li){
if(li.head==null)
System.out.println("Invalid");
else{
Node current=li.head;
while(current.next!=null){
current=current.next;
}
while(current!=li.head){
System.out.print(current.data+" ");
current=current.prev;
}
System.out.print(current.data+" ");
}
}
public static void main(String[] args){
RevDLL li=new RevDLL();
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int n=sc.nextInt();
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
insert(li, sc.nextInt());
}
li.display(li);
}
}