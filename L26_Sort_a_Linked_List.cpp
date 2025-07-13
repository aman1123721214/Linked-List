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

class Solution{
public:
    // Function to sort the given linked list using Merge Sort.
    Node* findMidNode(Node* head){
        Node* slow = head;
        Node* fast = head->next;
        while(fast!=nullptr && fast->next!=nullptr){
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }

    Node* mergeTwoLL(Node* head1, Node* head2){
        Node* dNode = new Node(-1);
        Node* temp = dNode;

        Node* t1 = head1;
        Node* t2 = head2;

        while(t1!=nullptr && t2!=nullptr){
            if(t1->data<=t2->data){
                temp->next = t1;
                temp = t1;
                t1 = t1->next;
            }

            else{
                temp->next = t2;
                temp = t2;
                t2 = t2->next;
            }
        }
        if(t1!=nullptr) temp->next = t1;
        else temp->next = t2;
        return dNode->next;
    }
    Node* mergeSort(Node* head) {
        // add your code here
        if(head==nullptr || head->next==nullptr) 
            return head;
        Node* midNode = findMidNode(head);
        
        Node* rightNode = midNode->next;
        midNode->next = nullptr;
        Node* leftNode = head;

        leftNode = mergeSort(leftNode);
        rightNode = mergeSort(rightNode);

        return mergeTwoLL(leftNode, rightNode);
    }
};

int main(){
    Solution obj;
    Node* dNode = new Node(-1);
    Node* head = dNode;
    int n; cin>>n;
    
    for(int i = 0; i<n; i++){
        int num ;
        cin>>num;
        Node* temp = new Node(num);
        dNode->next = temp;
        dNode = temp;
    }
    
    Node* sortedNodes = obj.mergeSort(head->next);
    Node* temp = sortedNodes;
    while(temp!=nullptr){
        cout<<temp->data<<" ";
        temp = temp->next;
    }
    return 0;
}