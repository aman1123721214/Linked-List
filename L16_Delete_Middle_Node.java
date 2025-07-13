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
};

public class L16_Delete_Middle_Node {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        if(head.next == null) return null;
        Node slow = head;
        Node fast = head;
        Node prevNode = null;
        
        while(fast != null && fast.next != null){
            prevNode = slow;
            slow = slow.next;
            /*if(fast.next.next != null)*/fast = fast.next.next;
            //else return slow;
        }
        prevNode.next = slow.next;
        slow.next = null;
        return head;
    }
}