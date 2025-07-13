
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
class Node{
public:
    int data;
    Node *next;
    Node()
    {
        this->data = 0;
        next = NULL;
    }
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
    Node(int data, Node* next)
    {
        this->data = data;
        this->next = next;
    }
};
/* 
|---------|------------------------------|  -->1st-pass
    len1               len2

|------------------------|---------------|  -->2nd-pass
        len1                   len2

total length ie len1 + len2 = constant in both pass
*/
Node* findIntersection(Node *head1, Node *head2){
    //Write your code here
    Node *temp1 = head1;
    Node *temp2 = head2;

    bool round1 = false;
    bool round2 = false;

    while(temp1 != nullptr && temp2 != nullptr){
        //if node intersect
        if(temp1 == temp2) return temp1;

        if(temp1->next == nullptr && round1 == false){
            temp1 = head2;
            round1 = true;
        }
        else temp1 = temp1->next;

        if(temp2->next == nullptr && round2 == false){
            round2 = true;
            temp2 = head1;
        }
        else temp2 = temp2->next;
    }
    return nullptr;
}
