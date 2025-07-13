class Node{
    int data;
    Node prev;
    Node next;

    Node(){
        data = 0;
        prev = null;
        next = null;
    }

    Node(int x){
        data = x;
        prev = null;
        next = null;
    }

    Node(int x, Node prv, Node nxt){
        data = x;
        prev = prv;
        next = nxt;
    }
}

class L3_doubly_LL{ 
    public static Node arrToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prevNode = head;
        for(int i = 1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            prevNode.next = newNode;
            newNode.prev = prevNode;
            prevNode = prevNode.next;
        }
        return head;
    }

    public static Node deleteNode(Node head, int val){
        if(head.data == val){
            head = head.next;
            head.prev = null;
            return head;
        }

        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == val){
                temp.next = temp.next.next;
                temp.next.next.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 15, 20};

        System.out.println();
        System.out.print("DLL: ");
        Node head = arrToDLL(arr);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
        System.out.print("deleteNode: ");
        // Node temp2 = head;
        Node temp2 = deleteNode(head, 5);
        while(temp2 !=  null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.next;
        }
    }
}