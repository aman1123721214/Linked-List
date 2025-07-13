import java.util.* ;
import java.io.*; 

class Node {
	public int data;
	public Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class L11_Add_1_to_a_number_represented_by_LinkedList {

    public static Node reverseLinkedList(Node head){
        // Write your code here.
        if(head.next == null) return head;
        Node last = head;
        Node curr = head.next;
        
        while(curr != null){
            Node front = curr.next;
            curr.next = last;
            if(last == head){
                last.next = null;
                last = curr;
            }
            else last = curr;
            curr = front;
        }
        return last;
    }
    
	public static Node addOne(Node head) {
		// Write your code here.
        Node temp = reverseLinkedList(head);
        Node prevNode=new Node((temp.data+1)%10);

        int carry = (temp.data+1)/10;
        
        Node revHead=prevNode;
        temp = temp.next;

        while(temp != null){
            Node newNode=new Node((temp.data+carry)%10);
            carry=(temp.data+carry)/10;
            
            prevNode.next=newNode;
            prevNode=prevNode.next;
            if(temp!=null)
                temp=temp.next;
        }

        if(carry!=0){
            Node newNode=new Node(carry);
            prevNode.next=newNode;
            prevNode =prevNode.next;
        }
        return reverseLinkedList(revHead);
	}
}