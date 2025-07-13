#include<iostream>
#include<bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

}; 
int getMiddle(Node* head) {
    // code here
    if(head->next == nullptr) return head->data;
    Node *slow = head;
    Node *fast = head;
    
    while(fast->next != nullptr){
        slow = slow->next;
        if(fast->next->next != nullptr)fast = fast->next->next;
        else return slow->data;
    }       
    return slow->data;
}