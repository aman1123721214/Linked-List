
#include<bits/stdc++.h>
using namespace std;
class Node{
public:
    int data;
    Node *next;
    Node()
    {
        this->data = 0;
        next = NULL;
    }
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
    Node(int data, Node* next)
    {
        this->data = data;
        this->next = next;
    }
};
        

Node* reverseLinkedList(Node *head){
    // Write your code here
    if(!head->next) return head;

    Node *last = head;
    Node *curr = head->next;
    
}
