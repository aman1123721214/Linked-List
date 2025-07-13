class Node{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class L21_Reverse_Nodes_in_K_Group_Size_of_LinkedList {
    public static Node reverseLinkedList(Node head){
        // Write your code here.
        if(head.next == null) return null;
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
        return head;
    }

    public static Node findkthNode(Node temp, int k){
        k--;
        while(temp != null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public static Node reverse(Node head, int k) {
        // Your code here
        Node temp = head;
        Node prevNode = null;
        
        while(temp != null){
            
            Node kthNode = findkthNode(temp, k);
            if(kthNode == null){
                if(prevNode != null) prevNode.next = kthNode;
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;
            kthNode = reverseLinkedList(temp);

            if(temp == head){
                head = kthNode;
            }
            else{
                prevNode.next = kthNode;
                temp.next = nextNode;
            }
        }
        return head;
    }
}