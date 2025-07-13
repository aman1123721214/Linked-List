// #include<iostream>
// #include<bits/stdc++.h>
// using namespace std;

// class Node {
// public:
//     int data;
//     Node *next;
//     Node *child;
//     Node() : data(0), next(nullptr), child(nullptr){};
//     Node(int x) : data(x), next(nullptr), child(nullptr) {}
//     Node(int x, Node *next, Node *child) : data(x), next(next), child(child) {}
// };

// Node *sortedMerge(Node *head1, Node *head2){
//     Node *dNode = new Node(-1);
//     Node *temp = dNode;

//     Node *t1 = head1;
//     Node *t2 = head2;

//     while(t1!=nullptr && t2!=nullptr){
//         if(t1->data<=t2->data){
//             temp->child = t1;
//             temp = t1;
//             t1 = t1->child;
//             if(t1==nullptr){
//                 temp->child = t2;
//                 break;
//             }
//         }
        

//         if(t2->data<=t1->data){
//             temp->child = t2;
//             temp = t2;
//             t2 = t2->child;
//             if(t2==nullptr){
//                 temp->child = t1;
//                 break;
//             }
//         }
//     }
//     return dNode->child;
// }

//method-1
/*Node* flattenLinkedList(Node* head) {
	// Write your code here
	Node *node = head;
    Node *temp = head->next;
    while(temp != nullptr){
        node = sortedMerge(node, temp);
        temp = temp->next;
    }
    return node;
}*/

/*Node* flattenLinkedList(Node* head) {
	// Write your code here
	priority_queue<pair<int, Node*>> pq;
    Node* temp = head;
    while(temp){
        Node* down = temp;
        while(down){
            pq.push({down->data, down});
            down = down->child;
        }
        temp = temp->next;
    }

    Node *dNode = new Node(-1);
    temp = dNode;

    while(!pq.empty()){
        pair<int, Node*> p = pq.top();
        pq.pop();
        temp->child = p.second;
        
        if(p.second->next){
            pq.push({p.second->data, p.second->next});
        }
        temp = temp->child;
    }
    return dNode->child;
}*/