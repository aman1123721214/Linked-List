#include <bits/stdc++.h>
using namespace std;

template <typename T>
class Node {
    public:
    T data;
    Node* next;

    Node(T data) {
        next = NULL;
        this->data = data;
    }

    ~Node() {
        if (next != NULL) {
            delete next;
        }
    }
};
Node<int>* sortTwoLists(Node<int>* head1, Node<int>* head2){
    // Write your code here.
    Node<int>* dNode = new Node<int> (-1);
        Node<int>* temp = dNode;

        Node<int>* t1 = head1;
        Node<int>* t2 = head2;

        while(t1!=nullptr && t2!=nullptr){
            if(t1->data<=t2->data){
                temp->next = t1;
                temp = t1;
                t1 = t1->next;
                if(t1==nullptr){
                    temp->next = t2;
                    break;
                }
            }
            

            if(t2->data<=t1->data){
                temp->next = t2;
                temp = t2;
                t2 = t2->next;
                if(t2==nullptr){
                    temp->next = t1;
                    break;
                }
            }
        }
        return dNode->next;
}