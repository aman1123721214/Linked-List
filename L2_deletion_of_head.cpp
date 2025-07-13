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
public:
    Node* constructLL(vector<int>& arr) {
    // Write your code here
        Node *head = new Node(arr[0]);
        Node *prev = head;

        for(int i = 1; i<arr.size(); i++){
            Node *temp = new Node(arr[i]);
            prev->next = temp;
            prev = temp;
        }
        return head;
    }

    Node* removeHead(Node* head){
        Node* temp = head;
        head = head->next;
        delete(temp);
        return head;
    }
};

int main(){
    int n; cin>>n;
    vector<int> arr(n);
    for(int i = 0; i<n; i++) cin>>arr[i];

    Solution obj;
    Node *y = obj.constructLL(arr);
    Node* head = y;
    Node *temp1 = y;
    while(temp1){
        cout<<temp1->data<<" ";
        temp1 = temp1->next;
    }

cout<<endl;
    Node* headRemoval = obj.removeHead(head);
    while(headRemoval){
        cout<<headRemoval->data<<" ";
        headRemoval = headRemoval->next;
    }
    return 0;
}
