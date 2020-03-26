import java.util.*;
public class LinkedList {
	private class Node {
		int data;
		Node next;
	}
	
	private int size;
	private Node head;
	private Node tail;
	
	public void display() throws Exception {
		if (this.size==0) {
			throw new Exception("Linked List Empty !");
		}
		
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(".");
	}
	
	public void addLast(int item) {
		Node nn = new Node();
		nn.next=null;
		nn.data=item;
		
		if(this.size>=1) {
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
		
		if (this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		
		
	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data=item;
		nn.next=null;
		if (this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		nn.next=head;
		this.head=nn;
		this.size++;
	}

	public void addAt(int item,int idx) throws Exception {
		if (idx<0 || idx>=this.size) {
			throw new Exception ("inavlid index");
		}
		
		Node nn = new Node();
		nn.next=null;
		nn.data=item;
		
		if (idx==0) {
			addFirst(item);
		}
		if (idx==this.size-1) {
			addLast(item);
		}
		
		Node temp = head;
		for (int i=1;i<idx;i++) {
			temp = temp.next;
		}
		nn.next=temp.next;
		temp.next=nn;
		this.size++;
	}

	public Node getNodeAt(int idx) throws Exception {
		if (this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		
		if (idx<0 || idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		Node temp = this.head;
		for(int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		return temp;
	}

	public int getFirst() throws Exception {
		if (this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		return this.head.data;
	}
	
	public int getlast() throws Exception{
		if (this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception{
		if (this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		
		if (idx<0 || idx>=this.size) {
			throw new Exception("Invalid index");
		}
		Node temp = this.head;
		for(int i=1;i<=idx;i++) {
			temp=temp.next;
		}
		return temp.data;
	}

	public int removeFirst() throws Exception{
		if (this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		int rv = this.head.data;
		if (this.size>1) {
			this.head=this.head.next;
		}
		if (this.size==0) {
			this.head=null;
		}
		this.size--;
		return rv;
	}
	
	public int removeLast() throws Exception{
		if (this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		int rv = this.tail.data;
		Node temp = this.head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		this.tail=temp;
		this.size--;
		return rv;
	}

	public int removeAt(int idx) throws Exception{
		if (this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		if (idx<0 || idx>=this.size) {
			throw new Exception("Invalid index");
		}
		if (idx==0) {
			return removeFirst();
		}
		if (idx==this.size-1) {
			return removeLast();
		}
		Node nm1 = getNodeAt(idx-1);
		Node n = nm1.next;
		Node np1 = n.next;
		
		nm1.next=np1;
		this.size--;
		
		return n.data;
	}

	public void reverseData() throws Exception {
		if (this.size==0) {
			throw new Exception ("Linked List is Empty");
		}
		int left = 0;
		int right = this.size-1;
		while (left<right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			int temp = ln.data;
			ln.data=rn.data;
			rn.data=temp;
			left--;
			right++;
		}
	}

	public void reversePointers() throws Exception {
		Node prev = this.head;
		Node curr = prev.next;
		while(curr!=null) {
			Node ahead=curr.next;
			curr.next=prev;
			prev=curr;
			curr=ahead;
		}
		
		//swap
		Node t = this.head;
		this.head=this.tail;
		this.tail=t;
		this.tail.next = null;
	}

	public int mid() {
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}

	
}
