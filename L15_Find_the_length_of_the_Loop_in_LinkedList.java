/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class L15_Find_the_length_of_the_Loop_in_LinkedList{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        if(head.next == null) return 0;
        Node slow = head;
        Node fast = head;
        int k = 0;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                k++;
                slow = slow.next;
                break;
            }   //if cycle found
        }
        //if no cycle found and loop ends following the condition :
        //fast.next != null && fast.next.next != null
        if(fast.next == null || fast.next.next == null) return 0;   
        

        while(slow != fast){
            k++;
            slow = slow.next;
        }
        return k;
    }
}