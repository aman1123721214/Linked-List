import java.util.*;

class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
public class L10_Check_if_a_LinkedList_is_Palindrome_or_Not {
    public static Node reverseLinkedList(Node head){

        Node temp = head;  
        Node prev = null;  
        while(temp != null){  
            Node front = temp.next;  
            temp.next = prev;  
            prev = temp;  
            temp = front; 
        }
        return prev;  
    }

    public static boolean isPalindrome(Node head) {
        // write your code here
        if(head.next == null) return true;
        if(head.next.next == null){
            if(head.data == head.next.data) return true;
            return false;
        }

        Node slow = head, fast = head;
        while(fast.next.next != null){
            if(slow.next != null) slow = slow.next;
            if(fast.next.next != null) fast = fast.next.next;
        }

        Node revNode;
        if(fast.next!=null) revNode = reverseLinkedList(fast.next);
        else revNode = reverseLinkedList(fast.next);

        Node temp = head;
        while(temp!=null){
            if(temp.data != revNode.data) return false;
            
            temp = temp.next; 
            revNode = revNode.next;
            
            if(temp != null && revNode == null) return true;
        }
        return true;
    }
}