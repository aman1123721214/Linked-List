#include<iostream>
#include<bits/stdc++.h>
using namespace std;
class Node{
public:
    int data;
    Node *next;

    Node(){
        this->data = 0;
        this->next = nullptr;
    }

    Node(int x){
        this->data = x;
        this->next = nullptr;
    }

    Node (int data, Node *next) {
        this->data = data;
        this->next = next;
    }
};

class Solution{
public:
    Node *addTwoNumbers(Node *num1, Node *num2){
        Node *temp1=num1, *temp2=num2;
        int n1=temp1->data, n2=temp2->data;
        Node *prevNode=new Node((n1+n2)%10);
        Node *head=prevNode;
        int carry=(n1+n2)/10;
        temp1=temp1->next, temp2=temp2->next;
        
        while((temp1!=NULL) || (temp2 != NULL)){
            if(temp1!=NULL) n1=temp1->data;
            else n1=0;
            if(temp2!=0) n2=temp2->data;
            else n2=0;
            
            Node *newNode=new Node((n1+n2+carry)%10);
            carry=(n1+n2+carry)/10;
            
            prevNode->next=newNode;
            prevNode=prevNode->next;
            if(temp1!=NULL)
            temp1=temp1->next;
            if(temp2!=NULL)
            temp2=temp2->next;
        }
        
        if(carry!=0){
            Node *newNode=new Node(carry);
            prevNode->next=newNode;
            prevNode =prevNode->next;
        }
        return head;
    }
};