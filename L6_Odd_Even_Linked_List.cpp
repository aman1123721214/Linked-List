//Following is the Linked list node structure already written

class Node{
public:
    int data;
    Node* next;
    Node(int data)
    { 
        this->data = data;
        this->next = nullptr;
    }
};

Node* oddEvenList(Node* head){
	// Write your code here.
    if(!head->next) return head;
    Node *odd = head;
    Node *even = head->next;
    Node *evenHead = even;

    while(even->next){
        odd->next = even->next;
        even->next = even->next->next;
        if(odd->next) odd = odd->next;
        if(even->next) even = even->next;
    }

    odd->next = evenHead;
    if(even) even->next = nullptr;
    return head;
}