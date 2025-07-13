
class Node {
	public int data;
	public Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}


public class L11_Add_1_to_a_number_method_2t {

    public static int solve(Node temp){
        if(temp == null) return 1;

        int carry = solve(temp.next);
        temp.data = temp.data+carry;
        if(temp.data < 10) return 0;
        else temp.data = 0;
        return 1;
    }
	public static Node addOne(Node head) {
        int carry = solve(head);
        if(carry != 0){
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}