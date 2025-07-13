
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

public class L9_Reverse_a_LinkedList{
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
}
