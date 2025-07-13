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
public class L22_Rotate_a_LinkedList_right_shift {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        Node temp = head.next;
        while((k--) != 1)
            temp = temp.next;

        Node newNode = temp.next;
        temp.next = null;
        temp = newNode;
        while(temp.next != null)
            temp = temp.next;
        
        temp.next = head;
        return newNode;
    }
}