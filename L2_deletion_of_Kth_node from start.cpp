#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node{
public:
    int data;
    Node *next;

    Node(){
        this->data = 0;
        this->next= nullptr;
    }

    Node(int x){
        this->data = x;
        this->next = nullptr;
    }

    Node(int x, Node* node){
        this->data = x;
        this->next = node;
    }
};

class Solution{
    /*You are required to complete this method*/
    Node* deleteK(Node *head, int k) {
        // Your code here
        if(head == NULL) return head;
        if(k == 1){
            Node* temp = head;
            head = head->next;
            delete(temp);
            return head;
        }
        int count = 0;
        Node *prev = NULL;
        Node *temp = head;
        while(temp){
            count++;
            if(count == k){
                prev->next = temp->next;
                temp->next = nullptr;
                delete(temp); 
                break;
            }
            prev = temp;
            temp = temp->next;
        }
        return head;
    }
};