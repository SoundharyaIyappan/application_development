package dsapractice;
class Node{
	int data;
	Node next;
	
	Node(int val){
		data= val;
		next=null;
	}
	
	
	
	
	
	
}

class linkedlist{
	Node head;
	linkedlist(){
		head=null;
	}
	
	void insertatbeginning(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
		head=newnode;}
	}
	
	void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}
	
	
}

public class array {
	
	public static void main(String[] args) {
		linkedlist l1=new linkedlist();
		l1.insertatbeginning(9);
		l1.insertatbeginning(34);
		l1.display();
	}
	
	
	
	
	
}
