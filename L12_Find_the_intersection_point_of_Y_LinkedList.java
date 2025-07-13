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
}

/* 
|---------|------------------------------|  -->1st-pass
    len1               len2

|------------------------|---------------|  -->2nd-pass
        len1                   len2

total length ie len1 + len2 = constant in both pass
*/
public class L12_Find_the_intersection_point_of_Y_LinkedList {
    public static int findIntersection(Node head1, Node head2) {
        //Write your code here
        Node temp1 = head1;
        Node temp2 = head2;

        boolean round1 = false;
        boolean round2 = false;

        while(temp1 != null && temp2 != null){
            //if node intersect
            if(temp1 == temp2) return temp1.data;

            if(temp1.next == null && round1 == false){
                temp1 = head2;
                round1 = true;
            }
            else temp1 = temp1.next;

            if(temp2.next == null && round2 == false){
                round2 = true;
                temp2 = head1;
            }
            else temp2 = temp2.next;
        }
        return -1;
    }
}