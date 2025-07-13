// #include<iostream>
// #include<bits/stdc++.h>
// using namespace std;
// struct Node {
//     int data;
//     Node *next;
//     Node(int x){
//         data = x;
//         next = nullptr;
//     }
// };

// bool searchKey(int n, struct Node* head, int key) {
//     // Code here
//     Node *temp = head;
//     while(temp){
//         if(temp->data == key) return 1;
//         temp = temp->next;
//     }
//     return 0;
// }

// int main(){
//     int t; cin>>t;
//     while(t--){
//         int n; cin>>n;
//         int data;
//         cin>>data;
//         Node *head = new Node (data);
//         Node *tail = head;
//         while(n--){
//             int data; cin>>data;
//             tail->next = new Node(data);
//             tail = tail->next;
//         }
//     }
//     int key; cin>>key;

// }