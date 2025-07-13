#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node{
public:

    int data;
    Node *prev;
    Node *next;

    Node(){
        data = 0; prev = nullptr; next = nullptr;
    }

    Node(int x){
        data = x; prev = nullptr; next = nullptr;
    }

    Node(int x, Node *prv, Node *nxt){
        data = x; prev = prv; next = nxt;
    }
};

class Solution{
    public:
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
    Node *deleteNode(Node *head, int val){
        if(head->data == val){
            head = head->next;
            head->prev = nullptr;
            return head;
        }

        Node *temp = head;
        while(temp->next){
            if(temp->next->data == val){
                temp->next = temp->next->next;
                temp->next->next->prev = temp;
            }
            temp = temp->next;
        }
        return head;
    }
};

int main(){
    vector<int> arr = {1, 5, 10, 15, 20};
    Solution obj;
    Node *head = obj.arrToDLL(arr);
    // cout<<"DLL: ";
    // Node *temp = head;
    // while(temp){
    //     cout<<temp->data<<" ";
    //     temp = temp->next;
    // }
    // cout<<endl;

    // cout<<"deleteNode: ";
    // Node *temp2 = obj.deleteNode(head, 5);
    // while(temp2){
    //     cout<<temp2->data<<" ";
    //     temp2 = temp2->next;
    // }
}