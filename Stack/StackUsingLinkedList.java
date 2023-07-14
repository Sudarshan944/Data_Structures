package Stack;

import LinkedList.Node;

class Node{
	public Object item;
	public Node next; // pointing to next node
}
public class StackUsingLinkedList{
	private int size;
	private Node head;
	public StackUsingLinkedList(int size) {
		this.size=size;
		this.head=null;
	}
	public boolean isEmpty(){
		return head==null;
	}
	public boolean isFull(){
		Node current=head;
		int s=0;
		while(current!=null){
			s++;
			current=current.next;
		}
		return s==size;
	}
	public void push(Object i) {
		if(isFull()){
			System.out.println("Stack Overflow");
			return ;
		} else {
			Node node = new Node();
			node.item=i;
			node.next=head;
			head=node;
		}
	}
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return null;
		}else{
			Object val = head.item;
			head=head.next;
			return val;
		}
	}
	public void display() {
		if(head==null) {
			System.out.println("Stack is empty"); 
		}else {
			Node current=head;
			while(current!=null) {
				System.out.print(current.item+" ");
				current=current.next;
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList(3);
		s.push(5);
		s.push(4);
		s.push(3);
		s.display();
		s.pop();
		s.pop();
		s.display();
	}
}