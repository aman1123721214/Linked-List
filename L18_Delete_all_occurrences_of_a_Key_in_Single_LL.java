class Node{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class L18_Delete_all_occurrences_of_a_Key_in_Single_LL{
    public static Node deleteAllOccurances(Node head, int k){
        // Your code here
        Node prevNode = null;
        Node temp = head;

        while(temp != null){
            
            if(temp.data == k){
                if(temp == head){
                    temp = temp.next;
                    //Node newNode = head;
                    head = head.next;
                    //newNode.next = null;
                    continue;
                }
                Node newNode = null;
                if(temp.next != null)
                    newNode = temp.next;
                else{ 
                    prevNode.next = null;
                    break;
                }
                prevNode.next = newNode;
                temp.next = null;
                temp = newNode;
            }
        }
        return head;
    }
}