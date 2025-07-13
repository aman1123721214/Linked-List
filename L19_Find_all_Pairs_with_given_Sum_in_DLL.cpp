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
        this -> data = data;
        this -> prev = prev;
        this -> next = next;
    }
};
// 1 <-> 2 <-> 3 <-> 4 <-> 9
vector<pair<int, int>> findPairs(Node* head, int k){
    // Write your code here.
    
    vector<pair<int, int>> ans;
    Node *start = head, *end = head;
    
    while(end->next != nullptr){
        end = end->next;
    }

    while(start->data <end->data){
        if(start->data+end->data > k){
            end = end->prev;
        }
        else if(start->data+end->data<k){
            start = start->next;
        }
        else if(start->data+end->data == k){
            ans.push_back({start->data, end->data});
            end = end->prev;
            start = start->next;
        }
    }
    if(start->next == end && start->data+end->data == k){
        ans.push_back({start->data, end->data});
    }
    return ans;
}
