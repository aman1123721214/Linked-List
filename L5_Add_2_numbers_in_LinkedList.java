
class LinkedListNode {
    int data;
    LinkedListNode next;
    
    public LinkedListNode(int data) {
        this.data = data;
    }
}


public class L5_Add_2_numbers_in_LinkedList {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        int n1=head1.data;
        int n2= head2.data;
        int carry = 0;
        LinkedListNode prevNode = new LinkedListNode((n1+n2+carry)%10);
        
        LinkedListNode head=prevNode;
        
        carry=(n1+n2)/10;
        LinkedListNode temp1= head1.next;
        LinkedListNode temp2=head2.next;
       
        while((temp1!=null) || (temp2!=null)){
            if (temp1!=null) n1=temp1.data;
            else n1=0;
            if (temp2 != null) n2= temp2.data;
            else n2= 0;
            
            LinkedListNode newNode= new LinkedListNode((n1+n2+carry)%10);
            carry=(n1+n2+carry)/10;
            
            prevNode.next=newNode;
            prevNode=prevNode.next;
            if(temp1!=null)
             temp1=temp1.next;
            if(temp2!=null)
             temp2=temp2.next;
        }
        
        if(carry !=0){
            LinkedListNode newNode=new LinkedListNode(carry);
            prevNode.next=newNode;
            prevNode=prevNode.next;
        }
        return head;
    }
}