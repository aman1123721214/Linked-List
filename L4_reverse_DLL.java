
 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 }

public class L4_reverse_DLL{
    public static Node reverseDLL(Node head){
        // Write your code here.
        if(head == null || head.next == null) return head;
         /*
         swap(a, b):=>swap(curr.prev, curr.next)
         temp = a; => lastNode = curr.prev;
         a = b;    => curr.prev =  curr.next;
         b = temp; => curr.next = lastNode
         */

        Node curr = head;
        Node lastNode = null;
        while(curr != null){
            lastNode = curr.prev;
            curr.prev = curr.next;
            curr.next = lastNode;
            curr = curr.prev;
        }
        return lastNode.prev;
    }
}
/*Node *reverseDLL(Node *head) {

  if (head == nullptr || head->next == nullptr)

    return head;

  Node *current = head;

  Node *last;

  while (current != nullptr) {

    last = current->prev;

    current->prev = current->next;

    current->next = last;

    current = current->prev;

  }

 

  return last->prev;

}*/