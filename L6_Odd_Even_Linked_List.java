class Node{
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
}


public class L6_Odd_Even_Linked_List {
    public static Node oddEvenList(Node head) {
        // Write your code here.
        if(head.next == null) return head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even.next != null){
            odd.next = even.next;
            even.next = even.next.next;
            if(odd.next != null) odd = odd.next;
            if(even.next != null) even = even.next;
        }

        odd.next = evenHead;
        if(even != null) even.next = null;
        return head;
    }
}