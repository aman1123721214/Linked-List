import java.util.* ;
import java.io.*; 

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
    }
}
public class Solution {

    public static boolean findPair(Node<Integer> head, int k) {
        // Write your code here.
        vector<pair<int, int>> ans;
        Node *start = head, *end = head;
        
        while(end->next != nullptr){
            end = end->next;
        }

        while(start->data <end->data){
            if(start->data+end->data > k){
                end = end->prev;
            }
            else if(start->data+end->data<k){
                start = start->next;
            }
            else if(start->data+end->data == k){
                ans.push_back({start->data, end->data});
                end = end->prev;
                start = start->next;
            }
        }
        if(start->next == end && start->data+end->data == k){
            ans.push_back({start->data, end->data});
        }
        return ans;
    }

}
