
class Node {
    public int data;
    public Node next;
    public Node child;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.child = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.child = null;
    }
    Node(int data, Node next, Node child)
    {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}
public class L24_Flattening_a_LinkedList {
    public static Node sortedMerge(Node head1, Node head2){
        Node dNode = new Node(-1);
        Node temp = dNode;

        Node t1 = head1;
        Node t2 = head2;

        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                temp.child = t1;
                temp = t1;
                t1 = t1.child;
                if(t1==null){
                    temp.child = t2;
                    break;
                }
            }
            

            if(t2.data<=t1.data){
                temp.child = t2;
                temp = t2;
                t2 = t2.child;
                if(t2==null){
                    temp.child = t1;
                    break;
                }
            }
        }
        return dNode.child;
    }

    public static Node flattenLinkedList(Node head) {
        //Write your code here
        if(head == null || head.next == null)
            return head;
        Node mergedHead = flattenLinkedList(head.next);
        return sortedMerge(mergedHead, head);
    }
}