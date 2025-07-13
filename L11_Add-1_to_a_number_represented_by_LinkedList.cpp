#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node {
public:
    int data;
    Node *next;
    Node() {
        this->data = 0;
        this->next = NULL;
    }
    Node(int data) {
        this->data = data;
        this->next = NULL;
    }
    Node (int data, Node *next) {
        this->data = data;
    }
};

Node *reverseLinkedList(Node *head){
    // Write your code here.
    if(head->next == nullptr) return head;
    Node *last = head;
    Node *curr = head->next;
    
    while(curr != nullptr){
        Node *front = curr->next;
        curr->next = last;
        if(last == head){
            last->next = nullptr;
            last = curr;
        }
        else last = curr;
        curr = front;
    }
    return last;
}
Node *addOne(Node *head){
    // Write Your Code Here.
    Node *temp = reverseLinkedList(head);
    Node *prevNode=new Node((temp->data+1)%10);

    int carry = (temp->data+1)/10;
    
    Node *revHead=prevNode;
    temp = temp->next;

    while(temp){
        Node *newNode=new Node((temp->data+carry)%10);
        carry=(temp->data+carry)/10;
        
        prevNode->next=newNode;
        prevNode=prevNode->next;
        if(temp!=NULL)
            temp=temp->next;
    }

    if(carry!=0){
        Node *newNode=new Node(carry);
        prevNode->next=newNode;
        prevNode =prevNode->next;
    }
    return reverseLinkedList(revHead);
}