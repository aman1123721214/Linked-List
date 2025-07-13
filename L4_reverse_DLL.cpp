#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node{
public:
    int data;
    Node *prev;
    Node *next;

    Node(int x){
        data = x;
        prev = NULL;
        next = NULL;
    }
};

// 1 --> 2 --> 3 --> 4 --> 5 -->6


class Solution{
public:
    Node *reverseDLL(Node *head){
        if(head == NULL || head->next == NULL) return head;
        Node *lastNode = nullptr;
        Node *curr = head;

        while(curr){
            lastNode = curr->prev;
            curr->prev = curr->next;
            curr->next = lastNode;
            curr = curr->prev;
        }
        return lastNode->prev;
    }

    Node *arrToDLL(vector<int> &arr){
        int n = arr.size();
        Node *head = new Node(arr[0]);
        Node *prevNode = head;
        for(int i = 1; i<n; i++){
            Node *newNode = new Node(arr[i]);
            prevNode->next = newNode;
            newNode->prev = prevNode;
            prevNode = prevNode->next;
        }
        return head;
    } 
};

int main(){
    vector<int> arr = {1, 2, 3, 4, 5};
    Solution obj;

    cout<<"DLL: ";
    Node *head = obj.arrToDLL(arr);
    // Node *temp1 = head;
    // while(temp1){
    //     cout<<temp1->data<<" ";
    //     temp1 = temp1->next;
    // }

    Node *temp2 = obj.reverseDLL(head);
    while(temp2){
        cout<<temp2->data<<" ";
        temp2 = temp2->next;
    }
    return 0;
}