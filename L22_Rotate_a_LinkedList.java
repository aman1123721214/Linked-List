
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class L22_Rotate_a_LinkedList {
    // Function to rotate a linked list.

    // public static Node reverseLinkedList(Node head){
    //     // Write your code here.
    //     if(head.next == null) return head;
    //     Node last = head;
    //     Node curr = head.next;
        
    //     while(curr != null){
    //         Node front = curr.next;
    //         curr.next = last;
    //         if(last == head){
    //             last.next = null;
    //             last = curr;
    //         }
    //         else last = curr;
    //         curr = front;
    //     }
    //     return last;
    // }

    // public Node rotate(Node head, int k) {
    //     // add code here
    //     Node startNode = head;
    //     Node temp = head;
    //     Node nextNode = head.next;
    //     Node prevNode = null;
    //     int count = 1;
        
    //     while(count<=k){
    //         temp.next = prevNode;
    //         prevNode = temp;
    //         temp = nextNode;
    //         if(temp == null)
    //             return reverseLinkedList(prevNode);
    //         nextNode = nextNode.next;
    //         count++;
    //     }
        
        
    //     Node prev2Node = null;
    //     while(nextNode!=null){
    //         temp.next = prev2Node;
    //         prev2Node = temp;
    //         temp = nextNode;
    //         nextNode = nextNode.next;
    //     }
        
    //     temp.next = prev2Node;
    //     startNode.next = temp;
    //     return reverseLinkedList(prevNode);
    // }
    public Node rotate(Node head, int k){
        // add code here
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        
        temp.next = head;
        while((k--)!=1)
            head = head.next;
        
        Node newHead = head.next;
        head.next = null;
        return newHead;
    }
    
}