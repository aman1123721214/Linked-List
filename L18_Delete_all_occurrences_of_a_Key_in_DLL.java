
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
    Node(int data, Node next, Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class L18_Delete_all_occurrences_of_a_Key_in_DLL {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Write your code here
        Node prevNode = null;
        Node temp = head;
        
        while(temp != null){
    
            if(temp.data == k){
                
                if(temp == head){
                    prevNode = head;
                    head = head.next;
                    prevNode.next = null;
                    if(head!=null) head.prev = null;
                    temp = head;
                    continue;
                }
                Node nextNode = null;
                nextNode = temp.next; 
                prevNode = temp.prev;
                if(nextNode != null)
                    nextNode.prev = prevNode;
                if(prevNode != null)
                    prevNode.next = nextNode;
                temp = temp.next;
            }
            else temp = temp.next;
        }
        return head;
    }
}