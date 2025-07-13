import java.util.*;
class Node{
    int data;
    Node next;

    Node(){
        this.data = 0;
        this.next = null;
    }

    Node(int x){
        this.data = x;
        this.next = null;
    }

    Node(int x, Node node){
        this.data = x;
        this.next = node;
    }
}

public class L2_deletion_of_head{
    public static Node printLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node (arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node (arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node removeHeaNode(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static void deleteTail(Node head){
        Node prev = head;
        while(head.next != null){
            prev = head;
            head = head.next;
        }
        prev.next = null;
    }

    public static Node deleteKthNode(Node head, int k){
        if(head == null) return head;
        if(k == 1){
            head = head.next;
            return head;
        }

        int count = 0;
        Node prev = null;
        Node temp = head;
        while(temp != null){
            count++;
            if(count%k == 0){
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    public static Node insertKthNode(Node head, int val, int k){
        if(head == null){
            head.data = val;
            return head;
        }

        int count = 1;
        Node temp = head;
        //Node prev = null;
        while(temp != null){
            if(count == k-1){
                Node newNode = new Node(val);
                //prev.next = newNode;
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            //prev = temp;
            temp = temp.next;
            count++;
        }
        return head;
    }

    public static Node insertTail(Node head, int val){
        Node newNode = new Node(val);
        if(head == null) return head;

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertBeforeElement(Node head, int val, int k){
        if(head == null){
            Node newNode = new Node(k);
            return newNode;
        }

        Node temp = head;
        while(temp != null){
            if(temp.next.data == val){
                Node newNode = new Node(k);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 6};
        Node head = constructLL(arr);
        Node temp1 = head;
        while(temp1 != null){
            System.out.print(temp1.data+" ");
            temp1 = temp1.next;
        }
System.out.println();

System.out.println("headRemoval");
        Node headRemoval = removeHeaNode(head);
        while(headRemoval != null){
            System.out.print(headRemoval.data+" ");
            headRemoval = headRemoval.next;
        }
System.out.println();
        
System.out.println("tailRemoval");

        deleteTail(head);
        Node temp2 = head;
        while(temp2 != null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.next;
        }
System.out.println();
        System.out.println("tailaddition");
        Node tailAddition = insertTail(head, 6);
        Node temp3 = head;
        while(temp3 != null){
            System.out.print(temp3.data+" ");
            temp3 = temp3.next;
        }
System.out.println();
System.out.println("insertKthNode: ");
        Node kthNode = insertKthNode(head, 03, 3);
        while(kthNode!=null){
            System.out.print(kthNode.data+" ");
            kthNode = kthNode.next;
        }

System.out.println();
System.out.println("insertBeforeElement: ");
        Node temp4 = insertBeforeElement(head, 4, 3);
        while(temp4 != null){
            System.out.print(temp4.data+" ");
            temp4 = temp4.next;
        }
    }
} 