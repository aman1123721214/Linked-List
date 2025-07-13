#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node {
public:
    int data;
    Node *next;

    Node(int data) {
        this->data = data;
        this->next = NULL;
    }
};

int lengthOfLoop(Node *head) {
    // Write your code here
    if(head->next == nullptr) return 0;
        Node *slow = head;
        Node *fast = head;
        int k = 0;
        while(fast->next != nullptr && fast->next->next != nullptr){
            slow = slow->next;
            fast = fast->next->next;
            if(slow == fast) {
                k++;
                slow = slow->next;
                break;
            }   //if cycle found
        }
        //if no cycle found and loop ends following the condition :
        //fast.next != null && fast.next.next != null
        if(fast->next == nullptr || fast->next->next == nullptr) return 0;   
        

        while(slow != fast){
            k++;
            slow = slow->next;
        }
        return k;
}
