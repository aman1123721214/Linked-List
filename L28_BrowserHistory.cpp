#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Node{
public:
    string str;
    Node* next;
    Node* prev;

    Node (string s){
        str = s;
        this->next = nullptr;
        this->prev = nullptr;
    }
};

class BrowserHistory {
public:
    Node* homeNode;
    Node* curr;
    // constructor to initialize object with homepage
    BrowserHistory(string homepage) {
        homeNode = new Node(homepage);
        curr = homeNode;
        curr->prev = nullptr;
    }
    
    // visit current url
    void visit(string url) {
        Node* newNode = new Node(url);
        newNode->prev = curr;
        curr->next = newNode;
        curr = curr->next;
    }
    
    // 'steps' move backward in history and return current page
    string back(int steps) {
        while(steps-- && curr->prev)
            curr = curr->prev;
        return curr->str;
    }
    
    // 'steps' move forward and return current page
    string forward(int steps) {
        while(steps-- && curr->next)
            curr = curr->next;
        return curr->str;
    }
};