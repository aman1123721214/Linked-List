import java.util.HashMap;
class Node {
    int data;
    Node next, random;

    Node(int d)
    {
        data = d;
        next = random = null;

    }
}

class L27_Clone_a_LinkedList_with_Next_and_Random_Pointers {
    // Function to clone a linked list with next and random pointer.
    public static Node copyList(Node head) {
        // your code here
        HashMap<Node, Node> mp = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.data);
            mp.put(temp, newNode);
            temp = temp.next;
        }

        temp = head;
        Node head2 = null;
        while(temp!=null){
            Node newNode = mp.get(temp);
            if(temp==head)
                head2 = newNode;
            
            newNode.next = mp.get(temp.next);
            newNode.random = mp.get(temp.random);
            temp = temp.next;
        }
        return head2;
    }
}