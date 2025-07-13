class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
};
public class L20_Remove_duplicates_from_sorted_DLL {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        Node temp = head;
        Node temp2 = head.next;
        while(temp2 != null){
            if(temp2.data == temp.data){
                while(temp2.data == temp.data){
                    if(temp2.next == null){
                        temp.next.prev = null;
                        temp.next = null;
                        break;
                    } 
                    temp2 = temp2.next;
                    continue;
                }
                if(temp.next == null) break;
                temp.next = temp2;
                temp2.prev = temp;
                temp = temp.next;
                temp2 = temp2.next;
            }
            else{
                temp = temp.next; 
                temp2 = temp2.next;
            }
        }
        return head;
    }
}