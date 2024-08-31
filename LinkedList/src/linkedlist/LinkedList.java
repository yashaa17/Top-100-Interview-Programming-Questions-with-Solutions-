package linkedlist;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void  insertData(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}
	
	public void displayList() {
		if(head == null) {
			System.out.println("list is empty");
		}
		Node temp = head;
		while(temp.getNext() != null ) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	
}
