class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Solution{
    public int getCount(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}