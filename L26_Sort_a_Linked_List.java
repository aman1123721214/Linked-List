import java.util.*;

class Node{
int data;
Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class L26_Sort_a_Linked_List {
    // Function to sort the given linked list using Merge Sort.
    public static Node findMidNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node mergeTwoLL(Node head1, Node head2){
        Node dNode = new Node(-1);
        Node temp = dNode;

        Node t1 = head1;
        Node t2 = head2;

        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }

            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null) temp.next = t1;
        else temp.next = t2;
        return dNode.next;
    }
    public static Node mergeSort(Node head) {
        // add your code here
        if(head==null || head.next==null) 
            return head;
        Node midNode = findMidNode(head);
        
        Node rightNode = midNode.next;
        midNode.next = null;
        Node leftNode = head;

        leftNode = mergeSort(leftNode);
        rightNode = mergeSort(rightNode);

        return mergeTwoLL(leftNode, rightNode);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        Node dNode = new Node(-1);
        Node head = dNode;
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            Node temp = new Node(num);
            dNode.next = temp;
            dNode = temp;
        }
        
        Node sortedNodes = mergeSort(head.next);
        Node temp = sortedNodes;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}