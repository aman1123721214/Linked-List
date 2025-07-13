#include<iostream>
#include<bits/stdc++.h>
using namespace std;

/********************************************** coding ninja ************************************************ */
// class Node{
//     public:
//         int data;
//         Node *next;
//         Node (): data(0), next(nullptr){}
//         Node (int x): data(x), next(nullptr){}
//         Node(int x, Node *next): data(x), next(next){}
// };

// Node* constructLL(vector<int>& arr) {
//     // Write your code here
//     Node *head = new Node(arr[0]);
//     Node *prev = head;

//     for(int i = 1; i<arr.size(); i++){
//          Node *temp = new Node(arr[i]);
//          prev->next = temp;
//          prev = temp;
//     }
//     return head;
// }

/************************************************ GFG ********************************************************* */
// class Node {
// public:
//     int data;
//     Node *next;
    
//     Node(){
//         data = 0;
//         next = NULL;
//     }

//     Node (int x){
//         this->data = x;
//         this->next = NULL;
//     }
// };

// class Solution {
//   public:
//     Node* constructLL(vector<int>& arr) {
//         // code here
//         Node *head = new Node (arr[0]);
//         Node *prev = head;

//         for(int i = 1; i<arr.size(); i++){
//             Node *temp = new Node(arr[i]);
//             prev->next = temp;
//             prev = temp;
//         }
//         return head;
//     }
// };

/*************************************************** MAIN ************************************************************** */
// int main(){
//     int n; cin>>n;
//     vector<int> arr(n);
//     for(int i = 0; i<n; i++) cin>>arr[i];

//     Solution obj;
//     Node *y = obj.constructLL(arr);
//     Node *temp = y;
//     while(temp){
//         cout<<temp->data<<" ";
//         temp = temp->next;
//     }
//     return 0;
// }
