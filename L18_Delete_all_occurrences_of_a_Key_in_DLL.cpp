#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node {
public:
    int data;
    Node *prev;
    Node *next;
    Node() {
        this->data = 0;
        this->prev = NULL;
        this->next = NULL;
    }
    Node(int data) {
        this->data = data;
        this->prev = NULL;
        this->next = NULL;
    }
    Node (int data, Node *next, Node *prev) {
        this->data = data;
        this->prev = prev;
        this->next = next;
    }
};
Node * deleteAllOccurrences(Node* head, int k) {
    // Write your code here
    Node *prevNode = nullptr;
    Node *temp = head;
    
    while(temp != nullptr){

        if(temp->data == k){
            
            if(temp == head){
                prevNode = head;
                head = head->next;
                prevNode->next = nullptr;
                free(prevNode);
                if(head!=nullptr) head->prev = nullptr;
                temp = head;
                continue;
            }
            Node *nextNode = nullptr, *newNode = temp ;
            nextNode = temp->next; 
            prevNode = temp->prev;
            if(nextNode != nullptr)
                nextNode->prev = prevNode;
            if(prevNode != nullptr)
                prevNode->next = nextNode;
            temp = temp->next;
            free(newNode);
        }
        else temp = temp->next;
    }
    return head;
}
