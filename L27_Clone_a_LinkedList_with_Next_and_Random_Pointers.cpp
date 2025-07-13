#include<iostream>
#include<bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node *next;
    Node *random;

    Node(int x) {
        data = x;
        next = NULL;
        random = NULL;
    }
};

// class Solution {
//   public:
//     Node *copyList(Node *head) {
//         // Write your code here
//         map<Node*, Node*> mp;
//         Node* temp = head;
//         while(temp){
//             Node* copyNode = new Node(temp->data);
//             mp[temp] = copyNode;
//             temp = temp->next;
//         }
         
//         temp = head;
//         Node* head2 = nullptr;
//         while(temp){
//             Node* newNode = mp[temp];
//             if(temp == head)
//                 head2 = newNode;

//             newNode->next = mp[temp->next];
//             newNode->random = mp[temp->random];
//             temp = temp->next; 
//         }
//         return head2;
//     }
// };

/********************** METHOD 2 ************************* */

class Solution {
  public:
    Node *copyList(Node *head) {
        // Write your code here
        Node* temp1 = head;

//inserting the copyNode between the two given nodes
        while(temp1){
            Node* copyNode = new Node(temp1->data);
            copyNode->next = temp1->next;
            temp1->next = copyNode;
            temp1 = temp1->next->next;
        }

//alloting the random pointers to the copyNodes
        temp1 = head;
        while(temp1){
            Node* copyNode = temp1->next;
            if(temp1->random)
            copyNode->random = temp1->random->next;
            else copyNode->random = nullptr;
            temp1 = temp1->next->next;
        }

//taking the dummyNode and making the new linkedList
        Node* dNode = new Node(-1);
        Node* temp2 = dNode;
        temp1 = head;
        while(temp1){
            temp2->next = temp1->next;
            temp1->next = temp1->next->next;
            temp2 = temp2->next;           
            temp1 = temp1->next;
        }

        return dNode->next; 
    }
};