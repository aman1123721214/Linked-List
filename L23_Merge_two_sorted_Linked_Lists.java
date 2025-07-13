class Node{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class L23_Merge_two_sorted_Linked_Lists {
    // Node sortedMerge(Node head1, Node head2) {
    //     // This is a "method-only" submission.
    //     if(head1 == null) return head2;
    //     if(head2 == null) return head1;
        
    //     Node newHead = null;
    //     if(head1.data<head2.data)
    //        newHead = head1;
    //     else newHead = head1;

    //     Node t1 = head1;
    //     Node t2 = head2;
    //     Node p1 = head1;
    //     Node p2 = head2;

    //     while(t1!=null && t2!=null){
    //         if(t1.data<=t2.data){
    //             while(t1.data<=t2.data){
    //                 p1 = t1;
    //                 t1 = t1.next;
    //             }
    //             p1.next = t2;
    //         }
    //         else{
    //             while(t2.data<=t1.data){
    //                 p2 = t2;
    //                 t2 = t2.next;
    //             }
    //             p2.next = t1;
    //         }
    //     }
    //     if(p1.next == null)
    //         p1.next = t2;
    //     if(p2.next == null)
    //         p2.next = t1;
    //     return newHead;
    // }
    Node sortedMerge(Node head1, Node head2){
        Node dNode = new Node(-1);
        Node temp = dNode;

        Node t1 = head1;
        Node t2 = head2;

        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
                if(t1==null){
                    temp.next = t2;
                    break;
                }
            }
            

            if(t2.data<=t1.data){
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
                if(t2==null){
                    temp.next = t1;
                    break;
                }
            }
        }
        return dNode.next;
    }
}