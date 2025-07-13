class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class L13_Find_the_middle_element_of_the_LinkedList {
    int getMiddle(Node head) {
        // Your code here
        if(head.next == null) return head.data;
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null){
            slow = slow.next;
            if(fast.next.next != null)fast = fast.next.next;
            else return slow.data;
        }
        return slow.data;
    }
}