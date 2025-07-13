#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node {
public:
    int data;
    Node *next;
    Node *child;
    Node() : data(0), next(nullptr), child(nullptr){};
    Node(int x) : data(x), next(nullptr), child(nullptr) {}
    Node(int x, Node *next, Node *child) : data(x), next(next), child(child) {}
};

Node *sortedMerge(Node *head1, Node *head2){
    Node *dNode = new Node(-1);
    Node *temp = dNode;

    Node *t1 = head1;
    Node *t2 = head2;

    while(t1!=nullptr && t2!=nullptr){
        if(t1->data<=t2->data){
            temp->child = t1;
            temp = t1;
            t1 = t1->child;
            if(t1==nullptr){
                temp->child = t2;
                break;
            }
        }
        

        if(t2->data<=t1->data){
            temp->child = t2;
            temp = t2;
            t2 = t2->child;
            if(t2==nullptr){
                temp->child = t1;
                break;
            }
        }
    }
    return dNode->child;
}
Node* flattenLinkedList(Node* head) 
{
	// Write your code here
	if(head == nullptr || head->next == nullptr)
		return head;
	Node *mergedHead = flattenLinkedList(head->next);
	return sortedMerge(mergedHead, head);
}
